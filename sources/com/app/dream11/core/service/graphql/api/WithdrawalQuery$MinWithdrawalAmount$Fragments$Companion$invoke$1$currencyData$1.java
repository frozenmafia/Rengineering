package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.fragment.CurrencyData;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class WithdrawalQuery$MinWithdrawalAmount$Fragments$Companion$invoke$1$currencyData$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, CurrencyData> {
    public static final WithdrawalQuery$MinWithdrawalAmount$Fragments$Companion$invoke$1$currencyData$1 INSTANCE = new WithdrawalQuery$MinWithdrawalAmount$Fragments$Companion$invoke$1$currencyData$1();

    WithdrawalQuery$MinWithdrawalAmount$Fragments$Companion$invoke$1$currencyData$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final CurrencyData invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return CurrencyData.Companion.invoke(removecancellable);
    }
}
