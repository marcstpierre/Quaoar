package org.msp.quaoar.api.model;

import java.util.List;

public class MembershipTypeDto {
    int id;
    ClubDto club;
    String name;
    Float price;
    DurationEnum duration;
    List<InstallmentDto> installments;
    int availabilityStartDate;
    int availabilityEndDate;
}
