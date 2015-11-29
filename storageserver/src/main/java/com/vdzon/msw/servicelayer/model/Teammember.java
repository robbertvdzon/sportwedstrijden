package com.vdzon.msw.servicelayer.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "teammember")
public class Teammember implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String uuid;
    private String admin;
    private boolean deleted;
    private boolean supporter;
    private String invitationEmail;
    private Date invitationDate;
    private String invitationID;
    private Long acceptEmail;
    private boolean invaller;
    private String nickname;

    @ManyToOne(cascade=CascadeType.ALL)
    private User user;

    @ManyToOne(cascade=CascadeType.ALL)
    private Team team;


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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
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