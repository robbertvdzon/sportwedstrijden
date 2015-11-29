package com.vdzon.msw.portlet.dto;

import java.io.Serializable;
import java.sql.Date;

public class TeammemberDto implements Serializable {
    private String uuid;
    private String nickname;
    private String userUuid;
    private String teamUuid;
    private boolean admin;
    private boolean deleted;
    private boolean supporter;
    private String invitationEmail;
    private Date invitationDate;
    private String invitationID;
    private Long acceptEmail;
    private boolean invaller;

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

    public boolean getAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public boolean isSupporter() {
        return supporter;
    }

    public void setSupporter(boolean supporter) {
        this.supporter = supporter;
    }

    public String getInvitationEmail() {
        return invitationEmail;
    }

    public void setInvitationEmail(String invitationEmail) {
        this.invitationEmail = invitationEmail;
    }

    public Date getInvitationDate() {
        return invitationDate;
    }

    public void setInvitationDate(Date invitationDate) {
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

    public boolean isInvaller() {
        return invaller;
    }

    public void setInvaller(boolean invaller) {
        this.invaller = invaller;
    }
}