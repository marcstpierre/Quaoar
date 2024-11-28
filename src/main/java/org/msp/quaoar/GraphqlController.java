package org.msp.quaoar;

import org.msp.quaoar.api.model.AccountDto;
import org.msp.quaoar.api.model.MemberDto;
import org.msp.quaoar.api.model.MembershipDto;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class GraphqlController {

    @QueryMapping
    public MemberDto getMemberById(@Argument int member_id){
        return null;
    }

    @QueryMapping
    public AccountDto getAccountByMemberId(@Argument int member_id){
        return null;
    }

    @QueryMapping
    public MembershipDto getMembershipByMemberId(int member_id){
        return null;
    }
}
