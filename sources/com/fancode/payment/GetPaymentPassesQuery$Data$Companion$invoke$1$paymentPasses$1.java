package com.fancode.payment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes6.dex */
final class GetPaymentPassesQuery$Data$Companion$invoke$1$paymentPasses$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetPaymentPassesQuery$ah$b> {
    public static final GetPaymentPassesQuery$Data$Companion$invoke$1$paymentPasses$1 INSTANCE = new GetPaymentPassesQuery$Data$Companion$invoke$1$paymentPasses$1();

    GetPaymentPassesQuery$Data$Companion$invoke$1$paymentPasses$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetPaymentPassesQuery$ah$b invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetPaymentPassesQuery$ah$b.toString.valueOf(removecancellable);
    }
}
