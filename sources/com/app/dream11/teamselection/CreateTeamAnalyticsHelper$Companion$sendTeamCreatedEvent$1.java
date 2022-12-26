package com.app.dream11.teamselection;

import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import com.app.dream11.model.EventCategory;
import com.app.dream11.model.NewEvents;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.handleServiceConnected;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class CreateTeamAnalyticsHelper$Companion$sendTeamCreatedEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ handleServiceConnected $controller;
    final /* synthetic */ int $roundId;
    final /* synthetic */ int $tourId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateTeamAnalyticsHelper$Companion$sendTeamCreatedEvent$1(int i, int i2, handleServiceConnected handleserviceconnected) {
        super(0);
        this.$roundId = i;
        this.$tourId = i2;
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
        NewEvents newEvents = new NewEvents("TeamSavedClient", EventCategory.$UNKNOWN);
        newEvents.addProperty(HeadToHeadMatchPickerFlowState.ROUND_ID, Integer.valueOf(this.$roundId));
        newEvents.addProperty("tourId", Integer.valueOf(this.$tourId));
        this.$controller.ag$a(newEvents);
    }
}
