package com.app.dream11.teamselection;

import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import com.app.dream11.model.EventCategory;
import com.app.dream11.model.NewEvents;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.handleServiceConnected;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class CreateTeamAnalyticsHelper$Companion$sendGuruScrollEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ handleServiceConnected $controller;
    final /* synthetic */ boolean $isScrollEnd;
    final /* synthetic */ int $playerCount;
    final /* synthetic */ String $playerTypeWise;
    final /* synthetic */ float $remainingCredits;
    final /* synthetic */ int $roundID;
    final /* synthetic */ String $teamWise;
    final /* synthetic */ int $tourID;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateTeamAnalyticsHelper$Companion$sendGuruScrollEvent$1(boolean z, float f, String str, String str2, int i, int i2, int i3, handleServiceConnected handleserviceconnected) {
        super(0);
        this.$isScrollEnd = z;
        this.$remainingCredits = f;
        this.$playerTypeWise = str;
        this.$teamWise = str2;
        this.$playerCount = i;
        this.$tourID = i2;
        this.$roundID = i3;
        this.$controller = handleserviceconnected;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$controller.ag$a(new NewEvents(this.$isScrollEnd ? "GuruScrollCompleted" : "GuruScrollInitiated", EventCategory.$UNKNOWN).addProperty("creditBalance", Float.valueOf(this.$remainingCredits)).addProperty("playerTypeCount", this.$playerTypeWise).addProperty("squadWiseCount", this.$teamWise).addProperty("playerCount", Integer.valueOf(this.$playerCount)).addProperty("tourId", Integer.valueOf(this.$tourID)).addProperty(HeadToHeadMatchPickerFlowState.ROUND_ID, Integer.valueOf(this.$roundID)));
    }
}
