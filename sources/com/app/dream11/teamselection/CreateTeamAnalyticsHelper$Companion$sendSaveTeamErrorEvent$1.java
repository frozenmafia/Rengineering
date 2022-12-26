package com.app.dream11.teamselection;

import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import com.app.dream11.model.EventCategory;
import com.app.dream11.model.NewEvents;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.handleServiceConnected;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class CreateTeamAnalyticsHelper$Companion$sendSaveTeamErrorEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ handleServiceConnected $controller;
    final /* synthetic */ int $errorCode;
    final /* synthetic */ String $message;
    final /* synthetic */ int $roundId;
    final /* synthetic */ int $teamId;
    final /* synthetic */ String $type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateTeamAnalyticsHelper$Companion$sendSaveTeamErrorEvent$1(int i, String str, int i2, String str2, int i3, handleServiceConnected handleserviceconnected) {
        super(0);
        this.$errorCode = i;
        this.$type = str;
        this.$teamId = i2;
        this.$message = str2;
        this.$roundId = i3;
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
        NewEvents newEvents = new NewEvents("TeamSaveFailed", EventCategory.$UNKNOWN);
        newEvents.addProperty("statusCode", Integer.valueOf(this.$errorCode));
        newEvents.addProperty("type", this.$type);
        newEvents.addProperty("teamId", Integer.valueOf(this.$teamId));
        newEvents.addProperty("errorMessage", this.$message);
        newEvents.addProperty(HeadToHeadMatchPickerFlowState.ROUND_ID, Integer.valueOf(this.$roundId));
        this.$controller.ag$a(newEvents);
    }
}
