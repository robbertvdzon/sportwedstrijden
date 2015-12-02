package com.vdzon.msw.servicelayer.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String uuid;
    private String username;
    private String passwd;
    private String permissions;
    private String email;
    private String name;
    private Boolean activeAccount;
    private String activationID;
    private LocalDateTime creationDate;
    private String phonenumber;
    private String requestConnectTeam;
    private Boolean proUser;


    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Teammember> teammembers = new ArrayList<>();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

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

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public List<Teammember> getTeammembers() {
        return teammembers;
    }

    public void setTeammembers(List<Teammember> teammembers) {
        this.teammembers = teammembers;
    }

    public void addTeammember(Teammember teammember){
        teammembers.add(teammember);
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