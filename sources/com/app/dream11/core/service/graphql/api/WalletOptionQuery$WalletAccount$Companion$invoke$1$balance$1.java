package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.WalletOptionQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class WalletOptionQuery$WalletAccount$Companion$invoke$1$balance$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, WalletOptionQuery.Balance> {
    public static final WalletOptionQuery$WalletAccount$Companion$invoke$1$balance$1 INSTANCE = new WalletOptionQuery$WalletAccount$Companion$invoke$1$balance$1();

    WalletOptionQuery$WalletAccount$Companion$invoke$1$balance$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final WalletOptionQuery.Balance invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return WalletOptionQuery.Balance.Companion.invoke(removecancellable);
    }
}
