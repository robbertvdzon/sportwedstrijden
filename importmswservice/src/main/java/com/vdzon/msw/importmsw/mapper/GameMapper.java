package com.vdzon.msw.importmsw.mapper;

import com.vdzon.msw.shared.dto.GameDto;
import com.vdzon.msw.importmsw.model.Game;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GameMapper {

    public GameDto toDto(final Game model) {
        if (model == null) return null;
        GameDto dto = new GameDto();
        dto.setUuid(""+model.getId());
        dto.setTegenpartij(model.getOpponent());
        dto.setDatetime(model.getDatetime());
        dto.setMeetingpoint(model.getMeetingpoint());
        dto.setScore(model.getScore());
        dto.setHomegame(model.isHomegame());
        dto.setPoints(model.getPoints());
        dto.setGameType(model.getGameType());
        dto.setGameStatus(model.getGameStatus());
        dto.setGameDetails(model.getGameDetails());
        dto.setGameReport(model.getGameReport());
        dto.setRemindersSended(model.getRemindersSended());
        dto.setTooShortSended(model.getTooShortSended());
        dto.setWarningSended(model.getWarningSended());
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
