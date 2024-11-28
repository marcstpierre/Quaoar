package org.msp.quaoar.dao;

import org.msp.quaoar.domain.Account;
import org.msp.quaoar.domain.Member;
import org.msp.quaoar.domain.Token;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface TokenRepository  extends CrudRepository<Token, String> {

    @Query(value = "select * from tokens where token=:token", nativeQuery = true)
    public Optional<Token> getTokenByTokenString(@Param("token") String token);
}
