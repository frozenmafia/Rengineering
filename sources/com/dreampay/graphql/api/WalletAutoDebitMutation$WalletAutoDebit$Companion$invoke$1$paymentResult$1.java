package com.dreampay.graphql.api;

import com.dreampay.graphql.api.WalletAutoDebitMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class WalletAutoDebitMutation$WalletAutoDebit$Companion$invoke$1$paymentResult$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, WalletAutoDebitMutation.PaymentResult> {
    public static final WalletAutoDebitMutation$WalletAutoDebit$Companion$invoke$1$paymentResult$1 INSTANCE = new WalletAutoDebitMutation$WalletAutoDebit$Companion$invoke$1$paymentResult$1();

    WalletAutoDebitMutation$WalletAutoDebit$Companion$invoke$1$paymentResult$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final WalletAutoDebitMutation.PaymentResult invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return WalletAutoDebitMutation.PaymentResult.Companion.invoke(removecancellable);
    }
}
