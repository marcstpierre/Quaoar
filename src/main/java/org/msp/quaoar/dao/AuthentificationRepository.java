package org.msp.quaoar.dao;

import org.msp.quaoar.domain.Authentification;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AuthentificationRepository extends CrudRepository<Authentification, Integer> {

    @Query(
            value = "SELECT auth.* FROM authentifications auth, members m where auth.member_id=m.id and auth.pwd like ':pwd' and m.email like ':emailAddress'",
            nativeQuery = true)
    public Authentification getAuthentificationDetailsFromCredentials(@Param("emailAddress") String email,
                                                                      @Param("pwd") String pwd);
}
