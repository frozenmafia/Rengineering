package com.app.dream11.contest.ui.mynetwork;

import com.app.dream11.core.service.graphql.api.type.MatchStatus;
import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.runAnimators;
/* loaded from: classes2.dex */
public final class MyNetworkFlowState extends FlowState {
    private final int matchId;
    private final MatchStatus matchStatus;
    private final String site;
    private final int tourId;

    public final int getMatchId() {
        return this.matchId;
    }

    public final int getTourId() {
        return this.tourId;
    }

    public final MatchStatus getMatchStatus() {
        return this.matchStatus;
    }

    public final String getSite() {
        return this.site;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyNetworkFlowState(int i, int i2, MatchStatus matchStatus, String str) {
        super(FlowStates.MY_NETWORK, null, str);
        runAnimators.ag$a(matchStatus, HeadToHeadMatchPickerFlowState.MATCH_STATUS);
        this.matchId = i;
        this.tourId = i2;
        this.matchStatus = matchStatus;
        this.site = str;
    }
}
