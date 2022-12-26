package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.fragment.CurrencyData;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes2.dex */
final class WithdrawalQuery$MaxWithdrawalAmount$Fragments$Companion$invoke$1$currencyData$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, CurrencyData> {
    public static final WithdrawalQuery$MaxWithdrawalAmount$Fragments$Companion$invoke$1$currencyData$1 INSTANCE = new WithdrawalQuery$MaxWithdrawalAmount$Fragments$Companion$invoke$1$currencyData$1();

    WithdrawalQuery$MaxWithdrawalAmount$Fragments$Companion$invoke$1$currencyData$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final CurrencyData invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return CurrencyData.Companion.invoke(removecancellable);
    }
}
