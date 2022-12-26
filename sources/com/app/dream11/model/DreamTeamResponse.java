package com.app.dream11.model;

import com.app.dream11.core.service.graphql.api.FetchDreamTeamQuery;
import java.io.Serializable;
/* loaded from: classes3.dex */
public class DreamTeamResponse implements Serializable {
    private FetchDreamTeamQuery.Data data;
    private long roundId;
    private RoundInfo roundInfo;
    private int tourId;

    public FetchDreamTeamQuery.Data getDreamTeam() {
        return this.data;
    }

    public void setDreamTeam(FetchDreamTeamQuery.Data data) {
        this.data = data;
    }

    public void setRoundId(long j) {
        this.roundId = j;
    }

    public void setTourId(int i) {
        this.tourId = i;
    }

    public boolean isDreamTeamForRound(long j, int i) {
        return this.roundId == j && this.tourId == i;
    }

    public long getRoundId() {
        return this.roundId;
    }

    public RoundInfo getRoundInfo() {
        return this.roundInfo;
    }

    public void setRoundInfo(RoundInfo roundInfo) {
        this.roundInfo = roundInfo;
    }

    public int getTourId() {
        return this.tourId;
    }
}
