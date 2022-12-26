package com.app.dream11.teamselection;

import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import com.app.dream11.model.EventCategory;
import com.app.dream11.model.NewEvents;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.handleServiceConnected;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class CreateTeamAnalyticsHelper$Companion$sendLineupsBannerClosedEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ handleServiceConnected $controller;
    final /* synthetic */ int $matchId;
    final /* synthetic */ int $teamId;
    final /* synthetic */ int $tourId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateTeamAnalyticsHelper$Companion$sendLineupsBannerClosedEvent$1(int i, int i2, int i3, handleServiceConnected handleserviceconnected) {
        super(0);
        this.$matchId = i;
        this.$teamId = i2;
        this.$tourId = i3;
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
        NewEvents newEvents = new NewEvents("LineupsBannerClosed", EventCategory.$UNKNOWN);
        newEvents.addProperty(HeadToHeadMatchPickerFlowState.ROUND_ID, Integer.valueOf(this.$matchId));
        newEvents.addProperty("teamId", Integer.valueOf(this.$teamId));
        newEvents.addProperty("tourId", Integer.valueOf(this.$tourId));
        this.$controller.ag$a(newEvents);
    }
}
