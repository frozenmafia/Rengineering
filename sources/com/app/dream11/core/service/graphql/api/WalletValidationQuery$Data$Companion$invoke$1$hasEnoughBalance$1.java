package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.WalletValidationQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class WalletValidationQuery$Data$Companion$invoke$1$hasEnoughBalance$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, WalletValidationQuery.HasEnoughBalance> {
    public static final WalletValidationQuery$Data$Companion$invoke$1$hasEnoughBalance$1 INSTANCE = new WalletValidationQuery$Data$Companion$invoke$1$hasEnoughBalance$1();

    WalletValidationQuery$Data$Companion$invoke$1$hasEnoughBalance$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final WalletValidationQuery.HasEnoughBalance invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return WalletValidationQuery.HasEnoughBalance.Companion.invoke(removecancellable);
    }
}
