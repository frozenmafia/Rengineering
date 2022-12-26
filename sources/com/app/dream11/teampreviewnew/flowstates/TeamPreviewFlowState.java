package com.app.dream11.teampreviewnew.flowstates;

import com.app.dream11.model.FlowState;
import com.app.dream11.teampreviewnew.TeamPreviewReqData;
import com.app.dream11.utils.FlowStates;
import java.io.Serializable;
import java.util.Objects;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class TeamPreviewFlowState extends FlowState {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeamPreviewFlowState(TeamPreviewReqData teamPreviewReqData) {
        super(FlowStates.TEAM_PREVIEW_NEW_WITHOUT_DATA, null, 2, null);
        runAnimators.ag$a(teamPreviewReqData, "reqData");
        putExtra("team_prev_req_key", teamPreviewReqData);
    }

    public final TeamPreviewReqData getRequestData() {
        Serializable extra = getExtra("team_prev_req_key");
        Objects.requireNonNull(extra, "null cannot be cast to non-null type com.app.dream11.teampreviewnew.TeamPreviewReqData");
        return (TeamPreviewReqData) extra;
    }
}
