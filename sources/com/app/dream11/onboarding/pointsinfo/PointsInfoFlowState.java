package com.app.dream11.onboarding.pointsinfo;

import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
/* loaded from: classes3.dex */
public final class PointsInfoFlowState extends FlowState {
    private final String calledFrom;
    private final int roundId;
    private final int tourId;

    public PointsInfoFlowState(int i, int i2, String str) {
        super(FlowStates.POINTS_INFO_ONBOARDING, null, 2, null);
        this.roundId = i;
        this.tourId = i2;
        this.calledFrom = str;
    }

    public final String getCalledFrom() {
        return this.calledFrom;
    }

    public final int getRoundId() {
        return this.roundId;
    }

    public final int getTourId() {
        return this.tourId;
    }
}
