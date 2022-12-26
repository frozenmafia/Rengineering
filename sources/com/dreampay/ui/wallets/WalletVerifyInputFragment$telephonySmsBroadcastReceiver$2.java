package com.dreampay.ui.wallets;

import com.dreampay.sms.TelephonySmsBroadcastReceiver;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class WalletVerifyInputFragment$telephonySmsBroadcastReceiver$2 extends Lambda implements Styleable.ArcMotion<TelephonySmsBroadcastReceiver> {
    final /* synthetic */ WalletVerifyInputFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletVerifyInputFragment$telephonySmsBroadcastReceiver$2(WalletVerifyInputFragment walletVerifyInputFragment) {
        super(0);
        this.this$0 = walletVerifyInputFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final TelephonySmsBroadcastReceiver invoke() {
        return new TelephonySmsBroadcastReceiver(this.this$0);
    }
}
