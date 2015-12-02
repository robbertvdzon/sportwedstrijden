package com.vdzon.msw.servicelayer.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import java.io.Serializable;
import java.time.LocalDateTime;

public class TeammemberDto implements Serializable {
    private String uuid;
    private String nickname;
    private String userUuid;
    private String teamUuid;
    private Boolean admin;
    private Boolean deleted;
    private Boolean supporter;
    private String invitationEmail;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime invitationDate;
    private String invitationID;
    private Long acceptEmail;
    private Boolean invaller;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    public String getTeamUuid() {
        return teamUuid;
    }

    public void setTeamUuid(String teamUuid) {
        this.teamUuid = teamUuid;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public Boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Boolean isSupporter() {
        return supporter;
    }

    public void setSupporter(Boolean supporter) {
        this.supporter = supporter;
    }

    public String getInvitationEmail() {
        return invitationEmail;
    }

    public void setInvitationEmail(String invitationEmail) {
        this.invitationEmail = invitationEmail;
    }

    public LocalDateTime getInvitationDate() {
        return invitationDate;
    }

    public void setInvitationDate(LocalDateTime invitationDate) {
        this.invitationDate = invitationDate;
    }

    public String getInvitationID() {
        return invitationID;
    }

    public void setInvitationID(String invitationID) {
        this.invitationID = invitationID;
    }

    public Long getAcceptEmail() {
        return acceptEmail;
    }

    public void setAcceptEmail(Long acceptEmail) {
        this.acceptEmail = acceptEmail;
    }

    public Boolean isInvaller() {
        return invaller;
    }

    public void setInvaller(Boolean invaller) {
        this.invaller = invaller;
    }

    @Override
    public String toString() {
        return "TeammemberDto{" +
                "uuid='" + uuid + '\'' +
                ", nickname='" + nickname + '\'' +
                ", userUuid='" + userUuid + '\'' +
                ", teamUuid='" + teamUuid + '\'' +
                ", admin=" + admin +
                ", deleted=" + deleted +
                ", supporter=" + supporter +
                ", invitationEmail='" + invitationEmail + '\'' +
                ", invitationDate=" + invitationDate +
                ", invitationID='" + invitationID + '\'' +
                ", acceptEmail=" + acceptEmail +
                ", invaller=" + invaller +
                '}';
    }
}