package com.vdzon.msw.servicelayer.mapper;

import com.vdzon.msw.shared.dto.TeamDto;
import com.vdzon.msw.servicelayer.model.Team;
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

    public Team mergeModel(final TeamDto dto, Team model) {
        model.setTeamname(dto.getTeamname());
        model.setUuid(dto.getUuid());
        model.setVereniging(dto.getVereniging());
        model.setSport(dto.getSport());
        model.setVoorkeursNrAanwezig(dto.getVoorkeursNrAanwezig());
        model.setTekortMailTo(dto.getTekortMailTo());
        model.setWaarschuwingMailTo(dto.getWaarschuwingMailTo());
        model.setWaarschuwingMailDagen(dto.getWaarschuwingMailDagen());
        model.setReminderDays(dto.getReminderDays());
        model.setStrafpunten(dto.getStrafpunten());
        return model;
    }

    public TeamDto toDto(final Team model) {
        if (model == null) return null;
        TeamDto dto = new TeamDto();
        dto.setTeamname(model.getTeamname());
        dto.setUuid(model.getUuid());
        dto.setVereniging(model.getVereniging());
        dto.setSport(model.getSport());
        dto.setVoorkeursNrAanwezig(model.getVoorkeursNrAanwezig());
        dto.setTekortMailTo(model.getTekortMailTo());
        dto.setWaarschuwingMailTo(model.getWaarschuwingMailTo());
        dto.setWaarschuwingMailDagen(model.getWaarschuwingMailDagen());
        dto.setReminderDays(model.getReminderDays());
        dto.setStrafpunten(model.getStrafpunten());
        dto.setTeammembers(teammemberMapper.toDto(model.getTeammembers()));
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
