package com.app.dream11.notifications.usersubscribednotification;

import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.getTargetTypes;
/* loaded from: classes3.dex */
public final class TourLevelNotificationFlowState extends FlowState {
    private final int roundId;
    private final long roundLockStartTime;
    private final int tourId;

    public /* synthetic */ TourLevelNotificationFlowState(int i, int i2, long j, int i3, getTargetTypes gettargettypes) {
        this(i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? -1L : j);
    }

    public final int getRoundId() {
        return this.roundId;
    }

    public final long getRoundLockStartTime() {
        return this.roundLockStartTime;
    }

    public final int getTourId() {
        return this.tourId;
    }

    public TourLevelNotificationFlowState(int i, int i2, long j) {
        super(FlowStates.USER_SUBSCRIBE_NOTIFICATION, null, 2, null);
        this.tourId = i;
        this.roundId = i2;
        this.roundLockStartTime = j;
    }
}
