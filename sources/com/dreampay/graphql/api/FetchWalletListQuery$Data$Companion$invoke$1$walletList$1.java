package com.dreampay.graphql.api;

import com.dreampay.graphql.api.FetchWalletListQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class FetchWalletListQuery$Data$Companion$invoke$1$walletList$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, FetchWalletListQuery.WalletList> {
    public static final FetchWalletListQuery$Data$Companion$invoke$1$walletList$1 INSTANCE = new FetchWalletListQuery$Data$Companion$invoke$1$walletList$1();

    FetchWalletListQuery$Data$Companion$invoke$1$walletList$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.dreampay.graphql.api.FetchWalletListQuery$Data$Companion$invoke$1$walletList$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchWalletListQuery.WalletList> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final FetchWalletListQuery.WalletList invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return FetchWalletListQuery.WalletList.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchWalletListQuery.WalletList invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (FetchWalletListQuery.WalletList) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
