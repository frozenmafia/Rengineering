package com.dreampay.ui.wallets;

import com.dreampay.commons.wallets.Wallet;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class WalletVerifyInputFragment$otpLength$2 extends Lambda implements Styleable.ArcMotion<Integer> {
    final /* synthetic */ WalletVerifyInputFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletVerifyInputFragment$otpLength$2(WalletVerifyInputFragment walletVerifyInputFragment) {
        super(0);
        this.this$0 = walletVerifyInputFragment;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public /* synthetic */ Integer invoke2() {
        return Integer.valueOf(invoke());
    }

    @Override // o.Styleable.ArcMotion
    public final Integer invoke() {
        return (WalletVerifyInputFragment.values(this.this$0) == Wallet.PAYTM || WalletVerifyInputFragment.values(this.this$0) == Wallet.MOBIKWIK) ? 6 : 5;
    }
}
