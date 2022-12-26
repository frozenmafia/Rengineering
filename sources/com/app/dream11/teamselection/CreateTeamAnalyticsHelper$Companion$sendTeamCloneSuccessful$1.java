package com.app.dream11.teamselection;

import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import com.app.dream11.model.EventCategory;
import com.app.dream11.model.NewEvents;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.handleServiceConnected;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class CreateTeamAnalyticsHelper$Companion$sendTeamCloneSuccessful$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ handleServiceConnected $controller;
    final /* synthetic */ int $roundId;
    final /* synthetic */ int $teamId;
    final /* synthetic */ int $tourId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateTeamAnalyticsHelper$Companion$sendTeamCloneSuccessful$1(int i, int i2, int i3, handleServiceConnected handleserviceconnected) {
        super(0);
        this.$roundId = i;
        this.$tourId = i2;
        this.$teamId = i3;
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
        NewEvents newEvents = new NewEvents("Team Clone Successful", EventCategory.$UNKNOWN);
        newEvents.addProperty(HeadToHeadMatchPickerFlowState.ROUND_ID, Integer.valueOf(this.$roundId));
        newEvents.addProperty("tourId", Integer.valueOf(this.$tourId));
        newEvents.addProperty("teamNumberCloned", Integer.valueOf(this.$teamId));
        this.$controller.ag$a(newEvents);
    }
}
