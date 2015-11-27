package com.vdzon.msw.servicelayer.mapper;

import com.vdzon.msw.servicelayer.dto.TeamDto;
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
        return model;
    }

    public TeamDto toDto(final Team model) {
        if (model == null) return null;
        TeamDto dto = new TeamDto();
        dto.setTeamname(model.getTeamname());
        dto.setUuid(model.getUuid());
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
