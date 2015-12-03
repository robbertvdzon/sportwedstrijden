package com.vdzon.msw.servicelayer.mapper;

import com.vdzon.msw.shared.dto.GameDto;
import com.vdzon.msw.servicelayer.model.Game;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

@Component
public class GameMapper {

    public Game mergeModel(final GameDto dto, Game model) {
        model.setTegenpartij(dto.getTegenpartij());
        model.setUuid(dto.getUuid());
        model.setDatetime(LocalDateTime.ofEpochSecond(dto.getDatetime(), 0, ZoneOffset.UTC));
        model.setMeetingpoint(dto.getMeetingpoint());
        model.setScore(dto.getScore());
        model.setHomegame(dto.isHomegame());
        model.setPoints(dto.getPoints());
        model.setGameType(dto.getGameType());
        model.setGameStatus(dto.getGameStatus());
        model.setGameDetails(dto.getGameDetails());
        model.setGameReport(dto.getGameReport());
        model.setRemindersSended(dto.getRemindersSended());
        model.setTooShortSended(dto.getTooShortSended());
        model.setWarningSended(dto.getWarningSended());

        return model;
    }

    public GameDto toDto(final Game model) {
        if (model == null) return null;
        GameDto dto = new GameDto();
        dto.setTegenpartij(model.getTegenpartij());
        dto.setUuid(model.getUuid());
        dto.setDatetime(model.getDatetime() == null  ? 0 : model.getDatetime().toEpochSecond(ZoneOffset.UTC));
        dto.setMeetingpoint(model.getMeetingpoint());
        dto.setScore(model.getScore());
        dto.setHomegame(model.getHomegame());
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
