package com.app.dream11.contest.unfilledspots;

import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.runAnimators;
/* loaded from: classes2.dex */
public final class UnfilledSpotsContestListingFlowState extends FlowState {
    private final int matchId;
    private final int tourId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnfilledSpotsContestListingFlowState(int i, int i2, String str) {
        super(FlowStates.UNFILLED_SPOTS_CONTEST_LISTING, null, str);
        runAnimators.ag$a(str, "slug");
        this.matchId = i;
        this.tourId = i2;
        putExtra("tourID", Integer.valueOf(i2));
        putExtra("roundID", Integer.valueOf(i));
    }

    public final int getMatchId() {
        return this.matchId;
    }

    public final int getTourId() {
        return this.tourId;
    }
}
