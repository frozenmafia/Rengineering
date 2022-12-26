package com.app.dream11.model;

import java.io.Serializable;
/* loaded from: classes3.dex */
public class Squads implements Serializable {
    private static final long serialVersionUID = 121;
    private boolean isFlagWithNameArray = false;
    private String squadFlagUrl;
    private String squadId;
    private String squadJerseyUrl;
    private String squadName;
    private String squadShortName;

    public String getSquadShortName() {
        return this.squadShortName;
    }

    public void setSquadShortName(String str) {
        this.squadShortName = str;
    }

    public String getSquadId() {
        return this.squadId;
    }

    public void setSquadId(String str) {
        this.squadId = str;
    }

    public String getSquadName() {
        return this.squadName;
    }

    public void setSquadName(String str) {
        this.squadName = str;
    }

    public String getSquadFlagUrl() {
        return this.squadFlagUrl;
    }

    public void setSquadFlagUrl(String str) {
        this.squadFlagUrl = str;
    }

    public String getSquadJerseyUrl() {
        return this.squadJerseyUrl;
    }

    public void setSquadJerseyUrl(String str) {
        this.squadJerseyUrl = str;
    }

    public boolean isFlagWithNameArray() {
        return this.isFlagWithNameArray;
    }

    public void setFlagWithNameArray(boolean z) {
        this.isFlagWithNameArray = z;
    }
}
