package com.dreampay.graphql.api;

import com.dreampay.graphql.api.VerifyAndUpdateTxnMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class VerifyAndUpdateTxnMutation$VerifyAndUpdateTxn$Companion$invoke$1$paymentResult$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, VerifyAndUpdateTxnMutation.PaymentResult> {
    public static final VerifyAndUpdateTxnMutation$VerifyAndUpdateTxn$Companion$invoke$1$paymentResult$1 INSTANCE = new VerifyAndUpdateTxnMutation$VerifyAndUpdateTxn$Companion$invoke$1$paymentResult$1();

    VerifyAndUpdateTxnMutation$VerifyAndUpdateTxn$Companion$invoke$1$paymentResult$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final VerifyAndUpdateTxnMutation.PaymentResult invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return VerifyAndUpdateTxnMutation.PaymentResult.Companion.invoke(removecancellable);
    }
}
