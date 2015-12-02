package com.vdzon.msw.importmsw.mapper;

import com.vdzon.msw.importmsw.dto.TeamDto;
import com.vdzon.msw.importmsw.model.Team;
import com.vdzon.msw.importmsw.model.Teammember;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Component
public class TeamMapper {

    @Inject
    TeammemberMapper teammemberMapper;

    @Inject
    CompetitionMapper competitionMapper;

    public TeamDto toDto(final Team model) {
        if (model == null) return null;
        TeamDto dto = new TeamDto();
        dto.setUuid(""+model.getId());
        dto.setTeamname(model.getTeamname());
        dto.setVereniging(model.getVereniging());
        dto.setSport(model.getSport());
        dto.setVoorkeursNrAanwezig(model.getVoorkeursNrAanwezig());
        dto.setTekortMailTo(model.getTekortMailTo());
        dto.setWaarschuwingMailTo(model.getWaarschuwingMailTo());
        dto.setWaarschuwingMailDagen(model.getWaarschuwingMailDagen());
        dto.setReminderDays(model.getReminderDays());
        dto.setStrafpunten(model.getStrafpunten());

        for (Teammember teammember:model.getTeammembers()){
            if (!teammember.isDeleted()){
                dto.getTeammembers().add(teammemberMapper.toDto(teammember));
            }
        }
        dto.setCompetitions(competitionMapper.toDto(model.getCompetitions()));
        return dto;
    }

    public List<TeamDto> toDto(List<Team> models) {
        List<TeamDto> userModels = new ArrayList<TeamDto>();
        if (models != null) {
            for (Team model : models) {
                userModels.add(toDto(model));
            }
        }
        return userModels;
    }

}
