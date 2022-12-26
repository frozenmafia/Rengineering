package com.app.dream11.myprofile.newprofile.model;

import java.io.Serializable;
import o.invalidateFullSpansAfter;
import o.isFullSpan;
/* loaded from: classes6.dex */
public class Squad implements Serializable {
    private static final long serialVersionUID = -3561761662381881933L;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "squadFlagName")
    private String squadFlagName;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "squadFlagUrl")
    private String squadFlagUrl;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "squadId")
    private int squadId;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "squadName")
    private String squadName;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "squadShortName")
    private String squadShortName;

    public int getSquadId() {
        return this.squadId;
    }

    public void setSquadId(int i) {
        this.squadId = i;
    }

    public String getSquadName() {
        return this.squadName;
    }

    public void setSquadName(String str) {
        this.squadName = str;
    }

    public String getSquadShortName() {
        return this.squadShortName;
    }

    public void setSquadShortName(String str) {
        this.squadShortName = str;
    }

    public String getSquadFlagName() {
        return this.squadFlagName;
    }

    public void setSquadFlagName(String str) {
        this.squadFlagName = str;
    }

    public String getSquadFlagUrl() {
        return this.squadFlagUrl;
    }

    public void setSquadFlagUrl(String str) {
        this.squadFlagUrl = str;
    }

    public String toString() {
        return "Squad{squadId=" + this.squadId + ", squadName='" + this.squadName + "', squadShortName='" + this.squadShortName + "', squadFlagName='" + this.squadFlagName + "', squadFlagUrl='" + this.squadFlagUrl + "'}";
    }
}
