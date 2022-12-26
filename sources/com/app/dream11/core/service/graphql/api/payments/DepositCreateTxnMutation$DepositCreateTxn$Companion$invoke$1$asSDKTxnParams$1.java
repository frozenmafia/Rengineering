package com.app.dream11.core.service.graphql.api.payments;

import com.app.dream11.core.service.graphql.api.payments.DepositCreateTxnMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class DepositCreateTxnMutation$DepositCreateTxn$Companion$invoke$1$asSDKTxnParams$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, DepositCreateTxnMutation.AsSDKTxnParams> {
    public static final DepositCreateTxnMutation$DepositCreateTxn$Companion$invoke$1$asSDKTxnParams$1 INSTANCE = new DepositCreateTxnMutation$DepositCreateTxn$Companion$invoke$1$asSDKTxnParams$1();

    DepositCreateTxnMutation$DepositCreateTxn$Companion$invoke$1$asSDKTxnParams$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final DepositCreateTxnMutation.AsSDKTxnParams invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return DepositCreateTxnMutation.AsSDKTxnParams.Companion.invoke(removecancellable);
    }
}
