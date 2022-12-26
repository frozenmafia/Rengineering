package com.app.dream11.matchcentre;

import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class OnBoardingMatchCentreFlowState extends FlowState {
    private final String matchData;
    private final String matchDataKey;

    public OnBoardingMatchCentreFlowState() {
        this(null, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnBoardingMatchCentreFlowState(String str) {
        super(FlowStates.ON_BOARDING_MATCH_CENTER, null, 2, null);
        runAnimators.ag$a(str, "matchData");
        this.matchData = str;
        this.matchDataKey = "matchDataKey";
        putExtra("matchDataKey", str);
    }

    public /* synthetic */ OnBoardingMatchCentreFlowState(String str, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? "" : str);
    }

    public final String getMatchDataJson() {
        String string = getString(this.matchDataKey);
        return string == null ? "" : string;
    }
}
