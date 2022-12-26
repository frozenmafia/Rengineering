package com.app.dream11.model.viewmodel;

import java.io.Serializable;
/* loaded from: classes3.dex */
public class LeaderBoardViewItem implements Serializable {
    private static final long serialVersionUID = 121;
    String avatar;
    int bgColor;
    boolean isWinner;
    String name;
    int nameColor;
    String points;
    String rank;
    int rankColor;
    int rankFlag;
    String userGuid;
    int userId;

    public String getAvatar() {
        return this.avatar;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getPoints() {
        return this.points;
    }

    public void setPoints(String str) {
        this.points = str;
    }

    public String getRank() {
        return this.rank;
    }

    public void setRank(String str) {
        this.rank = str;
    }

    public int getBgColor() {
        return this.bgColor;
    }

    public void setBgColor(int i) {
        this.bgColor = i;
    }

    public boolean isWinner() {
        return this.isWinner;
    }

    public void setWinner(boolean z) {
        this.isWinner = z;
    }

    public int getRankFlag() {
        return this.rankFlag;
    }

    public void setRankFlag(int i) {
        this.rankFlag = i;
    }

    public int getNameColor() {
        return this.nameColor;
    }

    public void setNameColor(int i) {
        this.nameColor = i;
    }

    public int getRankColor() {
        return this.rankColor;
    }

    public void setRankColor(int i) {
        this.rankColor = i;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int i) {
        this.userId = i;
    }

    public String getUserGuid() {
        return this.userGuid;
    }

    public void setUserGuid(String str) {
        this.userGuid = str;
    }
}
