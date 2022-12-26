package com.fancode.payment;

import com.fancode.payment.ApplyCouponQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class ApplyCouponQuery$ApplyCoupon$Companion$invoke$1$discountDetails$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, ApplyCouponQuery.HaptikWebView> {
    public static final ApplyCouponQuery$ApplyCoupon$Companion$invoke$1$discountDetails$1 INSTANCE = new ApplyCouponQuery$ApplyCoupon$Companion$invoke$1$discountDetails$1();

    ApplyCouponQuery$ApplyCoupon$Companion$invoke$1$discountDetails$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fancode.payment.ApplyCouponQuery$ApplyCoupon$Companion$invoke$1$discountDetails$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ApplyCouponQuery.HaptikWebView> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final ApplyCouponQuery.HaptikWebView invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return ApplyCouponQuery.HaptikWebView.ag$a.valueOf(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final ApplyCouponQuery.HaptikWebView invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (ApplyCouponQuery.HaptikWebView) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
