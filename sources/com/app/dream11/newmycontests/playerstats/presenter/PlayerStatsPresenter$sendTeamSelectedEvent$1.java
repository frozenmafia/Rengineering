package com.app.dream11.newmycontests.playerstats.presenter;

import com.app.dream11.contest.teamcompare.CompareTeamFlowState;
import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
import o.setDebugSolverName;
/* loaded from: classes3.dex */
public final class PlayerStatsPresenter$sendTeamSelectedEvent$1 extends Lambda implements Styleable.ChangeBounds<Map<String, Serializable>, setAnimationMatrix> {
    final /* synthetic */ int $noOfTeams;
    final /* synthetic */ int $selectedTeamId;
    final /* synthetic */ double $teamPoints;
    final /* synthetic */ setDebugSolverName this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerStatsPresenter$sendTeamSelectedEvent$1(setDebugSolverName setdebugsolvername, int i, int i2, double d) {
        super(1);
        this.this$0 = setdebugsolvername;
        this.$noOfTeams = i;
        this.$selectedTeamId = i2;
        this.$teamPoints = d;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(Map<String, Serializable> map) {
        invoke2(map);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, Serializable> map) {
        runAnimators.ag$a(map, "$this$trackEvent");
        map.put("tourId", Integer.valueOf(this.this$0.getSignupData()));
        map.put(HeadToHeadMatchPickerFlowState.ROUND_ID, Integer.valueOf(this.this$0.HaptikSDK$a()));
        map.put(CompareTeamFlowState.CONTEST_ID, this.this$0.valueOf());
        map.put("roundStatus", this.this$0.ah$b());
        map.put("noofTeams", Integer.valueOf(this.$noOfTeams));
        map.put("teamSelected", Integer.valueOf(this.$selectedTeamId));
        map.put("pointsScored", Double.valueOf(this.$teamPoints));
    }
}
