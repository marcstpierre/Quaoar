package org.msp.quaoar.dao;

import org.msp.quaoar.domain.Member;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface MemberRepository extends CrudRepository<Member, Integer> {

    @Query(value = "select * from members where email=:emailAddress", nativeQuery = true)
    public Member getMemberFromEmail(@Param("emailAddress") String email);

    @Query(value = "select * from members where id=:member_id", nativeQuery = true)
    public Member getMemberFromId(@Param("member_id") String email);
}
