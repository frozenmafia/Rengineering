package com.app.dream11.myprofile.newprofile.model;

import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import o.invalidateFullSpansAfter;
import o.isFullSpan;
/* loaded from: classes6.dex */
public class RecentPerformanceItem implements Serializable {
    private static final long serialVersionUID = -2330708641380338665L;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "compareMessage")
    private String compareMessage;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = HeadToHeadMatchPickerFlowState.ROUND_ID)
    private int roundId;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "roundName")
    private String roundName;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "roundStartTime")
    private String roundStartTime;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "scorecard")
    private Scorecard scorecard;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "selfPoints")
    private SelfPoints selfPoints;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "squads")
    private List<Squad> squads = new ArrayList();
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "userName")
    private String userName;
    @invalidateFullSpansAfter
    @isFullSpan(valueOf = "userPoints")
    private UserPoints userPoints;

    public Scorecard getScorecard() {
        return this.scorecard;
    }

    public void setScorecard(Scorecard scorecard) {
        this.scorecard = scorecard;
    }

    public UserPoints getUserPoints() {
        return this.userPoints;
    }

    public void setUserPoints(UserPoints userPoints) {
        this.userPoints = userPoints;
    }

    public SelfPoints getSelfPoints() {
        return this.selfPoints;
    }

    public void setSelfPoints(SelfPoints selfPoints) {
        this.selfPoints = selfPoints;
    }

    public int getRoundId() {
        return this.roundId;
    }

    public void setRoundId(int i) {
        this.roundId = i;
    }

    public String getRoundName() {
        return this.roundName;
    }

    public void setRoundName(String str) {
        this.roundName = str;
    }

    public String getRoundStartTime() {
        return this.roundStartTime;
    }

    public void setRoundStartTime(String str) {
        this.roundStartTime = str;
    }

    public List<Squad> getSquads() {
        return this.squads;
    }

    public void setSquads(List<Squad> list) {
        this.squads = list;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getCompareMessage() {
        return this.compareMessage;
    }

    public String toString() {
        return "RecentPerformanceItem{scorecard=" + this.scorecard + ", userPoints=" + this.userPoints + ", selfPoints=" + this.selfPoints + ", roundId='" + this.roundId + "', roundName='" + this.roundName + "', roundStartTime='" + this.roundStartTime + "', userName='" + this.userName + "', squads=" + this.squads + '}';
    }
}
