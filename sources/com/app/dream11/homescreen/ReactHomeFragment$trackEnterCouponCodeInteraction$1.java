package com.app.dream11.homescreen;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.isValidConnection;
import o.readFamily;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ReactHomeFragment$trackEnterCouponCodeInteraction$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ String $action;
    final /* synthetic */ String $couponCode;
    final /* synthetic */ ReactHomeFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactHomeFragment$trackEnterCouponCodeInteraction$1(ReactHomeFragment reactHomeFragment, String str, String str2) {
        super(0);
        this.this$0 = reactHomeFragment;
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
        isValidConnection HaptikSDK$d;
        HaptikSDK$d = this.this$0.HaptikSDK$d();
        readFamily.toString(HaptikSDK$d, this.$couponCode, this.$action);
    }
}
