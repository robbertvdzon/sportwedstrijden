package com.vdzon.msw.servicelayer.dto;

import java.io.Serializable;

public class GameDto implements Serializable {
    private String uuid;
    private String conpetitionUuid;
    private String tegenpartij;
    private Long datetime;
    private String meetingpoint;
    private String score;
    private Boolean homegame;
    private Long points;
    private Long gameType;
    private Long gameStatus;
    private String gameDetails;
    private String gameReport;
    private Long remindersSended;
    private Long tooShortSended;
    private Long warningSended;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getConpetitionUuid() {
        return conpetitionUuid;
    }

    public void setConpetitionUuid(String conpetitionUuid) {
        this.conpetitionUuid = conpetitionUuid;
    }

    public String getTegenpartij() {
        return tegenpartij;
    }

    public void setTegenpartij(String tegenpartij) {
        this.tegenpartij = tegenpartij;
    }

    public Long getDatetime() {
        return datetime;
    }

    public void setDatetime(Long datetime) {
        this.datetime = datetime;
    }

    public String getMeetingpoint() {
        return meetingpoint;
    }

    public void setMeetingpoint(String meetingpoint) {
        this.meetingpoint = meetingpoint;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Boolean isHomegame() {
        return homegame;
    }

    public void setHomegame(Boolean homegame) {
        this.homegame = homegame;
    }

    public Long getPoints() {
        return points;
    }

    public void setPoints(Long points) {
        this.points = points;
    }

    public Long getGameType() {
        return gameType;
    }

    public void setGameType(Long gameType) {
        this.gameType = gameType;
    }

    public Long getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(Long gameStatus) {
        this.gameStatus = gameStatus;
    }

    public String getGameDetails() {
        return gameDetails;
    }

    public void setGameDetails(String gameDetails) {
        this.gameDetails = gameDetails;
    }

    public String getGameReport() {
        return gameReport;
    }

    public void setGameReport(String gameReport) {
        this.gameReport = gameReport;
    }

    public Long getRemindersSended() {
        return remindersSended;
    }

    public void setRemindersSended(Long remindersSended) {
        this.remindersSended = remindersSended;
    }

    public Long getTooShortSended() {
        return tooShortSended;
    }

    public void setTooShortSended(Long tooShortSended) {
        this.tooShortSended = tooShortSended;
    }

    public Long getWarningSended() {
        return warningSended;
    }

    public void setWarningSended(Long warningSended) {
        this.warningSended = warningSended;
    }
}