package com.vdzon.msw.servicelayer.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "teammember")
public class Teammember implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String uuid;
    private Boolean admin;
    private Boolean deleted;
    private Boolean supporter;
    private String invitationEmail;
    private LocalDateTime invitationDate;
    private String invitationID;
    private Long acceptEmail;
    private Boolean invaller;
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

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Boolean getSupporter() {
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

    public Boolean getInvaller() {
        return invaller;
    }

    public void setInvaller(Boolean invaller) {
        this.invaller = invaller;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}