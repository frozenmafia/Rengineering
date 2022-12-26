package com.app.dream11.leaguelisting.multipalteam;

import android.os.Bundle;
import com.app.dream11.contest.teamcompare.CompareTeamFlowState;
import com.app.dream11.model.FlowState;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class TeamSelectionFragment$ah$a {
    public /* synthetic */ TeamSelectionFragment$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    private TeamSelectionFragment$ah$a() {
    }

    public final TeamSelectionFragment ah$a(int i, String str, String str2) {
        runAnimators.ag$a(str, CompareTeamFlowState.CONTEST_ID);
        runAnimators.ag$a(str2, FlowState.WLS_SLUG);
        TeamSelectionFragment teamSelectionFragment = new TeamSelectionFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("match_id", i);
        bundle.putString("contest_id", str);
        bundle.putString("slug_id", str2);
        teamSelectionFragment.setArguments(bundle);
        return teamSelectionFragment;
    }
}
