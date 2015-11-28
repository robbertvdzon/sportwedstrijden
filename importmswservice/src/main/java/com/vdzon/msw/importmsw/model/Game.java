package com.vdzon.msw.importmsw.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "games")
public class Game implements Serializable {

    @Id
    private Long id;
    private Long teamID;
    private Long datetime;
    private String opponent;
    private String membersPresentYes;
    private String membersPresentNo;
    private String goals;
    private String meetingpoint;
    private String score;
    private boolean homegame;
    private String list1;
    private String list2;
    private String list3;
    private String list4;
    private String list5;
    private String list6;
    private String list7;
    private String list8;
    private String list9;
    private String list10;
    private Long points;
    private String messages;
    private Long gameType;
    private Long gameStatus;
    private String gameDetails;
    private String gameReport;
    private Long remindersSended;
    private Long tooShortSended;
    private Long warningSended;
    private Long competitionID;
    private String gameUID;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTeamID() {
        return teamID;
    }

    public void setTeamID(Long teamID) {
        this.teamID = teamID;
    }

    public Long getDatetime() {
        return datetime;
    }

    public void setDatetime(Long datetime) {
        this.datetime = datetime;
    }

    public String getOpponent() {
        return opponent;
    }

    public void setOpponent(String opponent) {
        this.opponent = opponent;
    }

    public String getMembersPresentYes() {
        return membersPresentYes;
    }

    public void setMembersPresentYes(String membersPresentYes) {
        this.membersPresentYes = membersPresentYes;
    }

    public String getMembersPresentNo() {
        return membersPresentNo;
    }

    public void setMembersPresentNo(String membersPresentNo) {
        this.membersPresentNo = membersPresentNo;
    }

    public String getGoals() {
        return goals;
    }

    public void setGoals(String goals) {
        this.goals = goals;
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

    public boolean isHomegame() {
        return homegame;
    }

    public void setHomegame(boolean homegame) {
        this.homegame = homegame;
    }

    public String getList1() {
        return list1;
    }

    public void setList1(String list1) {
        this.list1 = list1;
    }

    public String getList2() {
        return list2;
    }

    public void setList2(String list2) {
        this.list2 = list2;
    }

    public String getList3() {
        return list3;
    }

    public void setList3(String list3) {
        this.list3 = list3;
    }

    public String getList4() {
        return list4;
    }

    public void setList4(String list4) {
        this.list4 = list4;
    }

    public String getList5() {
        return list5;
    }

    public void setList5(String list5) {
        this.list5 = list5;
    }

    public String getList6() {
        return list6;
    }

    public void setList6(String list6) {
        this.list6 = list6;
    }

    public String getList7() {
        return list7;
    }

    public void setList7(String list7) {
        this.list7 = list7;
    }

    public String getList8() {
        return list8;
    }

    public void setList8(String list8) {
        this.list8 = list8;
    }

    public String getList9() {
        return list9;
    }

    public void setList9(String list9) {
        this.list9 = list9;
    }

    public String getList10() {
        return list10;
    }

    public void setList10(String list10) {
        this.list10 = list10;
    }

    public Long getPoints() {
        return points;
    }

    public void setPoints(Long points) {
        this.points = points;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
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

    public Long getCompetitionID() {
        return competitionID;
    }

    public void setCompetitionID(Long competitionID) {
        this.competitionID = competitionID;
    }

    public String getGameUID() {
        return gameUID;
    }

    public void setGameUID(String gameUID) {
        this.gameUID = gameUID;
    }
}