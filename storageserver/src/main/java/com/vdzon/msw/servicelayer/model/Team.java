package com.vdzon.msw.servicelayer.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "team")
public class Team implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String uuid;
    private String teamname;
//    private String listname1;
//    private String listname2;
//    private String listname3;
//    private String listname4;
//    private String listname5;
//    private String listname6;
//    private String listname7;
//    private String listname8;
//    private String listname9;
//    private String listname10;
//    private Long listtype1;
//    private Long listtype2;
//    private Long listtype3;
//    private Long listtype4;
//    private Long listtype5;
//    private Long listtype6;
//    private Long listtype7;
//    private Long listtype8;
//    private Long listtype9;
//    private Long listtype10;
    private String vereniging;
    private String sport;
    private Long voorkeursNrAanwezig;
    private Long tekortMailTo;
    private Long waarschuwingMailTo;
    private Long waarschuwingMailDagen;
    private Long reminderDays;
    private Long managedCompetitieID;
    private Long strafpunten;
    private String aanvoerder;

    @OneToMany(mappedBy = "team", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Teammember> teammembers;

    @OneToMany(mappedBy = "team", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Competition> competitions = new ArrayList<Competition>();

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

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public String getVereniging() {
        return vereniging;
    }

    public void setVereniging(String vereniging) {
        this.vereniging = vereniging;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public Long getVoorkeursNrAanwezig() {
        return voorkeursNrAanwezig;
    }

    public void setVoorkeursNrAanwezig(Long voorkeursNrAanwezig) {
        this.voorkeursNrAanwezig = voorkeursNrAanwezig;
    }

    public Long getTekortMailTo() {
        return tekortMailTo;
    }

    public void setTekortMailTo(Long tekortMailTo) {
        this.tekortMailTo = tekortMailTo;
    }

    public Long getWaarschuwingMailTo() {
        return waarschuwingMailTo;
    }

    public void setWaarschuwingMailTo(Long waarschuwingMailTo) {
        this.waarschuwingMailTo = waarschuwingMailTo;
    }

    public Long getWaarschuwingMailDagen() {
        return waarschuwingMailDagen;
    }

    public void setWaarschuwingMailDagen(Long waarschuwingMailDagen) {
        this.waarschuwingMailDagen = waarschuwingMailDagen;
    }

    public Long getReminderDays() {
        return reminderDays;
    }

    public void setReminderDays(Long reminderDays) {
        this.reminderDays = reminderDays;
    }

    public Long getManagedCompetitieID() {
        return managedCompetitieID;
    }

    public void setManagedCompetitieID(Long managedCompetitieID) {
        this.managedCompetitieID = managedCompetitieID;
    }

    public Long getStrafpunten() {
        return strafpunten;
    }

    public void setStrafpunten(Long strafpunten) {
        this.strafpunten = strafpunten;
    }

    public String getAanvoerder() {
        return aanvoerder;
    }

    public void setAanvoerder(String aanvoerder) {
        this.aanvoerder = aanvoerder;
    }

    public List<Teammember> getTeammembers() {
        return teammembers;
    }

    public void setTeammembers(List<Teammember> teammembers) {
        this.teammembers = teammembers;
    }

    public List<Competition> getCompetitions() {
        return competitions;
    }

    public void setCompetitions(List<Competition> competitions) {
        this.competitions = competitions;
    }
}