package org.msp.quaoar.api;

import org.msp.quaoar.api.model.ResultDto;
import org.msp.quaoar.dao.MemberRepository;
import org.msp.quaoar.dao.TokenRepository;
import org.msp.quaoar.domain.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ConfirmMemberApiDelegateImpl implements ConfirmMemberApiDelegate {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    TokenRepository tokenRepository;

    @Override
    public ResponseEntity<ResultDto> confirmMemberTokenGet(String token) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType :
                    MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString =
                            "{ \"code\" : \"code\", \"topic\" : \"topic\", \"message\" : \"message\", \"url\" : \"url\" }";
                    ApiUtil.setExampleResponse(request, "application/json",
                            exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString =
                            "{ \"code\" : \"code\", \"topic\" : \"topic\", \"message\" : \"message\", \"url\" : \"url\" }";
                    ApiUtil.setExampleResponse(request, "application/json",
                            exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(confirmAccountWithEmail(token), HttpStatus.OK);
    }

    private ResultDto confirmAccountWithEmail(String token) {

        ResultDto dto = new ResultDto();

        Optional<Token> foundToken = tokenRepository.getTokenByTokenString(token);

        dto.setCode("OK");
        dto.setMessage("The account owner has confirm its email");
        dto.setTopic("Account creation");
        return dto;
    }
}
