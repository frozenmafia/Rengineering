package com.dreampay.graphql.api;

import com.dreampay.graphql.api.FetchWalletListQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class FetchWalletListQuery$Health$Companion$invoke$1$icon$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchWalletListQuery.Icon> {
    public static final FetchWalletListQuery$Health$Companion$invoke$1$icon$1 INSTANCE = new FetchWalletListQuery$Health$Companion$invoke$1$icon$1();

    FetchWalletListQuery$Health$Companion$invoke$1$icon$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchWalletListQuery.Icon invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FetchWalletListQuery.Icon.Companion.invoke(removecancellable);
    }
}
