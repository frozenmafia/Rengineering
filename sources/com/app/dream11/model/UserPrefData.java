package com.app.dream11.model;
/* loaded from: classes3.dex */
public class UserPrefData {
    int SquadId;
    String SquadShortName;
    String SquadType;
    String TeamFlagUrl;
    private boolean isSelected;

    public int getSquadId() {
        return this.SquadId;
    }

    public void setSquadId(int i) {
        this.SquadId = i;
    }

    public String getSquadShortName() {
        return this.SquadShortName;
    }

    public void setSquadShortName(String str) {
        this.SquadShortName = str;
    }

    public String getSquadType() {
        return this.SquadType;
    }

    public void setSquadType(String str) {
        this.SquadType = str;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setSelected(boolean z) {
        this.isSelected = z;
    }

    public String getTeamFlagUrl() {
        return this.TeamFlagUrl;
    }

    public void setTeamFlagUrl(String str) {
        this.TeamFlagUrl = str;
    }
}
