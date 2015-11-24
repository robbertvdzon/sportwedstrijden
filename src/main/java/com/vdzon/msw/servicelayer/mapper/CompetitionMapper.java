package com.vdzon.msw.servicelayer.mapper;

import com.vdzon.msw.servicelayer.dto.CompetitionDto;
import com.vdzon.msw.servicelayer.model.Competition;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Component
public class CompetitionMapper {

    @Inject
    GameMapper gameMapper;

    public Competition mergeModel(final CompetitionDto dto, Competition model) {
        model.setCompetitionname(dto.getCompetitionname());
        return model;
    }

    public CompetitionDto toDto(final Competition model) {
        if (model == null) return null;
        CompetitionDto dto = new CompetitionDto();
        dto.setCompetitionname(model.getCompetitionname());
        dto.setUuid(model.getUuid());
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
