package com.app.dream11.model;
/* loaded from: classes3.dex */
public class ReferralUserState {
    private String UserFullName;
    private String earningFromUser;
    private long id;
    private String imageUrl;
    private int isBlockedCashBonus;
    private String pendingFromUser;
    private String shortRefCode;
    private String teamName;
    private String totalRefferalAmount;
    private String userId;

    public String getTeamName() {
        String str = this.teamName;
        return str != null ? str : "";
    }

    public void setTeamName(String str) {
        this.teamName = str;
    }

    public String getEarningFromUser() {
        return this.earningFromUser;
    }

    public void setEarningFromUser(String str) {
        this.earningFromUser = str;
    }

    public String getUserId() {
        String str = this.userId;
        return str != null ? str : "";
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public String getPendingFromUser() {
        return this.pendingFromUser;
    }

    public void setPendingFromUser(String str) {
        this.pendingFromUser = str;
    }

    public String getTotalRefferalAmount() {
        return this.totalRefferalAmount;
    }

    public void setTotalRefferalAmount(String str) {
        this.totalRefferalAmount = str;
    }

    public String getUserFullName() {
        String str = this.UserFullName;
        return str != null ? str : "";
    }

    public String getDisplayName() {
        if (getUserFullName().length() > 0) {
            return getUserFullName();
        }
        if (getTeamName().length() > 0) {
            return getTeamName();
        }
        return getShortRefCode();
    }

    public void setUserFullName(String str) {
        this.UserFullName = str;
    }

    public String getShortRefCode() {
        String str = this.shortRefCode;
        return str != null ? str : "";
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public int getIsBlockedCashBonus() {
        return this.isBlockedCashBonus;
    }

    public void setIsBlockedCashBonus(int i) {
        this.isBlockedCashBonus = i;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long j) {
        this.id = j;
    }
}
