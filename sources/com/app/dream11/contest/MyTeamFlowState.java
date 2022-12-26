package com.app.dream11.contest;

import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.getTargetTypes;
/* loaded from: classes.dex */
public final class MyTeamFlowState extends FlowState {
    private final String keyMatchId;
    private final String keyTourId;

    public MyTeamFlowState(String str, int i, int i2, Boolean bool) {
        super(FlowStates.MY_TEAMS, null, str);
        this.keyTourId = "tourID";
        this.keyMatchId = "roundID";
        putExtra("tourID", Integer.valueOf(i));
        putExtra("is_refresh_allowed", bool);
        putExtra("roundID", Integer.valueOf(i2));
    }

    public /* synthetic */ MyTeamFlowState(String str, int i, int i2, Boolean bool, int i3, getTargetTypes gettargettypes) {
        this(str, i, i2, (i3 & 8) != 0 ? null : bool);
    }
}
