package com.app.dream11.verificationnew.common.event;

import com.app.dream11.integration.EventTracker;
import com.app.dream11.model.NewEvents;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getN;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class VerificationEventHelperKt$trackUploadVerificationDocClicked$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ String $flow;
    final /* synthetic */ String $status;
    final /* synthetic */ getN $this_trackUploadVerificationDocClicked;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationEventHelperKt$trackUploadVerificationDocClicked$1(String str, String str2, getN getn) {
        super(0);
        this.$flow = str;
        this.$status = str2;
        this.$this_trackUploadVerificationDocClicked = getn;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        NewEvents newEvents = new NewEvents("UploadVerificationDocClicked");
        newEvents.addProperty("verificationFlow", this.$flow);
        newEvents.addProperty("status", this.$status);
        this.$this_trackUploadVerificationDocClicked.trackEvent(newEvents, new EventTracker[0]);
    }
}
