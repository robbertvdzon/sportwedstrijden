package com.vdzon.msw.servicelayer.dto;

import java.io.Serializable;
import java.util.List;

public class UserDto implements Serializable {
    private String uuid;
    private String username;
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
}