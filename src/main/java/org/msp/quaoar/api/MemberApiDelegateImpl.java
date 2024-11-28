package org.msp.quaoar.api;

import org.msp.quaoar.api.model.MembertDto;
import org.msp.quaoar.api.model.ResultDto;
import org.msp.quaoar.dao.AuthentificationRepository;
import org.msp.quaoar.dao.MemberRepository;
import org.msp.quaoar.domain.Address;
import org.msp.quaoar.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

public class MemberApiDelegateImpl implements MemberApiDelegate {

    @Autowired
    MemberRepository memberRepository;


    private ResultDto saveMember(MembertDto member){
        Member theMember = memberRepository.getMemberFromId(member.getEmail());
        theMember.setLastName(member.getLastName());
        theMember.setFirstName(member.getFirstName());
        theMember.setEmail(member.getEmail());

        theMember.getAddress().setNumber(member.getAddress().getNumber());
        theMember.getAddress().setStreet(member.getAddress().getStreet());
        theMember.getAddress().setCity(member.getAddress().getCity());
        theMember.getAddress().setProvince(member.getAddress().getProvince());
        theMember.getAddress().setCountry(member.getAddress().getCountry());
        theMember.getAddress().setCodePostal(member.getAddress().getCodePostal());


        theMember = memberRepository.save(theMember);
        return null;
    }

}
