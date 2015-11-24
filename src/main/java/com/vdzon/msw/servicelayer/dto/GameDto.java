package com.vdzon.msw.servicelayer.dto;

import javax.persistence.*;
import java.io.Serializable;

public class GameDto implements Serializable {
    private String uuid;
    private String conpetitionUuid;
    private String tegenpartij;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getConpetitionUuid() {
        return conpetitionUuid;
    }

    public void setConpetitionUuid(String conpetitionUuid) {
        this.conpetitionUuid = conpetitionUuid;
    }

    public String getTegenpartij() {
        return tegenpartij;
    }

    public void setTegenpartij(String tegenpartij) {
        this.tegenpartij = tegenpartij;
    }
}