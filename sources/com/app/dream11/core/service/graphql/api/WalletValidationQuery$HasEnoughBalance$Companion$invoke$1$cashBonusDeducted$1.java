package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.WalletValidationQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class WalletValidationQuery$HasEnoughBalance$Companion$invoke$1$cashBonusDeducted$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, WalletValidationQuery.CashBonusDeducted> {
    public static final WalletValidationQuery$HasEnoughBalance$Companion$invoke$1$cashBonusDeducted$1 INSTANCE = new WalletValidationQuery$HasEnoughBalance$Companion$invoke$1$cashBonusDeducted$1();

    WalletValidationQuery$HasEnoughBalance$Companion$invoke$1$cashBonusDeducted$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final WalletValidationQuery.CashBonusDeducted invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return WalletValidationQuery.CashBonusDeducted.Companion.invoke(removecancellable);
    }
}
