package com.app.dream11.verificationnew.common.event;

import com.app.dream11.integration.EventTracker;
import com.app.dream11.model.NewEvents;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getN;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class VerificationEventHelperKt$trackVerificationImagePreviewed$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ String $flow;
    final /* synthetic */ String $status;
    final /* synthetic */ getN $this_trackVerificationImagePreviewed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VerificationEventHelperKt$trackVerificationImagePreviewed$1(String str, String str2, getN getn) {
        super(0);
        this.$flow = str;
        this.$status = str2;
        this.$this_trackVerificationImagePreviewed = getn;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        NewEvents newEvents = new NewEvents("VerificationImagePreviewed");
        newEvents.addProperty("verificationFlow", this.$flow);
        newEvents.addProperty("status", this.$status);
        this.$this_trackVerificationImagePreviewed.trackEvent(newEvents, new EventTracker[0]);
    }
}
