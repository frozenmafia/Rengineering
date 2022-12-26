package com.app.dream11.verificationnew.common.event;

import com.app.dream11.integration.EventTracker;
import com.app.dream11.model.NewEvents;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getN;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class VerificationEventHelperKt$trackUploadVerificationDocDoneClicked$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ String $flow;
    final /* synthetic */ String $selection;
    final /* synthetic */ getN $this_trackUploadVerificationDocDoneClicked;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationEventHelperKt$trackUploadVerificationDocDoneClicked$1(String str, String str2, getN getn) {
        super(0);
        this.$flow = str;
        this.$selection = str2;
        this.$this_trackUploadVerificationDocDoneClicked = getn;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        NewEvents newEvents = new NewEvents("UploadVerificationDocDoneClicked");
        newEvents.addProperty("verificationFlow", this.$flow);
        newEvents.addProperty("selection", this.$selection);
        this.$this_trackUploadVerificationDocDoneClicked.trackEvent(newEvents, new EventTracker[0]);
    }
}
