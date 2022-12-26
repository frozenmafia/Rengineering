package com.app.dream11.contest.scorecard.flowstate;

import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
/* loaded from: classes.dex */
public final class FullScorecardFlowState extends FlowState {
    private final String contestCategory;
    private final String contestId;
    private final String contestType;
    private final String entryFee;
    private final String prizeAmount;
    private final int roundId;
    private final String roundStatus;
    private final int tourId;

    public final int getRoundId() {
        return this.roundId;
    }

    public final int getTourId() {
        return this.tourId;
    }

    public final String getEntryFee() {
        return this.entryFee;
    }

    public final String getPrizeAmount() {
        return this.prizeAmount;
    }

    public final String getRoundStatus() {
        return this.roundStatus;
    }

    public final String getContestId() {
        return this.contestId;
    }

    public final String getContestType() {
        return this.contestType;
    }

    public FullScorecardFlowState(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6) {
        super(FlowStates.FULL_SCORECARD, null, 2, null);
        this.roundId = i;
        this.tourId = i2;
        this.entryFee = str;
        this.prizeAmount = str2;
        this.roundStatus = str3;
        this.contestId = str4;
        this.contestType = str5;
        this.contestCategory = str6;
    }

    public final String getContestCategory() {
        return this.contestCategory;
    }
}
