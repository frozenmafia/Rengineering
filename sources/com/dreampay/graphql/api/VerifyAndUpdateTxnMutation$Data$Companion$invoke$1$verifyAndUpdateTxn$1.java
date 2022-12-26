package com.dreampay.graphql.api;

import com.dreampay.graphql.api.VerifyAndUpdateTxnMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class VerifyAndUpdateTxnMutation$Data$Companion$invoke$1$verifyAndUpdateTxn$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, VerifyAndUpdateTxnMutation.VerifyAndUpdateTxn> {
    public static final VerifyAndUpdateTxnMutation$Data$Companion$invoke$1$verifyAndUpdateTxn$1 INSTANCE = new VerifyAndUpdateTxnMutation$Data$Companion$invoke$1$verifyAndUpdateTxn$1();

    VerifyAndUpdateTxnMutation$Data$Companion$invoke$1$verifyAndUpdateTxn$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final VerifyAndUpdateTxnMutation.VerifyAndUpdateTxn invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return VerifyAndUpdateTxnMutation.VerifyAndUpdateTxn.Companion.invoke(removecancellable);
    }
}
