package org.msp.quaoar.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "members")
public class Member implements Serializable {

    //    @OneToOne(cascade={CascadeType.ALL})
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    private String email;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id")
    private Account account;

    @Column
    private String lastModifDate;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String birthDate;

    @Column
    private String gender;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

//    @Column
//    private AccountRole accountRole;

//    @ManyToOne(targetEntity = Integer.class, cascade=CascadeType.ALL)
//    private List<Interest> interestList;



//    public AccountRole getAccountRole() {
//        return accountRole;
//    }
//
//    public void setAccountRole(AccountRole accountRole) {
//        this.accountRole = accountRole;
//    }

//    public List<Interest> getInterestList() {
//        return interestList;
//    }
//
//    public void setInterestList(List<Interest> interestList) {
//        this.interestList = interestList;
//    }
}
