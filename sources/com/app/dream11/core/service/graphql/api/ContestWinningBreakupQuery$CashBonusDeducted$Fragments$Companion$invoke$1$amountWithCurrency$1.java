package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.fragment.AmountWithCurrency;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestWinningBreakupQuery$CashBonusDeducted$Fragments$Companion$invoke$1$amountWithCurrency$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, AmountWithCurrency> {
    public static final ContestWinningBreakupQuery$CashBonusDeducted$Fragments$Companion$invoke$1$amountWithCurrency$1 INSTANCE = new ContestWinningBreakupQuery$CashBonusDeducted$Fragments$Companion$invoke$1$amountWithCurrency$1();

    ContestWinningBreakupQuery$CashBonusDeducted$Fragments$Companion$invoke$1$amountWithCurrency$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final AmountWithCurrency invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return AmountWithCurrency.Companion.invoke(removecancellable);
    }
}
