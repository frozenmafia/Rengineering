package com.dreampay.graphql.api;

import com.dreampay.graphql.api.WalletSendOtpMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class WalletSendOtpMutation$Data$Companion$invoke$1$walletOtpSend$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, WalletSendOtpMutation.WalletOtpSend> {
    public static final WalletSendOtpMutation$Data$Companion$invoke$1$walletOtpSend$1 INSTANCE = new WalletSendOtpMutation$Data$Companion$invoke$1$walletOtpSend$1();

    WalletSendOtpMutation$Data$Companion$invoke$1$walletOtpSend$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final WalletSendOtpMutation.WalletOtpSend invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return WalletSendOtpMutation.WalletOtpSend.Companion.invoke(removecancellable);
    }
}
