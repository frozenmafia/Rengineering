package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.WithdrawalQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class WithdrawalQuery$Option$Companion$invoke$1$minAmount$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, WithdrawalQuery.MinAmount> {
    public static final WithdrawalQuery$Option$Companion$invoke$1$minAmount$1 INSTANCE = new WithdrawalQuery$Option$Companion$invoke$1$minAmount$1();

    WithdrawalQuery$Option$Companion$invoke$1$minAmount$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final WithdrawalQuery.MinAmount invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return WithdrawalQuery.MinAmount.Companion.invoke(removecancellable);
    }
}
