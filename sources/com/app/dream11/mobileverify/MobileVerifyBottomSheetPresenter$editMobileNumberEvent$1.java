package com.app.dream11.mobileverify;

import com.app.dream11.integration.EventTracker;
import com.app.dream11.model.NewEvents;
import kotlin.jvm.internal.Lambda;
import o.LinearSystem;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class MobileVerifyBottomSheetPresenter$editMobileNumberEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ LinearSystem this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileVerifyBottomSheetPresenter$editMobileNumberEvent$1(LinearSystem linearSystem) {
        super(0);
        this.this$0 = linearSystem;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.HaptikSDK$a().trackEvent(new NewEvents("EditMobileNumber").addProperty("mobileNumber", this.this$0.HaptikSDK$c()), new EventTracker[0]);
    }
}
