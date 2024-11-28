package org.msp.quaoar.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.msp.quaoar.api.model.Authentication;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "authentifications")
public class Authentification  implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "member_id", referencedColumnName = "id")
    private Member member;

    @Column
    private String pwd;

    @Column
    private String token;

    @Column
    private Long lastAuthentification;

    @Column
    private Long tokenExpirationTimeStamp;

    public Authentification(Member member, String pwd){
        this.member = member;
        this.pwd = pwd;
    }


}
