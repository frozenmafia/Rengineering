package com.app.dream11.teampreviewnew.flowstates;

import com.app.dream11.model.FlowState;
import com.app.dream11.teampreviewnew.HofTeamReqData;
import com.app.dream11.utils.FlowStates;
import java.io.Serializable;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class HofTeamPreviewFlowState extends FlowState {
    private final String HOF_TEAM_REQ_KEY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HofTeamPreviewFlowState(HofTeamReqData hofTeamReqData) {
        super(FlowStates.TEAM_PREVIEW_HOF, null, 2, null);
        runAnimators.ag$a(hofTeamReqData, "reqData");
        this.HOF_TEAM_REQ_KEY = "hof_team_prev_req_key";
        putExtra("hof_team_prev_req_key", hofTeamReqData);
    }

    public final Serializable getData() {
        return getExtra(this.HOF_TEAM_REQ_KEY);
    }
}
