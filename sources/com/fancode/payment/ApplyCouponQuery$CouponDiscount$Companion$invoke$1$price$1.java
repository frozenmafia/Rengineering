package com.fancode.payment;

import com.fancode.payment.ApplyCouponQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class ApplyCouponQuery$CouponDiscount$Companion$invoke$1$price$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ApplyCouponQuery.ak> {
    public static final ApplyCouponQuery$CouponDiscount$Companion$invoke$1$price$1 INSTANCE = new ApplyCouponQuery$CouponDiscount$Companion$invoke$1$price$1();

    ApplyCouponQuery$CouponDiscount$Companion$invoke$1$price$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ApplyCouponQuery.ak invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ApplyCouponQuery.ak.ag$a.valueOf(removecancellable);
    }
}
