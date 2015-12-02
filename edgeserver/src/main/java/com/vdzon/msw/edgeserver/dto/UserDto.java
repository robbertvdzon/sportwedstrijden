package com.vdzon.msw.edgeserver.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UserDto implements Serializable {
    private String uuid;
    private String username;
    private String email;
    private String name;
    private Boolean activeAccount;
    private String activationID;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime creationDate;
    private String phonenumber;
    private String requestConnectTeam;
    private Boolean proUser;
    private List<TeamDto> teams = new ArrayList<>();

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

    public Boolean isActiveAccount() {
        return activeAccount;
    }

    public void setActiveAccount(Boolean activeAccount) {
        this.activeAccount = activeAccount;
    }

    public String getActivationID() {
        return activationID;
    }

    public void setActivationID(String activationID) {
        this.activationID = activationID;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
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

    public Boolean isProUser() {
        return proUser;
    }

    public void setProUser(Boolean proUser) {
        this.proUser = proUser;
    }
}