package com.app.dream11.model.viewmodel;
/* loaded from: classes3.dex */
public class LeaderboardRoundViewItem {
    String desc;
    String matchName;
    String points;
    int roundId;
    int teamId;
    int userId;

    public String getMatchName() {
        return this.matchName;
    }

    public void setMatchName(String str) {
        this.matchName = str;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public String getPoints() {
        return this.points;
    }

    public void setPoints(String str) {
        this.points = str;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int i) {
        this.userId = i;
    }

    public int getRoundId() {
        return this.roundId;
    }

    public void setRoundId(int i) {
        this.roundId = i;
    }

    public int getTeamId() {
        return this.teamId;
    }

    public void setTeamId(int i) {
        this.teamId = i;
    }
}
