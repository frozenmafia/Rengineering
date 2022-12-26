package com.fancode.payment;

import com.fancode.payment.ApplyCouponQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes6.dex */
final class ApplyCouponQuery$DiscountDetails$Companion$invoke$1$initialDiscount$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ApplyCouponQuery.getInitSettings> {
    public static final ApplyCouponQuery$DiscountDetails$Companion$invoke$1$initialDiscount$1 INSTANCE = new ApplyCouponQuery$DiscountDetails$Companion$invoke$1$initialDiscount$1();

    ApplyCouponQuery$DiscountDetails$Companion$invoke$1$initialDiscount$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ApplyCouponQuery.getInitSettings invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ApplyCouponQuery.getInitSettings.ah$a.ah$a(removecancellable);
    }
}
