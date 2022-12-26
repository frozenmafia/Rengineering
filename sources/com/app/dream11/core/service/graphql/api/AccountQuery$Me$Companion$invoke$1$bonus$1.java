package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.AccountQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AccountQuery$Me$Companion$invoke$1$bonus$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, AccountQuery.Bonus> {
    public static final AccountQuery$Me$Companion$invoke$1$bonus$1 INSTANCE = new AccountQuery$Me$Companion$invoke$1$bonus$1();

    AccountQuery$Me$Companion$invoke$1$bonus$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final AccountQuery.Bonus invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return AccountQuery.Bonus.Companion.invoke(removecancellable);
    }
}
