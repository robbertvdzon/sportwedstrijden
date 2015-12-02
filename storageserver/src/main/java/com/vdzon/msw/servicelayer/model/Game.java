package com.vdzon.msw.servicelayer.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "game")
public class Game implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String uuid;
    private String tegenpartij;
    private LocalDateTime datetime;
//    private String membersPresentYes;
//    private String membersPresentNo;
//    private String goals;
    private String meetingpoint;
    private String score;
    private Boolean homegame;
//    private String list1;
//    private String list2;
//    private String list3;
//    private String list4;
//    private String list5;
//    private String list6;
//    private String list7;
//    private String list8;
//    private String list9;
//    private String list10;
    private Long points;
//    private String messages;
    private Long gameType;
    private Long gameStatus;
    private String gameDetails;
    private String gameReport;
    private Long remindersSended;
    private Long tooShortSended;
    private Long warningSended;

    @ManyToOne(cascade=CascadeType.ALL)
    private Competition competition;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTegenpartij() {
        return tegenpartij;
    }

    public void setTegenpartij(String tegenpartij) {
        this.tegenpartij = tegenpartij;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
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

    public Boolean getHomegame() {
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

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }
}