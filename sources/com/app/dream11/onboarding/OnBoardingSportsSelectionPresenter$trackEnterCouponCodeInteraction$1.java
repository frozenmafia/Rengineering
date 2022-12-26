package com.app.dream11.onboarding;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.isValidConnection;
import o.readFamily;
import o.setAnimationMatrix;
import o.setLastVerticalStyle;
/* loaded from: classes3.dex */
public final class OnBoardingSportsSelectionPresenter$trackEnterCouponCodeInteraction$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ String $action;
    final /* synthetic */ String $couponCode;
    final /* synthetic */ setLastVerticalStyle this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnBoardingSportsSelectionPresenter$trackEnterCouponCodeInteraction$1(setLastVerticalStyle setlastverticalstyle, String str, String str2) {
        super(0);
        this.this$0 = setlastverticalstyle;
        this.$couponCode = str;
        this.$action = str2;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        isValidConnection isvalidconnection;
        isvalidconnection = this.this$0.toString;
        readFamily.toString(isvalidconnection, this.$couponCode, this.$action);
    }
}
