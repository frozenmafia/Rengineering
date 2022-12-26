package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.WithdrawalQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class WithdrawalQuery$Detail$Companion$invoke$1$asUpiDetail$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, WithdrawalQuery.AsUpiDetail> {
    public static final WithdrawalQuery$Detail$Companion$invoke$1$asUpiDetail$1 INSTANCE = new WithdrawalQuery$Detail$Companion$invoke$1$asUpiDetail$1();

    WithdrawalQuery$Detail$Companion$invoke$1$asUpiDetail$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final WithdrawalQuery.AsUpiDetail invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return WithdrawalQuery.AsUpiDetail.Companion.invoke(removecancellable);
    }
}
