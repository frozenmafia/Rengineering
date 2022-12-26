package com.app.dream11.mobileverify;

import kotlin.jvm.internal.Lambda;
import o.LinearSystem;
import o.Styleable;
import o.readFamily;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class MobileVerifyBottomSheetPresenter$otpScreenVisibleEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ LinearSystem this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileVerifyBottomSheetPresenter$otpScreenVisibleEvent$1(LinearSystem linearSystem) {
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
        readFamily.toString(this.this$0.HaptikSDK$a(), this.this$0.ah$b().aj$a(), "mobile_verify_bottomsheet", this.this$0.HaptikSDK$a().getUtmRedirection());
    }
}
