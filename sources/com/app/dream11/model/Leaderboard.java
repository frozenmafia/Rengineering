package com.app.dream11.model;
/* loaded from: classes3.dex */
public class Leaderboard {
    String avatarUrl;
    String points;
    String profilePicUrl;
    String rank;
    String rankFlag;
    String teamName;
    String userGuid;
    String userId;

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public String getRank() {
        return this.rank;
    }

    public void setRank(String str) {
        this.rank = str;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public void setTeamName(String str) {
        this.teamName = str;
    }

    public String getRankFlag() {
        return this.rankFlag;
    }

    public void setRankFlag(String str) {
        this.rankFlag = str;
    }

    public String getPoints() {
        return this.points;
    }

    public void setPoints(String str) {
        this.points = str;
    }

    public String getUserGuid() {
        return this.userGuid;
    }

    public void setUserGuid(String str) {
        this.userGuid = str;
    }

    public String getProfilePicUrl() {
        return this.profilePicUrl;
    }

    public void setProfilePicUrl(String str) {
        this.profilePicUrl = str;
    }
}
