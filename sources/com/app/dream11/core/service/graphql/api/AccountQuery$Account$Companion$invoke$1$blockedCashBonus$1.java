package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.AccountQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AccountQuery$Account$Companion$invoke$1$blockedCashBonus$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, AccountQuery.BlockedCashBonus> {
    public static final AccountQuery$Account$Companion$invoke$1$blockedCashBonus$1 INSTANCE = new AccountQuery$Account$Companion$invoke$1$blockedCashBonus$1();

    AccountQuery$Account$Companion$invoke$1$blockedCashBonus$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final AccountQuery.BlockedCashBonus invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return AccountQuery.BlockedCashBonus.Companion.invoke(removecancellable);
    }
}
