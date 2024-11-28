package org.msp.quaoar.api;

import org.msp.quaoar.api.model.Authentication;
import org.msp.quaoar.dao.*;
import org.msp.quaoar.domain.Account;
import org.msp.quaoar.domain.AccountRole;
import org.msp.quaoar.domain.Authentification;
import org.msp.quaoar.api.model.ResultDto;
import org.msp.quaoar.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class CreateAccountApiDelegateImpl implements CreateAccountApiDelegate {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    AuthentificationRepository authentificationRepository;

    @Autowired
    MemberRepository memberRepository;

    @Override
    public ResponseEntity<ResultDto>  createAccountPost(Authentication authentication) {

        getRequest().ifPresent(request -> {
            for (MediaType mediaType :
                    MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : 0, \"token\" : \"token\" }";
                    ApiUtil.setExampleResponse(request, "application/json",
                            exampleString);

                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"url\" : \"url\" }";
                    ApiUtil.setExampleResponse(request, "application/json",
                            exampleString);

                    break;
                }
            }
        });
        return new ResponseEntity<>(saveTheNewAccount(authentication.getUsername(), authentication.getPassword()), HttpStatus.OK);
//        return new ResponseEntity<>(HttpStatus.OK);
    }

    private ResultDto saveTheNewAccount(String email, String pwd){
        ResultDto resultDto = new ResultDto();
        Member member = memberRepository.getMemberFromEmail(email);
        //premièrement, un membre
        if (member == null) {
            System.out.println("--- On doit créer un nouveau membre");
            member = new Member();
            member.setEmail(email);
            System.out.println("--- membre.email : " + member.getEmail());
//            member.setAccountRole(AccountRole.OWNER);
            member = memberRepository.save(member);
            System.out.println("--> On a créé un nouveau membre " + member.getId());

            //second, l'authentification
            Authentification auth = new Authentification(member, pwd);
            auth = authentificationRepository.save(auth);
            System.out.println("--> On a créé un nouveau authentification " + auth.getId());

            //trois, le compte
            Account account = new Account();
            account.addMember(member);

            account = accountRepository.save(account);
            member.setAccount(account);
            member = memberRepository.save(member);
            System.out.println("On a créé un nouveau compte " + account.getId());
            System.out.println("On a créé un nouveau membre pour le compte " + member.getAccount().getId());

            resultDto.setTopic("Account creation");
            resultDto.setCode("01");
            resultDto.setMessage("account id " + account.getId() + " created with success");

        } else {
            resultDto.setTopic("Account creation");
            resultDto.setCode("10");
            //TODO : utiliser le Member pour avoir un message plus precis
            resultDto.setMessage("account was not created with success for user");

        }

//        resultDto.setCode("OK");
//        resultDto.setUrl("http://localhost:8080/v1/confirmAccount/123456789");
//        resultDto.setTopic("Account Creation");
//        resultDto.setMessage("The account 1 as been created for the account owner identified by " + email);

        return resultDto;
    }
}
