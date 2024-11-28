package org.msp.quaoar.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "addresses")
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    private Integer number;

    @Column
    private String street;

    @Column
    private String secondLine;

    @Column
    private String city;

    @Column
    private String province;

    @Column
    private String country;

    @Column
    private String codePostal;

}
