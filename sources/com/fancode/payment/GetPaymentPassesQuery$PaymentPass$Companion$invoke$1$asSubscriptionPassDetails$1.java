package com.fancode.payment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes6.dex */
final class GetPaymentPassesQuery$PaymentPass$Companion$invoke$1$asSubscriptionPassDetails$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetPaymentPassesQuery$ag$a> {
    public static final GetPaymentPassesQuery$PaymentPass$Companion$invoke$1$asSubscriptionPassDetails$1 INSTANCE = new GetPaymentPassesQuery$PaymentPass$Companion$invoke$1$asSubscriptionPassDetails$1();

    GetPaymentPassesQuery$PaymentPass$Companion$invoke$1$asSubscriptionPassDetails$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetPaymentPassesQuery$ag$a invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetPaymentPassesQuery$ag$a.toString.ah$a(removecancellable);
    }
}
