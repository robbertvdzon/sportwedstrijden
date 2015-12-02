package com.vdzon.msw.importmsw.mapper;

import com.vdzon.msw.importmsw.dto.CompetitionDto;
import com.vdzon.msw.importmsw.model.Competition;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Component
public class CompetitionMapper {

    @Inject
    GameMapper gameMapper;

    public CompetitionDto toDto(final Competition model) {
        if (model == null) return null;
        CompetitionDto dto = new CompetitionDto();
        dto.setCompetitionname(model.getDescription());
        dto.setUuid(""+model.getId());
        dto.setSeason(model.getSeason());
        dto.setStatus(model.getStatus());
        dto.setGames(gameMapper.toDto(model.getGames()));
        return dto;
    }

    public List<CompetitionDto> toDto(List<Competition> models) {
        List<CompetitionDto> userModels = new ArrayList<CompetitionDto>();
        if (models != null) {
            for (Competition model : models) {
                userModels.add(toDto(model));
            }
        }
        return userModels;
    }

}
