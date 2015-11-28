package com.vdzon.msw.servicelayer.repository;

import com.vdzon.msw.servicelayer.model.Game;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface GameRepository extends CrudRepository<Game, Long> {
    @Query("SELECT u FROM Game u WHERE LOWER(u.uuid) = LOWER(:uuid)")
    Game findByUuid(@Param("uuid") String uuid);
}
