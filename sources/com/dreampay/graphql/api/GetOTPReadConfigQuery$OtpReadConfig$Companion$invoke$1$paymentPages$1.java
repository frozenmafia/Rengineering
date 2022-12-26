package com.dreampay.graphql.api;

import com.dreampay.graphql.api.GetOTPReadConfigQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class GetOTPReadConfigQuery$OtpReadConfig$Companion$invoke$1$paymentPages$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GetOTPReadConfigQuery.PaymentPage> {
    public static final GetOTPReadConfigQuery$OtpReadConfig$Companion$invoke$1$paymentPages$1 INSTANCE = new GetOTPReadConfigQuery$OtpReadConfig$Companion$invoke$1$paymentPages$1();

    GetOTPReadConfigQuery$OtpReadConfig$Companion$invoke$1$paymentPages$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.dreampay.graphql.api.GetOTPReadConfigQuery$OtpReadConfig$Companion$invoke$1$paymentPages$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetOTPReadConfigQuery.PaymentPage> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GetOTPReadConfigQuery.PaymentPage invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GetOTPReadConfigQuery.PaymentPage.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GetOTPReadConfigQuery.PaymentPage invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GetOTPReadConfigQuery.PaymentPage) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
