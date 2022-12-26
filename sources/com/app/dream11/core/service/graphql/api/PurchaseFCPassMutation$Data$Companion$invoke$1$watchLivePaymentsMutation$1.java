package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.PurchaseFCPassMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class PurchaseFCPassMutation$Data$Companion$invoke$1$watchLivePaymentsMutation$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PurchaseFCPassMutation.WatchLivePaymentsMutation> {
    public static final PurchaseFCPassMutation$Data$Companion$invoke$1$watchLivePaymentsMutation$1 INSTANCE = new PurchaseFCPassMutation$Data$Companion$invoke$1$watchLivePaymentsMutation$1();

    PurchaseFCPassMutation$Data$Companion$invoke$1$watchLivePaymentsMutation$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final PurchaseFCPassMutation.WatchLivePaymentsMutation invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return PurchaseFCPassMutation.WatchLivePaymentsMutation.Companion.invoke(removecancellable);
    }
}
