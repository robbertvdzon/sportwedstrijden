package com.vdzon.msw.servicelayer.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "competition")
public class Competition implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String uuid;
    private String season;
    private Long status;
    private Long type;


    @ManyToOne(cascade=CascadeType.ALL)
    private Team team;

    @OneToMany(mappedBy = "competition", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Game> games = new ArrayList<>();

    private String competitionname;

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

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getCompetitionname() {
        return competitionname;
    }

    public void setCompetitionname(String competitionname) {
        this.competitionname = competitionname;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }
}