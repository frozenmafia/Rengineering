package com.fancode.payment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes6.dex */
final class GetPaymentPassesQuery$AsSubscriptionPassDetails$Companion$invoke$1$subProductDetails$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GetPaymentPassesQuery$HaptikSDK$d> {
    public static final GetPaymentPassesQuery$AsSubscriptionPassDetails$Companion$invoke$1$subProductDetails$1 INSTANCE = new GetPaymentPassesQuery$AsSubscriptionPassDetails$Companion$invoke$1$subProductDetails$1();

    GetPaymentPassesQuery$AsSubscriptionPassDetails$Companion$invoke$1$subProductDetails$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fancode.payment.GetPaymentPassesQuery$AsSubscriptionPassDetails$Companion$invoke$1$subProductDetails$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetPaymentPassesQuery$HaptikSDK$d> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GetPaymentPassesQuery$HaptikSDK$d invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GetPaymentPassesQuery$HaptikSDK$d.toString.valueOf(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GetPaymentPassesQuery$HaptikSDK$d invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GetPaymentPassesQuery$HaptikSDK$d) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
