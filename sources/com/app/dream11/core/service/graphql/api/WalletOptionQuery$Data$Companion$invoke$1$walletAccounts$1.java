package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.WalletOptionQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class WalletOptionQuery$Data$Companion$invoke$1$walletAccounts$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, WalletOptionQuery.WalletAccount> {
    public static final WalletOptionQuery$Data$Companion$invoke$1$walletAccounts$1 INSTANCE = new WalletOptionQuery$Data$Companion$invoke$1$walletAccounts$1();

    WalletOptionQuery$Data$Companion$invoke$1$walletAccounts$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.WalletOptionQuery$Data$Companion$invoke$1$walletAccounts$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, WalletOptionQuery.WalletAccount> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final WalletOptionQuery.WalletAccount invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return WalletOptionQuery.WalletAccount.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final WalletOptionQuery.WalletAccount invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (WalletOptionQuery.WalletAccount) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
