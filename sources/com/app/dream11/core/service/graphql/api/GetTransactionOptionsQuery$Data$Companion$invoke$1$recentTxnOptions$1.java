package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetTransactionOptionsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetTransactionOptionsQuery$Data$Companion$invoke$1$recentTxnOptions$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GetTransactionOptionsQuery.RecentTxnOption> {
    public static final GetTransactionOptionsQuery$Data$Companion$invoke$1$recentTxnOptions$1 INSTANCE = new GetTransactionOptionsQuery$Data$Companion$invoke$1$recentTxnOptions$1();

    GetTransactionOptionsQuery$Data$Companion$invoke$1$recentTxnOptions$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.GetTransactionOptionsQuery$Data$Companion$invoke$1$recentTxnOptions$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetTransactionOptionsQuery.RecentTxnOption> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GetTransactionOptionsQuery.RecentTxnOption invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GetTransactionOptionsQuery.RecentTxnOption.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GetTransactionOptionsQuery.RecentTxnOption invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GetTransactionOptionsQuery.RecentTxnOption) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
