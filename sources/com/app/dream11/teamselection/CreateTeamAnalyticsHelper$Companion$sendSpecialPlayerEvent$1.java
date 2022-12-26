package com.app.dream11.teamselection;

import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import com.app.dream11.model.EventCategory;
import com.app.dream11.model.NewEvents;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.handleServiceConnected;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class CreateTeamAnalyticsHelper$Companion$sendSpecialPlayerEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ handleServiceConnected $controller;
    final /* synthetic */ String $name;
    final /* synthetic */ boolean $recommendedSelected;
    final /* synthetic */ int $roundId;
    final /* synthetic */ String $screenName;
    final /* synthetic */ String $shareTeamSnapshotId;
    final /* synthetic */ int $tourId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateTeamAnalyticsHelper$Companion$sendSpecialPlayerEvent$1(String str, String str2, int i, int i2, boolean z, String str3, handleServiceConnected handleserviceconnected) {
        super(0);
        this.$name = str;
        this.$screenName = str2;
        this.$roundId = i;
        this.$tourId = i2;
        this.$recommendedSelected = z;
        this.$shareTeamSnapshotId = str3;
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
        String str = this.$name;
        NewEvents newEvents = new NewEvents(str + " Selected", EventCategory.$UNKNOWN);
        newEvents.addProperty("Screen", this.$screenName);
        newEvents.addProperty(HeadToHeadMatchPickerFlowState.ROUND_ID, Integer.valueOf(this.$roundId));
        newEvents.addProperty("tourId", Integer.valueOf(this.$tourId));
        newEvents.addProperty("recommended_selected", Boolean.valueOf(this.$recommendedSelected));
        newEvents.addProperty("snapshotId", this.$shareTeamSnapshotId);
        this.$controller.ag$a(newEvents);
    }
}
