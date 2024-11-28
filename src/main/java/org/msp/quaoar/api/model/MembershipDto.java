package org.msp.quaoar.api.model;

import java.util.List;

public class MembershipDto {

    int id;
    MembershipTypeDto membershipType;
    String name;
    Float price;
    List<InstallmentDto> installments;
    int membershipStartDate;
    int membershipEndDate;
}
