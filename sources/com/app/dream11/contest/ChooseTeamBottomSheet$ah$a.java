package com.app.dream11.contest;

import android.os.Bundle;
import com.app.dream11.contest.teamcompare.CompareTeamFlowState;
import com.app.dream11.model.FlowState;
import o.getTargetTypes;
import o.runAnimators;
import o.setProperty;
/* loaded from: classes.dex */
public final class ChooseTeamBottomSheet$ah$a {
    public /* synthetic */ ChooseTeamBottomSheet$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    private ChooseTeamBottomSheet$ah$a() {
    }

    public final ChooseTeamBottomSheet values(int i, String str, String str2) {
        setProperty setproperty;
        setProperty setproperty2;
        setProperty setproperty3;
        runAnimators.ag$a(str, CompareTeamFlowState.CONTEST_ID);
        runAnimators.ag$a(str2, FlowState.WLS_SLUG);
        ChooseTeamBottomSheet chooseTeamBottomSheet = new ChooseTeamBottomSheet();
        Bundle bundle = new Bundle();
        bundle.putInt("match_id", i);
        bundle.putString("contest_id", str);
        bundle.putString("slug_id", str2);
        chooseTeamBottomSheet.setArguments(bundle);
        setproperty = chooseTeamBottomSheet.HaptikSDK$c;
        setproperty.toString(i);
        setproperty2 = chooseTeamBottomSheet.HaptikSDK$c;
        setproperty2.ag$a(str);
        setproperty3 = chooseTeamBottomSheet.HaptikSDK$c;
        setproperty3.ah$a(str2);
        return chooseTeamBottomSheet;
    }
}
