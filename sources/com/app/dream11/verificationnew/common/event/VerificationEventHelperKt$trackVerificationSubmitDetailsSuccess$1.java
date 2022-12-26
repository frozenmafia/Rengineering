package com.app.dream11.verificationnew.common.event;

import com.app.dream11.integration.EventTracker;
import com.app.dream11.model.NewEvents;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getN;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class VerificationEventHelperKt$trackVerificationSubmitDetailsSuccess$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ String $errorMessage;
    final /* synthetic */ String $flow;
    final /* synthetic */ boolean $successFlag;
    final /* synthetic */ getN $this_trackVerificationSubmitDetailsSuccess;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationEventHelperKt$trackVerificationSubmitDetailsSuccess$1(String str, boolean z, String str2, getN getn) {
        super(0);
        this.$flow = str;
        this.$successFlag = z;
        this.$errorMessage = str2;
        this.$this_trackVerificationSubmitDetailsSuccess = getn;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        NewEvents newEvents = new NewEvents("VerificationSubmitDetailsSuccess");
        newEvents.addProperty("verificationFlow", this.$flow);
        newEvents.addProperty("successFlag", Boolean.valueOf(this.$successFlag));
        String str = this.$errorMessage;
        if (str != null) {
            newEvents.addProperty("errorMessage", str);
        }
        this.$this_trackVerificationSubmitDetailsSuccess.trackEvent(newEvents, new EventTracker[0]);
    }
}
