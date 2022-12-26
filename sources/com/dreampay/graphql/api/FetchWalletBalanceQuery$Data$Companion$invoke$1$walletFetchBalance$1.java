package com.dreampay.graphql.api;

import com.dreampay.graphql.api.FetchWalletBalanceQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class FetchWalletBalanceQuery$Data$Companion$invoke$1$walletFetchBalance$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchWalletBalanceQuery.WalletFetchBalance> {
    public static final FetchWalletBalanceQuery$Data$Companion$invoke$1$walletFetchBalance$1 INSTANCE = new FetchWalletBalanceQuery$Data$Companion$invoke$1$walletFetchBalance$1();

    FetchWalletBalanceQuery$Data$Companion$invoke$1$walletFetchBalance$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchWalletBalanceQuery.WalletFetchBalance invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FetchWalletBalanceQuery.WalletFetchBalance.Companion.invoke(removecancellable);
    }
}
