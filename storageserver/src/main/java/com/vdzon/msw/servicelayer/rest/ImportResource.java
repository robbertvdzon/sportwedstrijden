package com.vdzon.msw.servicelayer.rest;

import com.vdzon.msw.servicelayer.dto.*;
import com.vdzon.msw.servicelayer.mapper.*;
import com.vdzon.msw.servicelayer.model.*;
import com.vdzon.msw.servicelayer.repository.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RestController
@RequestMapping("/api/import")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ImportResource {


    @Inject
    UserRepository userRepository;

    @Inject
    TeamRepository teamRepository;

    @Inject
    TeammemberRepository teammemberRepository;

    @Inject
    CompetitionRepository competitionRepository;

    @Inject
    GameRepository gameRepository;

    @Inject
    AuthenticationUserMapper authenticationUserMapper;

    @Inject
    UserMapper userMapper;

    @Inject
    TeamMapper teamMapper;

    @Inject
    TeammemberMapper teammemberMapper;

    @Inject
    CompetitionMapper competitionMapper;

    @Inject
    GameMapper gameMapper;

    @RequestMapping(value = "/importAuthenticationUser", method = RequestMethod.PUT)
    public ResponseEntity importAuthenticationUser(@RequestBody AuthenticationUserDto dto) throws Exception {
        // merge or add authentication user
        User user = getOrCreateUser(dto);
        authenticationUserMapper.mergeModel(dto, user);
        userRepository.save(user);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value = "/importUser", method = RequestMethod.PUT)
    public ResponseEntity importUser(@RequestBody UserDto dto) throws Exception {

        // merge or add user
        User user = getOrCreateUser(dto);
        userMapper.mergeModel(dto,user);

        // merge or add team
        for (TeamDto teamDto:dto.getTeams()) {
            Team team = getOrCreateTeam(user, teamDto);
            teamMapper.mergeModel(teamDto,team);
//            teamRepository.save(team);

            // merge or add teammembers
            for (TeammemberDto teammemberDto:teamDto.getTeammembers()) {
                Teammember teammember = getOrCreateTeammember(teammemberDto);
                teammember.setTeam(team);
                teammemberMapper.mergeModel(teammemberDto,teammember);
                // map the team/user separately, this is not done in the mapper
                if (teammemberDto.getUserUuid().equals(dto.getUuid())){
                    user.addTeammember(teammember);
                    teammember.setUser(user);
                }
//                teammemberRepository.save(teammember);
            }

            // merge or add competitions
            for (CompetitionDto competitionDto:teamDto.getCompetitions()) {
                Competition competition = getOrCreateCompetition(team, competitionDto);
                competitionMapper.mergeModel(competitionDto,competition);
                competition.setTeam(team);
//                team.getCompetitions().add(competition);
//                competitionRepository.save(competition);

                // merge or add games
                for (GameDto gameDto:competitionDto.getGames()) {
                    Game game = getOrCreateGame(competition, gameDto);
                    game.setCompetition(competition);
                    gameMapper.mergeModel(gameDto,game);
//                    gameRepository.save(game);
                }
            }
//            teamRepository.save(team);
        }

        userRepository.save(user);
        return new ResponseEntity(HttpStatus.OK);
    }

    private User getOrCreateUser(AuthenticationUserDto dto) {
        User user = userRepository.findByUuid(dto.getUuid());
        if (user==null){
            user = new User();
            user.setUuid(dto.getUuid());
        }
        return user;
    }

    private User getOrCreateUser(UserDto dto) {
        User user = userRepository.findByUuid(dto.getUuid());
        if (user==null){
            user = new User();
            user.setUuid(dto.getUuid());
        }
        return user;
    }

    private Team getOrCreateTeam(User user, TeamDto dto) {
        Team team = null;
        for (Teammember tm:user.getTeammembers()){
            if (tm.getTeam()!=null && tm.getTeam().getUuid().equals(dto.getUuid())){
                team = tm.getTeam();
            }
        }
        if (team==null){
            team = new Team();
            team.setUuid(dto.getUuid());

        }
        return team;
    }

    private Teammember getOrCreateTeammember(TeammemberDto dto) {
        Teammember teammember = teammemberRepository.findByUuid(dto.getUuid());
        if (teammember==null){
            teammember = new Teammember();
            teammember.setUuid(dto.getUuid());
        }
        return teammember;
    }

    private Competition getOrCreateCompetition(Team team, CompetitionDto dto) {
        Competition competition = null;
        for (Competition c : team.getCompetitions()){
            if (c.getUuid().equals(dto.getUuid())) {
                competition = c;
            }
        }
        if (competition==null){
            competition = new Competition();
            competition.setUuid(dto.getUuid());
            team.getCompetitions().add(competition);
        }
        return competition;
    }

    private Game getOrCreateGame(Competition competition, GameDto dto) {
        Game game = null;
        for (Game g:competition.getGames()){
            if (g.getUuid().equals(dto.getUuid())){
                game = g;
            }
        }
        if (game==null){
            game = new Game();
            game.setUuid(dto.getUuid());
            competition.getGames().add(game);
        }
        return game;
    }


}
