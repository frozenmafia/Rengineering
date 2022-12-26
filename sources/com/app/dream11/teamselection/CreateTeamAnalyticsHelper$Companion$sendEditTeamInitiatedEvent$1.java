package com.app.dream11.teamselection;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.TrustedWebActivityCallbackRemote;
import o.handleServiceConnected;
import o.readFamily;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class CreateTeamAnalyticsHelper$Companion$sendEditTeamInitiatedEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ handleServiceConnected $controller;
    final /* synthetic */ int $teamId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateTeamAnalyticsHelper$Companion$sendEditTeamInitiatedEvent$1(handleServiceConnected handleserviceconnected, int i) {
        super(0);
        this.$controller = handleserviceconnected;
        this.$teamId = i;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        TrustedWebActivityCallbackRemote valueOf$7ccaadfe = this.$controller.valueOf$7ccaadfe();
        int ag$a = (int) this.$controller.ag$a();
        int ah$a = (int) this.$controller.ah$a();
        runAnimators.ah$a(valueOf$7ccaadfe, "feature");
        readFamily.toString(valueOf$7ccaadfe, "", Integer.valueOf(ah$a), Integer.valueOf(ag$a), this.$teamId);
    }
}
