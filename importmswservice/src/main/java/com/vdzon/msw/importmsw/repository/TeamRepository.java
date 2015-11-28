package com.vdzon.msw.importmsw.repository;

import com.vdzon.msw.importmsw.model.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface TeamRepository extends CrudRepository<Team, Long> {
}
