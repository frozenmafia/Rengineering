package com.app.dream11.verificationnew.common.event;

import com.app.dream11.integration.EventTracker;
import com.app.dream11.model.NewEvents;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getN;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class VerificationEventHelperKt$trackVerificationSubmitDetailsClicked$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ String $flow;
    final /* synthetic */ getN $this_trackVerificationSubmitDetailsClicked;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationEventHelperKt$trackVerificationSubmitDetailsClicked$1(String str, getN getn) {
        super(0);
        this.$flow = str;
        this.$this_trackVerificationSubmitDetailsClicked = getn;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        NewEvents newEvents = new NewEvents("VerificationSubmitDetailsClicked");
        newEvents.addProperty("verificationFlow", this.$flow);
        this.$this_trackVerificationSubmitDetailsClicked.trackEvent(newEvents, new EventTracker[0]);
    }
}
