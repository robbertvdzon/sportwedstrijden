package com.vdzon.msw.servicelayer.repository;

import com.vdzon.msw.servicelayer.model.Team;
import com.vdzon.msw.servicelayer.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface TeamRepository extends CrudRepository<Team, Long> {
    @Query("SELECT u FROM Team u WHERE LOWER(u.uuid) = LOWER(:uuid)")
    Team findByUuid(@Param("uuid") String uuid);
}
