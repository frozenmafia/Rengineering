package com.app.dream11.model;

import com.app.dream11.core.service.graphql.api.ShmeCreateTeamQuery;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class RoundInfo {
    private List<MatchesDetails> MatchInfo;
    private String MatchStatus;
    private String RoundStartTime;
    private String TourFormat;
    private String TourName;
    private String TourTag;
    private String callFrom;
    private int roundId;
    private int showPlayerImages;

    public RoundInfo() {
    }

    public RoundInfo(MatchCentreBean matchCentreBean, ShmeCreateTeamQuery.Squad squad, ShmeCreateTeamQuery.Squad squad2) {
        this.RoundStartTime = matchCentreBean.getRoundStartTime() + "";
        this.MatchStatus = matchCentreBean.getRoundStatus();
        this.TourName = matchCentreBean.getTourName();
        this.showPlayerImages = 1;
        MatchesDetails matchesDetails = new MatchesDetails(squad, squad2);
        ArrayList arrayList = new ArrayList();
        this.MatchInfo = arrayList;
        arrayList.add(matchesDetails);
    }

    public String getTourTag() {
        return this.TourTag;
    }

    public void setTourTag(String str) {
        this.TourTag = str;
    }

    public String getTourFormat() {
        return this.TourFormat;
    }

    public void setTourFormat(String str) {
        this.TourFormat = str;
    }

    public String getTourName() {
        return this.TourName;
    }

    public void setTourName(String str) {
        this.TourName = str;
    }

    public List<MatchesDetails> getMatchInfo() {
        return this.MatchInfo;
    }

    public void setMatchInfo(List<MatchesDetails> list) {
        this.MatchInfo = list;
    }

    public String getRoundStartTime() {
        return this.RoundStartTime;
    }

    public void setRoundStartTime(String str) {
        this.RoundStartTime = str;
    }

    public String getMatchStatus() {
        return this.MatchStatus;
    }

    public void setMatchStatus(String str) {
        this.MatchStatus = str;
    }

    public String getCallFrom() {
        return this.callFrom;
    }

    public void setCallFrom(String str) {
        this.callFrom = str;
    }

    public int getShowPlayerImages() {
        return this.showPlayerImages;
    }

    public void setShowPlayerImages(int i) {
        this.showPlayerImages = i;
    }

    public int getRoundId() {
        return this.roundId;
    }

    public void setRoundId(int i) {
        this.roundId = i;
    }
}
