package com.fancode.payment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes6.dex */
final class ApplyCouponQuery$DiscountDetails$Companion$invoke$1$totalAmount$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ApplyCouponQuery$aj$a> {
    public static final ApplyCouponQuery$DiscountDetails$Companion$invoke$1$totalAmount$1 INSTANCE = new ApplyCouponQuery$DiscountDetails$Companion$invoke$1$totalAmount$1();

    ApplyCouponQuery$DiscountDetails$Companion$invoke$1$totalAmount$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ApplyCouponQuery$aj$a invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ApplyCouponQuery$aj$a.values.ag$a(removecancellable);
    }
}
