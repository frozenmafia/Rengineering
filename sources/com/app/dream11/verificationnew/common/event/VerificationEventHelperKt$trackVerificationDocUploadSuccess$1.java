package com.app.dream11.verificationnew.common.event;

import com.app.dream11.integration.EventTracker;
import com.app.dream11.model.NewEvents;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getN;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class VerificationEventHelperKt$trackVerificationDocUploadSuccess$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ String $flow;
    final /* synthetic */ String $selection;
    final /* synthetic */ boolean $successFlag;
    final /* synthetic */ getN $this_trackVerificationDocUploadSuccess;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationEventHelperKt$trackVerificationDocUploadSuccess$1(boolean z, String str, String str2, getN getn) {
        super(0);
        this.$successFlag = z;
        this.$selection = str;
        this.$flow = str2;
        this.$this_trackVerificationDocUploadSuccess = getn;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        NewEvents newEvents = new NewEvents("VerificationDocUploadSuccess");
        newEvents.addProperty("successFlag", Boolean.valueOf(this.$successFlag));
        newEvents.addProperty("selection", this.$selection);
        newEvents.addProperty("verificationFlow", this.$flow);
        this.$this_trackVerificationDocUploadSuccess.trackEvent(newEvents, new EventTracker[0]);
    }
}
