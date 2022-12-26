package com.dreampay.graphql.api;

import com.dreampay.graphql.api.UnlinkWalletMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class UnlinkWalletMutation$Data$Companion$invoke$1$unlinkWallet$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UnlinkWalletMutation.UnlinkWallet> {
    public static final UnlinkWalletMutation$Data$Companion$invoke$1$unlinkWallet$1 INSTANCE = new UnlinkWalletMutation$Data$Companion$invoke$1$unlinkWallet$1();

    UnlinkWalletMutation$Data$Companion$invoke$1$unlinkWallet$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final UnlinkWalletMutation.UnlinkWallet invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return UnlinkWalletMutation.UnlinkWallet.Companion.invoke(removecancellable);
    }
}
