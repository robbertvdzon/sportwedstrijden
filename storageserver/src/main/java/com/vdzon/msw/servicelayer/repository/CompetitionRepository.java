package com.vdzon.msw.servicelayer.repository;

import com.vdzon.msw.servicelayer.model.Competition;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CompetitionRepository extends CrudRepository<Competition, Long> {
    @Query("SELECT u FROM Competition u WHERE LOWER(u.uuid) = LOWER(:uuid)")
    Competition findByUuid(@Param("uuid") String uuid);
}
