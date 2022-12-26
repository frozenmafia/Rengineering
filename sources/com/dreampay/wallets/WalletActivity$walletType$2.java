package com.dreampay.wallets;

import com.dreampay.commons.constants.Constants;
import com.dreampay.commons.wallets.Wallet;
import java.io.Serializable;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes4.dex */
final class WalletActivity$walletType$2 extends Lambda implements Styleable.ArcMotion<Wallet> {
    final /* synthetic */ WalletActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletActivity$walletType$2(WalletActivity walletActivity) {
        super(0);
        this.this$0 = walletActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final Wallet invoke() {
        Serializable serializableExtra = this.this$0.getIntent().getSerializableExtra(Constants.Navigation.WALLET_TYPE);
        Objects.requireNonNull(serializableExtra, "null cannot be cast to non-null type com.dreampay.commons.wallets.Wallet");
        return (Wallet) serializableExtra;
    }
}
