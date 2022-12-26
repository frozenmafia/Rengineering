package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.WithdrawalQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class WithdrawalQuery$Withdrawal$Companion$invoke$1$withdrawalConfig$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, WithdrawalQuery.WithdrawalConfig> {
    public static final WithdrawalQuery$Withdrawal$Companion$invoke$1$withdrawalConfig$1 INSTANCE = new WithdrawalQuery$Withdrawal$Companion$invoke$1$withdrawalConfig$1();

    WithdrawalQuery$Withdrawal$Companion$invoke$1$withdrawalConfig$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final WithdrawalQuery.WithdrawalConfig invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return WithdrawalQuery.WithdrawalConfig.Companion.invoke(removecancellable);
    }
}
