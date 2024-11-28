package org.msp.quaoar.dao;

import org.msp.quaoar.domain.Account;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AccountRepository extends CrudRepository<Account, Integer> {

    @Query(value = "select * from accounts a, members m where m.id=:memberId",nativeQuery = true)
    public Iterable<Account> findAccountByMemberId(@Param("memberId") String memberId);

    @Query(value = "select * from accounts a, members m where m.email=:email", nativeQuery = true)
    public Iterable<Account> findAccountByMemberEmail(@Param("email") String email);
}