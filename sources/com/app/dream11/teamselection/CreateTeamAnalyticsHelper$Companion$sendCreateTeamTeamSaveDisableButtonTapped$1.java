package com.app.dream11.teamselection;

import com.app.dream11.model.NewEvents;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.handleServiceConnected;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class CreateTeamAnalyticsHelper$Companion$sendCreateTeamTeamSaveDisableButtonTapped$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ handleServiceConnected $controller;
    final /* synthetic */ String $shareTeamSnapshotId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateTeamAnalyticsHelper$Companion$sendCreateTeamTeamSaveDisableButtonTapped$1(String str, handleServiceConnected handleserviceconnected) {
        super(0);
        this.$shareTeamSnapshotId = str;
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
        NewEvents newEvents = new NewEvents("CreateTeamTeamSaveDisableButtonTapped");
        newEvents.addProperty("snapshotId", this.$shareTeamSnapshotId);
        this.$controller.ag$a(newEvents);
    }
}
