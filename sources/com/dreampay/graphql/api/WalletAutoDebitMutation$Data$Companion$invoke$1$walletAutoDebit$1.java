package com.dreampay.graphql.api;

import com.dreampay.graphql.api.WalletAutoDebitMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class WalletAutoDebitMutation$Data$Companion$invoke$1$walletAutoDebit$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, WalletAutoDebitMutation.WalletAutoDebit> {
    public static final WalletAutoDebitMutation$Data$Companion$invoke$1$walletAutoDebit$1 INSTANCE = new WalletAutoDebitMutation$Data$Companion$invoke$1$walletAutoDebit$1();

    WalletAutoDebitMutation$Data$Companion$invoke$1$walletAutoDebit$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final WalletAutoDebitMutation.WalletAutoDebit invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return WalletAutoDebitMutation.WalletAutoDebit.Companion.invoke(removecancellable);
    }
}
