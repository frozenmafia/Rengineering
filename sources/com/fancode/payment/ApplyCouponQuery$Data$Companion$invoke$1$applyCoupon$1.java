package com.fancode.payment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes6.dex */
final class ApplyCouponQuery$Data$Companion$invoke$1$applyCoupon$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ApplyCouponQuery$ah$a> {
    public static final ApplyCouponQuery$Data$Companion$invoke$1$applyCoupon$1 INSTANCE = new ApplyCouponQuery$Data$Companion$invoke$1$applyCoupon$1();

    ApplyCouponQuery$Data$Companion$invoke$1$applyCoupon$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ApplyCouponQuery$ah$a invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ApplyCouponQuery$ah$a.toString.toString(removecancellable);
    }
}
