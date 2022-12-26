package com.app.dream11.model;
/* loaded from: classes3.dex */
public class LeaderBoardTeamStat {
    String matches;
    String roundDate;
    int roundId;
    String roundName;
    double score;
    int teamId;
    String userGuid;
    int userId;

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int i) {
        this.userId = i;
    }

    public int getRoundId() {
        return this.roundId;
    }

    public int getTeamId() {
        return this.teamId;
    }

    public void setTeamId(int i) {
        this.teamId = i;
    }

    public String getRoundDate() {
        return this.roundDate;
    }

    public void setRoundDate(String str) {
        this.roundDate = str;
    }

    public String getRoundName() {
        return this.roundName;
    }

    public void setRoundName(String str) {
        this.roundName = str;
    }

    public String getMatches() {
        return this.matches;
    }

    public void setMatches(String str) {
        this.matches = str;
    }

    public double getPoints() {
        return this.score;
    }

    public void setPoints(double d) {
        this.score = d;
    }

    public String getUserGuid() {
        return this.userGuid;
    }

    public void setUserGuid(String str) {
        this.userGuid = str;
    }
}
