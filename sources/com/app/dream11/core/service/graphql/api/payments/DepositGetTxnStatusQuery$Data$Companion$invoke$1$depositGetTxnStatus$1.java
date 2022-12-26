package com.app.dream11.core.service.graphql.api.payments;

import com.app.dream11.core.service.graphql.api.payments.DepositGetTxnStatusQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class DepositGetTxnStatusQuery$Data$Companion$invoke$1$depositGetTxnStatus$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, DepositGetTxnStatusQuery.DepositGetTxnStatus> {
    public static final DepositGetTxnStatusQuery$Data$Companion$invoke$1$depositGetTxnStatus$1 INSTANCE = new DepositGetTxnStatusQuery$Data$Companion$invoke$1$depositGetTxnStatus$1();

    DepositGetTxnStatusQuery$Data$Companion$invoke$1$depositGetTxnStatus$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final DepositGetTxnStatusQuery.DepositGetTxnStatus invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return DepositGetTxnStatusQuery.DepositGetTxnStatus.Companion.invoke(removecancellable);
    }
}
