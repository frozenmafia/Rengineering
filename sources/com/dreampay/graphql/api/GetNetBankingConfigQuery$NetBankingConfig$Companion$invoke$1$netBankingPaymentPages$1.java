package com.dreampay.graphql.api;

import com.dreampay.graphql.api.GetNetBankingConfigQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class GetNetBankingConfigQuery$NetBankingConfig$Companion$invoke$1$netBankingPaymentPages$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GetNetBankingConfigQuery.NetBankingPaymentPage> {
    public static final GetNetBankingConfigQuery$NetBankingConfig$Companion$invoke$1$netBankingPaymentPages$1 INSTANCE = new GetNetBankingConfigQuery$NetBankingConfig$Companion$invoke$1$netBankingPaymentPages$1();

    GetNetBankingConfigQuery$NetBankingConfig$Companion$invoke$1$netBankingPaymentPages$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.dreampay.graphql.api.GetNetBankingConfigQuery$NetBankingConfig$Companion$invoke$1$netBankingPaymentPages$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetNetBankingConfigQuery.NetBankingPaymentPage> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GetNetBankingConfigQuery.NetBankingPaymentPage invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GetNetBankingConfigQuery.NetBankingPaymentPage.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GetNetBankingConfigQuery.NetBankingPaymentPage invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GetNetBankingConfigQuery.NetBankingPaymentPage) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
