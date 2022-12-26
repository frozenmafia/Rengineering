package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.AccountQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AccountQuery$CashBonusExpiration$Companion$invoke$1$amount$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, AccountQuery.Amount> {
    public static final AccountQuery$CashBonusExpiration$Companion$invoke$1$amount$1 INSTANCE = new AccountQuery$CashBonusExpiration$Companion$invoke$1$amount$1();

    AccountQuery$CashBonusExpiration$Companion$invoke$1$amount$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final AccountQuery.Amount invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return AccountQuery.Amount.Companion.invoke(removecancellable);
    }
}
