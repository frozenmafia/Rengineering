package com.app.dream11.leaguelisting.contestinvite.flowstates;

import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.getTargetTypes;
/* loaded from: classes3.dex */
public final class ContestInvitationListFlowState extends FlowState {
    private final String argMatchId;
    private final String argTourID;

    public /* synthetic */ ContestInvitationListFlowState(int i, int i2, String str, int i3, getTargetTypes gettargettypes) {
        this(i, i2, (i3 & 4) != 0 ? null : str);
    }

    public ContestInvitationListFlowState(int i, int i2, String str) {
        super(FlowStates.CONTEST_INVITATION_LIST_FLOW_STATE, null, str);
        this.argMatchId = "roundID";
        this.argTourID = "tourID";
        putExtra("roundID", Integer.valueOf(i));
        putExtra("tourID", Integer.valueOf(i2));
    }

    public ContestInvitationListFlowState() {
        this(-1, -1, "");
    }

    public final int getMatchId() {
        return FlowState.getInt$default(this, this.argMatchId, 0, 2, null);
    }
}
