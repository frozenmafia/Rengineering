package com.app.dream11.core.service.graphql.api.payments;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes2.dex */
final class DepositAddCashPageQuery$AddCashPage$Companion$invoke$1$suggestedAmounts$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, Integer> {
    public static final DepositAddCashPageQuery$AddCashPage$Companion$invoke$1$suggestedAmounts$1 INSTANCE = new DepositAddCashPageQuery$AddCashPage$Companion$invoke$1$suggestedAmounts$1();

    DepositAddCashPageQuery$AddCashPage$Companion$invoke$1$suggestedAmounts$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final Integer invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return Integer.valueOf(valuesVar.values());
    }
}
