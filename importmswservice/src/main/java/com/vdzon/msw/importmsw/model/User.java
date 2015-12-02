package com.vdzon.msw.importmsw.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    private Long id;
    private String username;
    private String email;
    private String name;
    private String password;
    private boolean activeAccount;
    private String activationID;
    private LocalDateTime creationDate;
    private String phonenumber;
    private String requestConnectTeam;
    private boolean proUser;
    @OneToMany(mappedBy = "userID", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Teammember> teammembers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public List<Teammember> getTeammembers() {
        return teammembers;
    }

    public void setTeammembers(List<Teammember> teammembers) {
        this.teammembers = teammembers;
    }
}