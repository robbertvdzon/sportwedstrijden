package com.vdzon.msw.importmsw.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TeamDto implements Serializable {
    private String uuid;
    private String teamname;
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

    private List<TeammemberDto> teammembers = new ArrayList<>();
    private List<CompetitionDto> competitions = new ArrayList<>();

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

    public List<TeammemberDto> getTeammembers() {
        return teammembers;
    }

    public void setTeammembers(List<TeammemberDto> teammembers) {
        this.teammembers = teammembers;
    }

    public List<CompetitionDto> getCompetitions() {
        return competitions;
    }

    public void setCompetitions(List<CompetitionDto> competitions) {
        this.competitions = competitions;
    }
}