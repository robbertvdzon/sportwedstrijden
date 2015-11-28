package com.vdzon.msw.importmsw.mapper;

import com.vdzon.msw.importmsw.dto.GameDto;
import com.vdzon.msw.importmsw.model.Game;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GameMapper {

    public GameDto toDto(final Game model) {
        if (model == null) return null;
        GameDto dto = new GameDto();
        dto.setTegenpartij(model.getOpponent());
        dto.setUuid(""+model.getId());
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
