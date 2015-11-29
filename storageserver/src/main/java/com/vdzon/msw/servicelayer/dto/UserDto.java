package com.vdzon.msw.servicelayer.dto;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

public class UserDto implements Serializable {
    private String uuid;
    private String username;
    private String email;
    private String name;
    private boolean activeAccount;
    private String activationID;
    private Date creationDate;
    private String phonenumber;
    private String requestConnectTeam;
    private boolean proUser;
    private List<TeamDto> teams;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<TeamDto> getTeams() {
        return teams;
    }

    public void setTeams(List<TeamDto> teams) {
        this.teams = teams;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActiveAccount() {
        return activeAccount;
    }

    public void setActiveAccount(boolean activeAccount) {
        this.activeAccount = activeAccount;
    }

    public String getActivationID() {
        return activationID;
    }

    public void setActivationID(String activationID) {
        this.activationID = activationID;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getRequestConnectTeam() {
        return requestConnectTeam;
    }

    public void setRequestConnectTeam(String requestConnectTeam) {
        this.requestConnectTeam = requestConnectTeam;
    }

    public boolean isProUser() {
        return proUser;
    }

    public void setProUser(boolean proUser) {
        this.proUser = proUser;
    }
}