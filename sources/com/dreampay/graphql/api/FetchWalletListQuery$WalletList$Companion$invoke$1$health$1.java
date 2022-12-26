package com.dreampay.graphql.api;

import com.dreampay.graphql.api.FetchWalletListQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class FetchWalletListQuery$WalletList$Companion$invoke$1$health$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchWalletListQuery.Health> {
    public static final FetchWalletListQuery$WalletList$Companion$invoke$1$health$1 INSTANCE = new FetchWalletListQuery$WalletList$Companion$invoke$1$health$1();

    FetchWalletListQuery$WalletList$Companion$invoke$1$health$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchWalletListQuery.Health invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FetchWalletListQuery.Health.Companion.invoke(removecancellable);
    }
}
