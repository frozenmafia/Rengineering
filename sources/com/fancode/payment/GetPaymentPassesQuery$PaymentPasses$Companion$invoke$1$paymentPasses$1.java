package com.fancode.payment;

import com.fancode.payment.GetPaymentPassesQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GetPaymentPassesQuery$PaymentPasses$Companion$invoke$1$paymentPasses$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GetPaymentPassesQuery.invoke> {
    public static final GetPaymentPassesQuery$PaymentPasses$Companion$invoke$1$paymentPasses$1 INSTANCE = new GetPaymentPassesQuery$PaymentPasses$Companion$invoke$1$paymentPasses$1();

    GetPaymentPassesQuery$PaymentPasses$Companion$invoke$1$paymentPasses$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fancode.payment.GetPaymentPassesQuery$PaymentPasses$Companion$invoke$1$paymentPasses$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetPaymentPassesQuery.invoke> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GetPaymentPassesQuery.invoke invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GetPaymentPassesQuery.invoke.ag$a.values(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GetPaymentPassesQuery.invoke invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GetPaymentPassesQuery.invoke) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
