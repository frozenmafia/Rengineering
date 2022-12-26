package com.fancode.payment;

import com.fancode.payment.GetPaymentPassesQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GetPaymentPassesQuery$PaymentPass$Companion$invoke$1$asOneTimePassDetails$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetPaymentPassesQuery.values> {
    public static final GetPaymentPassesQuery$PaymentPass$Companion$invoke$1$asOneTimePassDetails$1 INSTANCE = new GetPaymentPassesQuery$PaymentPass$Companion$invoke$1$asOneTimePassDetails$1();

    GetPaymentPassesQuery$PaymentPass$Companion$invoke$1$asOneTimePassDetails$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetPaymentPassesQuery.values invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetPaymentPassesQuery.values.toString.valueOf(removecancellable);
    }
}
