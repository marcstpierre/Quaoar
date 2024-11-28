package org.msp.quaoar.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tokens")
public class Token {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private Member member;

    private String token;

    private Timestamp expiration;
}
