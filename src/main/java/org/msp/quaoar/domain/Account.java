package org.msp.quaoar.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "accounts")
public class Account  implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @OneToMany(cascade=CascadeType.ALL, mappedBy="account")
    private List<Member> members;



    public Account addMember(Member m){
        if (members == null){
            members = new ArrayList<Member>();
        }
        members.add(m);
        return this;
    }

    public Account removeMember(Member m){
        if (members != null){
            members.remove(m);
        }
        return this;
    }

}
