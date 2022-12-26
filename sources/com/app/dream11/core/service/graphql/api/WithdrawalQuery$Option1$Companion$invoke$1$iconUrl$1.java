package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.WithdrawalQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class WithdrawalQuery$Option1$Companion$invoke$1$iconUrl$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, WithdrawalQuery.IconUrl> {
    public static final WithdrawalQuery$Option1$Companion$invoke$1$iconUrl$1 INSTANCE = new WithdrawalQuery$Option1$Companion$invoke$1$iconUrl$1();

    WithdrawalQuery$Option1$Companion$invoke$1$iconUrl$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.WithdrawalQuery$Option1$Companion$invoke$1$iconUrl$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, WithdrawalQuery.IconUrl> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final WithdrawalQuery.IconUrl invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return WithdrawalQuery.IconUrl.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final WithdrawalQuery.IconUrl invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (WithdrawalQuery.IconUrl) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
