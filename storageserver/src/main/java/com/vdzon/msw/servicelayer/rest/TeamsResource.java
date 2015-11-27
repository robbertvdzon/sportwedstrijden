package com.vdzon.msw.servicelayer.rest;

import com.vdzon.msw.servicelayer.dto.TeamDto;
import com.vdzon.msw.servicelayer.mapper.TeamMapper;
import com.vdzon.msw.servicelayer.model.Team;
import com.vdzon.msw.servicelayer.repository.TeamRepository;
import com.vdzon.msw.servicelayer.repository.TeammemberRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.UUID;

@RestController
@RequestMapping("/api/teams")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TeamsResource {

    @Inject
    TeamRepository teamRepository;

    @Inject
    TeammemberRepository teammemberRepository;

    @Inject
    TeamMapper teamMapper;

    @RequestMapping(value = "/{uuid}", method = RequestMethod.GET)
    public ResponseEntity<TeamDto> get(@PathVariable("uuid") String uuid) {
        Team team = teamRepository.findByUuid(uuid);
        if (team == null) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<TeamDto>(teamMapper.toDto(team), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<TeamDto> save(@RequestBody TeamDto dto) throws Exception {
        Team team = teamRepository.findByUuid(dto.getUuid());
        if (team == null) {
            team = new Team();
            team.setUuid(UUID.randomUUID().toString());
        }
        teamRepository.save(teamMapper.mergeModel(dto, team));
        return new ResponseEntity<TeamDto>(teamMapper.toDto(team), HttpStatus.OK);
    }

//    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
//    public ResponseEntity<List<ContactModel>> delete(@PathVariable("id") String uuid) {
//        Team team = teamRepository.findByUuid(uuid);
//        if (team == null) {
//            return new ResponseEntity(HttpStatus.NOT_FOUND);
//        }
//        teamRepository.delete(team);
//        return new ResponseEntity(HttpStatus.OK);
//    }

}
