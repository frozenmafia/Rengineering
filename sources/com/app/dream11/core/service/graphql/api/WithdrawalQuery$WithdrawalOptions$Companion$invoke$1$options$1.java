package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.WithdrawalQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class WithdrawalQuery$WithdrawalOptions$Companion$invoke$1$options$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, WithdrawalQuery.Option1> {
    public static final WithdrawalQuery$WithdrawalOptions$Companion$invoke$1$options$1 INSTANCE = new WithdrawalQuery$WithdrawalOptions$Companion$invoke$1$options$1();

    WithdrawalQuery$WithdrawalOptions$Companion$invoke$1$options$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.WithdrawalQuery$WithdrawalOptions$Companion$invoke$1$options$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, WithdrawalQuery.Option1> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final WithdrawalQuery.Option1 invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return WithdrawalQuery.Option1.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final WithdrawalQuery.Option1 invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (WithdrawalQuery.Option1) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
