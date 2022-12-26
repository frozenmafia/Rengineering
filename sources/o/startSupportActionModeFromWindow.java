package o;

import com.app.dream11.contest.teamcompare.CompareTeamFlowState;
import com.app.dream11.core.service.graphql.api.type.MatchStatus;
import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
/* loaded from: classes.dex */
public final class startSupportActionModeFromWindow extends endOnGoingFadeAnimation {
    private final getPanelState toString;

    @Override // o.endOnGoingFadeAnimation
    public void ag$a() {
    }

    @Override // o.endOnGoingFadeAnimation
    public void ah$a() {
    }

    @Override // o.endOnGoingFadeAnimation
    public boolean valueOf() {
        return true;
    }

    @Override // o.endOnGoingFadeAnimation
    public void values(MatchStatus matchStatus, int i, String str, String str2) {
        runAnimators.ag$a(matchStatus, HeadToHeadMatchPickerFlowState.MATCH_STATUS);
        runAnimators.ag$a(str, CompareTeamFlowState.MATCH_ID);
        runAnimators.ag$a(str2, CompareTeamFlowState.CONTEST_ID);
    }

    public startSupportActionModeFromWindow(getPanelState getpanelstate) {
        runAnimators.ag$a(getpanelstate, "callback");
        this.toString = getpanelstate;
    }
}
