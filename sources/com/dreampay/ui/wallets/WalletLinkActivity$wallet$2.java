package com.dreampay.ui.wallets;

import android.os.Bundle;
import com.dreampay.commons.constants.Constants;
import com.dreampay.commons.wallets.Wallet;
import java.io.Serializable;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes4.dex */
final class WalletLinkActivity$wallet$2 extends Lambda implements Styleable.ArcMotion<Wallet> {
    final /* synthetic */ WalletLinkActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletLinkActivity$wallet$2(WalletLinkActivity walletLinkActivity) {
        super(0);
        this.this$0 = walletLinkActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final Wallet invoke() {
        Bundle extras = this.this$0.getIntent().getExtras();
        Serializable serializable = extras == null ? null : extras.getSerializable(Constants.Navigation.WALLET_TYPE);
        Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.dreampay.commons.wallets.Wallet");
        return (Wallet) serializable;
    }
}
