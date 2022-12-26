package com.app.dream11.model;
/* loaded from: classes3.dex */
public class ReferralUser {
    private double pendingByRefferal;
    private double earningByRefferal = 0.0d;
    private String teamName = "";
    private double totalToBeEarned = 0.0d;
    private double totalpending = 0.0d;
    private double totalJoinedRefferal = 0.0d;
    private double totalEarning = 0.0d;
    private String reffererId = "";
    private double totalRefferalAmount = 0.0d;

    public double getEarningByRefferal() {
        return this.earningByRefferal;
    }

    public void setEarningByRefferal(double d) {
        this.earningByRefferal = d;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public void setTeamName(String str) {
        this.teamName = str;
    }

    public double getTotalToBeEarned() {
        return this.totalToBeEarned;
    }

    public void setTotalToBeEarned(double d) {
        this.totalToBeEarned = d;
    }

    public double getTotalpending() {
        return this.totalpending;
    }

    public void setTotalpending(double d) {
        this.totalpending = d;
    }

    public double getTotalJoinedRefferal() {
        return this.totalJoinedRefferal;
    }

    public void setTotalJoinedRefferal(double d) {
        this.totalJoinedRefferal = d;
    }

    public double getTotalEarning() {
        return this.totalEarning;
    }

    public void setTotalEarning(double d) {
        this.totalEarning = d;
    }

    public String getReffererId() {
        return this.reffererId;
    }

    public void setReffererId(String str) {
        this.reffererId = str;
    }

    public double getTotalRefferalAmount() {
        return this.totalRefferalAmount;
    }

    public void setTotalRefferalAmount(double d) {
        this.totalRefferalAmount = d;
    }

    public double getPendingByRefferal() {
        return this.pendingByRefferal;
    }

    public void setPendingByRefferal(double d) {
        this.pendingByRefferal = d;
    }
}
