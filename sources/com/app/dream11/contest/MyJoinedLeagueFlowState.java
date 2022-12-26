package com.app.dream11.contest;

import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.runAnimators;
/* loaded from: classes.dex */
public final class MyJoinedLeagueFlowState extends FlowState {
    private final String keyMatchId;
    private final String keyTourId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyJoinedLeagueFlowState(String str, int i, int i2) {
        super(FlowStates.JOINED_LEAGUE, null, str);
        runAnimators.ag$a(str, FlowState.WLS_SLUG);
        this.keyTourId = "tourID";
        this.keyMatchId = "roundID";
        putExtra("tourID", Integer.valueOf(i));
        putExtra("roundID", Integer.valueOf(i2));
    }
}
