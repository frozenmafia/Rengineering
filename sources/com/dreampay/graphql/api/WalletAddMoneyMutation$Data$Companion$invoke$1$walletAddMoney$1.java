package com.dreampay.graphql.api;

import com.dreampay.graphql.api.WalletAddMoneyMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class WalletAddMoneyMutation$Data$Companion$invoke$1$walletAddMoney$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, WalletAddMoneyMutation.WalletAddMoney> {
    public static final WalletAddMoneyMutation$Data$Companion$invoke$1$walletAddMoney$1 INSTANCE = new WalletAddMoneyMutation$Data$Companion$invoke$1$walletAddMoney$1();

    WalletAddMoneyMutation$Data$Companion$invoke$1$walletAddMoney$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final WalletAddMoneyMutation.WalletAddMoney invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return WalletAddMoneyMutation.WalletAddMoney.Companion.invoke(removecancellable);
    }
}
