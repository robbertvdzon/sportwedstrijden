package com.vdzon.msw.servicelayer.rest;

import com.vdzon.msw.servicelayer.dto.TeammemberDto;
import com.vdzon.msw.servicelayer.mapper.TeammemberMapper;
import com.vdzon.msw.servicelayer.model.Team;
import com.vdzon.msw.servicelayer.model.Teammember;
import com.vdzon.msw.servicelayer.model.User;
import com.vdzon.msw.servicelayer.repository.TeamRepository;
import com.vdzon.msw.servicelayer.repository.TeammemberRepository;
import com.vdzon.msw.servicelayer.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.UUID;

@RestController
@RequestMapping("/api/teammembers")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TeammembersResource {

    @Inject
    TeammemberRepository teammemberRepository;

    @Inject
    UserRepository userRepository;

    @Inject
    TeamRepository teamRepository;

    @Inject
    TeammemberMapper teammemberMapper;

    @RequestMapping(value = "/{uuid}", method = RequestMethod.GET)
    public ResponseEntity<TeammemberDto> get(@PathVariable("uuid") String uuid) {
        Teammember teammember = teammemberRepository.findByUuid(uuid);
        if (teammember == null) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<TeammemberDto>(teammemberMapper.toDto(teammember), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<TeammemberDto> save(@RequestBody TeammemberDto dto) throws Exception {
        User user = userRepository.findByUuid(dto.getUserUuid());
        if (user==null){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        Team team = teamRepository.findByUuid(dto.getTeamUuid());
        if (team==null){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        Teammember teammember = teammemberRepository.findByUuid(dto.getUuid());
        if (teammember == null) {
            teammember = new Teammember();
            teammember.setUuid(UUID.randomUUID().toString());
        }
        teammember.setUserId(user.getId());
        teammember.setTeam(team);
        teammemberRepository.save(teammemberMapper.mergeModel(dto, teammember));
        return new ResponseEntity<TeammemberDto>(teammemberMapper.toDto(teammember), HttpStatus.OK);
    }

//    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
//    public ResponseEntity<List<ContactModel>> delete(@PathVariable("id") String uuid) {
//        Teammember teammember = teammemberRepository.findByUuid(uuid);
//        if (teammember == null) {
//            return new ResponseEntity(HttpStatus.NOT_FOUND);
//        }
//        teammemberRepository.delete(teammember);
//        return new ResponseEntity(HttpStatus.OK);
//    }

}
