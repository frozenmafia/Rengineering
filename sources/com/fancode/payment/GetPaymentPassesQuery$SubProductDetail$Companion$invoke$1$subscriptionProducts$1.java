package com.fancode.payment;

import com.fancode.payment.GetPaymentPassesQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GetPaymentPassesQuery$SubProductDetail$Companion$invoke$1$subscriptionProducts$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GetPaymentPassesQuery.getInitSettings> {
    public static final GetPaymentPassesQuery$SubProductDetail$Companion$invoke$1$subscriptionProducts$1 INSTANCE = new GetPaymentPassesQuery$SubProductDetail$Companion$invoke$1$subscriptionProducts$1();

    GetPaymentPassesQuery$SubProductDetail$Companion$invoke$1$subscriptionProducts$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fancode.payment.GetPaymentPassesQuery$SubProductDetail$Companion$invoke$1$subscriptionProducts$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetPaymentPassesQuery.getInitSettings> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GetPaymentPassesQuery.getInitSettings invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GetPaymentPassesQuery.getInitSettings.values.ag$a(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GetPaymentPassesQuery.getInitSettings invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GetPaymentPassesQuery.getInitSettings) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
