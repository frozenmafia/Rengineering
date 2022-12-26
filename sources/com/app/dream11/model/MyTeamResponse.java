package com.app.dream11.model;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class MyTeamResponse {
    String MatchStatus;
    String Points;
    boolean isSelfTeam = false;
    MatchCentreBean round;
    RoundInfo roundInfo;
    List<playerSquads> squads;
    String teamName;
    ArrayList<MyTeamModel> userTeams;

    public ArrayList<MyTeamModel> getUserTeams() {
        return this.userTeams;
    }

    public void setUserTeams(ArrayList<MyTeamModel> arrayList) {
        this.userTeams = arrayList;
    }

    public RoundInfo getRoundInfo() {
        return this.roundInfo;
    }

    public MatchCentreBean getRound() {
        return this.round;
    }

    public void setSquads(List<playerSquads> list) {
        this.squads = list;
    }

    public List<playerSquads> getSquads() {
        return this.squads;
    }

    public void setRoundInfo(RoundInfo roundInfo) {
        this.roundInfo = roundInfo;
    }

    public String getPoints() {
        return this.Points;
    }

    public String getMatchStatus() {
        return this.MatchStatus;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public void setTeamName(String str) {
        this.teamName = str;
    }

    public boolean isSelfTeam() {
        return this.isSelfTeam;
    }

    public void setSelfTeam(boolean z) {
        this.isSelfTeam = z;
    }
}
