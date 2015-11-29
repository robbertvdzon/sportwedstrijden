package com.vdzon.msw.servicelayer.dto;

import java.io.Serializable;
import java.util.List;

public class CompetitionDto implements Serializable {
    private String uuid;
    private String teamUuid;
    private List<GameDto> games;
    private String competitionname;
    private String season;
    private Long status;
    private Long type;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTeamUuid() {
        return teamUuid;
    }

    public void setTeamUuid(String teamUuid) {
        this.teamUuid = teamUuid;
    }

    public String getCompetitionname() {
        return competitionname;
    }

    public void setCompetitionname(String competitionname) {
        this.competitionname = competitionname;
    }

    public List<GameDto> getGames() {
        return games;
    }

    public void setGames(List<GameDto> games) {
        this.games = games;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }
}