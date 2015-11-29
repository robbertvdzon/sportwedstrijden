package com.vdzon.msw.servicelayer.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "game")
public class Game implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String uuid;
    private String tegenpartij;
    private Long datetime;
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

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
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
}