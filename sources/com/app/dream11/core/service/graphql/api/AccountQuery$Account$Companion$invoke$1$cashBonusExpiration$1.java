package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.AccountQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AccountQuery$Account$Companion$invoke$1$cashBonusExpiration$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, AccountQuery.CashBonusExpiration> {
    public static final AccountQuery$Account$Companion$invoke$1$cashBonusExpiration$1 INSTANCE = new AccountQuery$Account$Companion$invoke$1$cashBonusExpiration$1();

    AccountQuery$Account$Companion$invoke$1$cashBonusExpiration$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.AccountQuery$Account$Companion$invoke$1$cashBonusExpiration$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, AccountQuery.CashBonusExpiration> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final AccountQuery.CashBonusExpiration invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return AccountQuery.CashBonusExpiration.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final AccountQuery.CashBonusExpiration invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (AccountQuery.CashBonusExpiration) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
