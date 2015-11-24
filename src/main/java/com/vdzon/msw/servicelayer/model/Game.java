package com.vdzon.msw.servicelayer.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "game")
public class Game implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String uuid;

    private Long competitionId;

    private String tegenpartij;

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

    public Long getCompetitionId() {
        return competitionId;
    }

    public void setCompetitionId(Long competitionId) {
        this.competitionId= competitionId;
    }

    public String getTegenpartij() {
        return tegenpartij;
    }

    public void setTegenpartij(String tegenpartij) {
        this.tegenpartij = tegenpartij;
    }
}