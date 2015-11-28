package com.vdzon.msw.importmsw.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TeamDto implements Serializable {
    private String uuid;
    private String teamname;
    private List<TeammemberDto> teammembers = new ArrayList<>();
    private List<CompetitionDto> competitions = new ArrayList<>();

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public List<TeammemberDto> getTeammembers() {
        return teammembers;
    }

    public void setTeammembers(List<TeammemberDto> teammembers) {
        this.teammembers = teammembers;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public List<CompetitionDto> getCompetitions() {
        return competitions;
    }

    public void setCompetitions(List<CompetitionDto> competitions) {
        this.competitions = competitions;
    }
}