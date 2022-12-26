package com.app.dream11.myprofile.newprofile.model;

import java.io.Serializable;
import o.invalidateFullSpansAfter;
import o.isFullSpan;
/* loaded from: classes6.dex */
public class TotalStats implements Serializable {
    private static final long serialVersionUID = -8271199840045349269L;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "currency")
    private String currency;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "matchesPlayed")
    private Integer matchesPlayed;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "seriesPlayed")
    private Integer seriesPlayed;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "totalAmtWon")
    private Double totalAmtWon;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "totalLeagueWon")
    private Integer totalLeagueWon;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "totalLeaguesPlayed")
    private Integer totalLeaguesPlayed;

    public Double getTotalAmtWon() {
        return this.totalAmtWon;
    }

    public void setTotalAmtWon(Double d) {
        this.totalAmtWon = d;
    }

    public Integer getTotalLeagueWon() {
        return this.totalLeagueWon;
    }

    public void setTotalLeagueWon(Integer num) {
        this.totalLeagueWon = num;
    }

    public Integer getTotalLeaguesPlayed() {
        return this.totalLeaguesPlayed;
    }

    public void setTotalLeaguesPlayed(Integer num) {
        this.totalLeaguesPlayed = num;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String str) {
        this.currency = str;
    }

    public Integer getMatchesPlayed() {
        return this.matchesPlayed;
    }

    public void setMatchesPlayed(Integer num) {
        this.matchesPlayed = num;
    }

    public Integer getSeriesPlayed() {
        return this.seriesPlayed;
    }

    public void setSeriesPlayed(Integer num) {
        this.seriesPlayed = num;
    }

    public String toString() {
        return "TotalStats{totalAmtWon=" + this.totalAmtWon + ", totalLeagueWon=" + this.totalLeagueWon + ", totalLeaguesPlayed=" + this.totalLeaguesPlayed + ", currency='" + this.currency + "', matchesPlayed=" + this.matchesPlayed + ", seriesPlayed=" + this.seriesPlayed + '}';
    }
}
