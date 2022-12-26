package com.app.dream11.model;

import java.io.Serializable;
/* loaded from: classes6.dex */
public class LeagueMember implements Serializable {
    private static final long serialVersionUID = 121;
    private int AmountWonEuro;
    private double AmountWonINR;
    private double AmountWonUSD;
    private String AvatarUrl;
    private int CreatedBy;
    private double CurrentPoints;
    private int IsLocked;
    private String LeagueId;
    private String LeaguePrizeTitle;
    private String LeagueType;
    private double PrevPoints;
    private int PrevRank;
    private int Rank;
    private int RankFlag;
    private int RoundId;
    private int TeamId;
    private String TeamName;
    private int TourId;
    private int UserId;
    private int WLSId;
    private int splitWinnerCount;

    public int getWLSId() {
        return this.WLSId;
    }

    public void setWLSId(int i) {
        this.WLSId = i;
    }

    public int getRankFlag() {
        return this.RankFlag;
    }

    public void setRankFlag(int i) {
        this.RankFlag = i;
    }

    public String getLeagueId() {
        return this.LeagueId;
    }

    public void setLeagueId(String str) {
        this.LeagueId = str;
    }

    public int getRoundId() {
        return this.RoundId;
    }

    public void setRoundId(int i) {
        this.RoundId = i;
    }

    public int getTourId() {
        return this.TourId;
    }

    public void setTourId(int i) {
        this.TourId = i;
    }

    public int getTeamId() {
        return this.TeamId;
    }

    public void setTeamId(int i) {
        this.TeamId = i;
    }

    public int getUserId() {
        return this.UserId;
    }

    public void setUserId(int i) {
        this.UserId = i;
    }

    public String getTeamName() {
        return this.TeamName;
    }

    public void setTeamName(String str) {
        this.TeamName = str;
    }

    public double getCurrentPoints() {
        return this.CurrentPoints;
    }

    public void setCurrentPoints(double d) {
        this.CurrentPoints = d;
    }

    public int getRank() {
        return this.Rank;
    }

    public void setRank(int i) {
        this.Rank = i;
    }

    public int getIsLocked() {
        return this.IsLocked;
    }

    public void setIsLocked(int i) {
        this.IsLocked = i;
    }

    public int getCreatedBy() {
        return this.CreatedBy;
    }

    public void setCreatedBy(int i) {
        this.CreatedBy = i;
    }

    public String getLeagueType() {
        return this.LeagueType;
    }

    public void setLeagueType(String str) {
        this.LeagueType = str;
    }

    public double getPrevPoints() {
        return this.PrevPoints;
    }

    public void setPrevPoints(int i) {
        this.PrevPoints = i;
    }

    public int getPrevRank() {
        return this.PrevRank;
    }

    public void setPrevRank(int i) {
        this.PrevRank = i;
    }

    public int getAmountWonEuro() {
        return this.AmountWonEuro;
    }

    public void setAmountWonEuro(int i) {
        this.AmountWonEuro = i;
    }

    public double getAmountWonUSD() {
        return this.AmountWonUSD;
    }

    public void setAmountWonUSD(int i) {
        this.AmountWonUSD = i;
    }

    public double getAmountWonINR() {
        return this.AmountWonINR;
    }

    public void setAmountWonINR(int i) {
        this.AmountWonINR = i;
    }

    public String getLeaguePrizeTitle() {
        return this.LeaguePrizeTitle;
    }

    public void setLeaguePrizeTitle(String str) {
        this.LeaguePrizeTitle = str;
    }

    public int getSplitWinnerCount() {
        return this.splitWinnerCount - 1;
    }

    public void setSplitWinnerCount(int i) {
        this.splitWinnerCount = i;
    }

    public String getAvatarUrl() {
        return this.AvatarUrl;
    }

    public void setAvatarUrl(String str) {
        this.AvatarUrl = str;
    }
}
