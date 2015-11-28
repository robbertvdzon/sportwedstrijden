package com.vdzon.msw.importmsw.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "team")
public class Team implements Serializable {

    @Id
    private Long id;
    private String teamname	;
    private String listname1;
    private String listname2;
    private String listname3;
    private String listname4;
    private String listname5;
    private String listname6;
    private String listname7;
    private String listname8;
    private String listname9;
    private String listname10;
    private Long listtype1;
    private Long listtype2;
    private Long listtype3;
    private Long listtype4;
    private Long listtype5;
    private Long listtype6;
    private Long listtype7;
    private Long listtype8;
    private Long listtype9;
    private Long listtype10;
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
    private String email;
    @OneToMany(mappedBy = "teamID", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Competition> competitions;
    @OneToMany(mappedBy = "team", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Teammember> teammembers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public String getListname1() {
        return listname1;
    }

    public void setListname1(String listname1) {
        this.listname1 = listname1;
    }

    public String getListname2() {
        return listname2;
    }

    public void setListname2(String listname2) {
        this.listname2 = listname2;
    }

    public String getListname3() {
        return listname3;
    }

    public void setListname3(String listname3) {
        this.listname3 = listname3;
    }

    public String getListname4() {
        return listname4;
    }

    public void setListname4(String listname4) {
        this.listname4 = listname4;
    }

    public String getListname5() {
        return listname5;
    }

    public void setListname5(String listname5) {
        this.listname5 = listname5;
    }

    public String getListname6() {
        return listname6;
    }

    public void setListname6(String listname6) {
        this.listname6 = listname6;
    }

    public String getListname7() {
        return listname7;
    }

    public void setListname7(String listname7) {
        this.listname7 = listname7;
    }

    public String getListname8() {
        return listname8;
    }

    public void setListname8(String listname8) {
        this.listname8 = listname8;
    }

    public String getListname9() {
        return listname9;
    }

    public void setListname9(String listname9) {
        this.listname9 = listname9;
    }

    public String getListname10() {
        return listname10;
    }

    public void setListname10(String listname10) {
        this.listname10 = listname10;
    }

    public Long getListtype1() {
        return listtype1;
    }

    public void setListtype1(Long listtype1) {
        this.listtype1 = listtype1;
    }

    public Long getListtype2() {
        return listtype2;
    }

    public void setListtype2(Long listtype2) {
        this.listtype2 = listtype2;
    }

    public Long getListtype3() {
        return listtype3;
    }

    public void setListtype3(Long listtype3) {
        this.listtype3 = listtype3;
    }

    public Long getListtype4() {
        return listtype4;
    }

    public void setListtype4(Long listtype4) {
        this.listtype4 = listtype4;
    }

    public Long getListtype5() {
        return listtype5;
    }

    public void setListtype5(Long listtype5) {
        this.listtype5 = listtype5;
    }

    public Long getListtype6() {
        return listtype6;
    }

    public void setListtype6(Long listtype6) {
        this.listtype6 = listtype6;
    }

    public Long getListtype7() {
        return listtype7;
    }

    public void setListtype7(Long listtype7) {
        this.listtype7 = listtype7;
    }

    public Long getListtype8() {
        return listtype8;
    }

    public void setListtype8(Long listtype8) {
        this.listtype8 = listtype8;
    }

    public Long getListtype9() {
        return listtype9;
    }

    public void setListtype9(Long listtype9) {
        this.listtype9 = listtype9;
    }

    public Long getListtype10() {
        return listtype10;
    }

    public void setListtype10(Long listtype10) {
        this.listtype10 = listtype10;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Competition> getCompetitions() {
        return competitions;
    }

    public void setCompetitions(List<Competition> competitions) {
        this.competitions = competitions;
    }

    public List<Teammember> getTeammembers() {
        return teammembers;
    }

    public void setTeammembers(List<Teammember> teammembers) {
        this.teammembers = teammembers;
    }
}