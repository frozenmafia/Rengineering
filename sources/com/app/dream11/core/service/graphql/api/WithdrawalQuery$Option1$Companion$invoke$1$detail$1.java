package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.WithdrawalQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class WithdrawalQuery$Option1$Companion$invoke$1$detail$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, WithdrawalQuery.Detail> {
    public static final WithdrawalQuery$Option1$Companion$invoke$1$detail$1 INSTANCE = new WithdrawalQuery$Option1$Companion$invoke$1$detail$1();

    WithdrawalQuery$Option1$Companion$invoke$1$detail$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final WithdrawalQuery.Detail invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return WithdrawalQuery.Detail.Companion.invoke(removecancellable);
    }
}
