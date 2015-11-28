package com.vdzon.msw.importmsw.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "teammember")
public class Teammember implements Serializable {

    @Id
    private Long id;
    private String admin;
//    private Long teamID;
    private String nickname;
    private Long userID;
    private boolean deleted;
    private boolean supporter;
    private String invitationEmail;
    private Date invitationDate;
    private String invitationID;
    private Long acceptEmail;
    private boolean invaller;
    @ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="teamID")
    private Team team;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
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

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}