package com.app.dream11.model;
/* loaded from: classes3.dex */
public class InveCodeDetailsResponse {
    LeagueInfo league;
    MatchCentreBean rounds;
    Tours tours;

    public MatchCentreBean getRounds() {
        return this.rounds;
    }

    public void setRounds(MatchCentreBean matchCentreBean) {
        this.rounds = matchCentreBean;
    }

    public LeagueInfo getLeague() {
        return this.league;
    }

    public void setLeague(LeagueInfo leagueInfo) {
        this.league = leagueInfo;
    }

    public Tours getTours() {
        return this.tours;
    }

    public void setTours(Tours tours) {
        this.tours = tours;
    }
}
