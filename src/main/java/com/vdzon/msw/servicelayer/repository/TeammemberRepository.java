package com.vdzon.msw.servicelayer.repository;

import com.vdzon.msw.servicelayer.model.Teammember;
import com.vdzon.msw.servicelayer.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface TeammemberRepository extends CrudRepository<Teammember, Long> {
    @Query("SELECT u FROM Teammember u WHERE LOWER(u.uuid) = LOWER(:uuid)")
    Teammember findByUuid(@Param("uuid") String uuid);
}
