package com.fancode.payment;

import com.fancode.payment.ApplyCouponQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class ApplyCouponQuery$Price$Companion$invoke$1$currency$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ApplyCouponQuery.invoke> {
    public static final ApplyCouponQuery$Price$Companion$invoke$1$currency$1 INSTANCE = new ApplyCouponQuery$Price$Companion$invoke$1$currency$1();

    ApplyCouponQuery$Price$Companion$invoke$1$currency$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ApplyCouponQuery.invoke invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ApplyCouponQuery.invoke.ag$a.valueOf(removecancellable);
    }
}
