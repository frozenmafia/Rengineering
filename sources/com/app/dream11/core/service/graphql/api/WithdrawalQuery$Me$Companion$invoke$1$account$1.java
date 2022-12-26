package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.WithdrawalQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class WithdrawalQuery$Me$Companion$invoke$1$account$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, WithdrawalQuery.Account> {
    public static final WithdrawalQuery$Me$Companion$invoke$1$account$1 INSTANCE = new WithdrawalQuery$Me$Companion$invoke$1$account$1();

    WithdrawalQuery$Me$Companion$invoke$1$account$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final WithdrawalQuery.Account invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return WithdrawalQuery.Account.Companion.invoke(removecancellable);
    }
}
