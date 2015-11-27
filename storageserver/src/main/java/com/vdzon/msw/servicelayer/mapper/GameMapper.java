package com.vdzon.msw.servicelayer.mapper;

import com.vdzon.msw.servicelayer.dto.GameDto;
import com.vdzon.msw.servicelayer.model.Game;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GameMapper {

    public Game mergeModel(final GameDto dto, Game model) {
        model.setTegenpartij(dto.getTegenpartij());
        return model;
    }

    public GameDto toDto(final Game model) {
        if (model == null) return null;
        GameDto dto = new GameDto();
        dto.setTegenpartij(model.getTegenpartij());
        dto.setUuid(model.getUuid());
        return dto;
    }

    public List<GameDto> toDto(List<Game> models) {
        List<GameDto> userModels = new ArrayList<GameDto>();
        if (models != null) {
            for (Game model : models) {
                userModels.add(toDto(model));
            }
        }
        return userModels;
    }

}
