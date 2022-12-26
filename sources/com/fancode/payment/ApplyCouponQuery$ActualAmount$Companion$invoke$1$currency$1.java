package com.fancode.payment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes6.dex */
final class ApplyCouponQuery$ActualAmount$Companion$invoke$1$currency$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ApplyCouponQuery$HaptikSDK$a> {
    public static final ApplyCouponQuery$ActualAmount$Companion$invoke$1$currency$1 INSTANCE = new ApplyCouponQuery$ActualAmount$Companion$invoke$1$currency$1();

    ApplyCouponQuery$ActualAmount$Companion$invoke$1$currency$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ApplyCouponQuery$HaptikSDK$a invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ApplyCouponQuery$HaptikSDK$a.valueOf.values(removecancellable);
    }
}
