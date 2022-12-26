package com.dreampay.wallets;

import android.os.Bundle;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes4.dex */
final class WalletActivity$chargeUrl$2 extends Lambda implements Styleable.ArcMotion<String> {
    final /* synthetic */ WalletActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletActivity$chargeUrl$2(WalletActivity walletActivity) {
        super(0);
        this.this$0 = walletActivity;
    }

    @Override // o.Styleable.ArcMotion
    public final String invoke() {
        Bundle extras = this.this$0.getIntent().getExtras();
        if (extras == null) {
            return null;
        }
        return extras.getString("url");
    }
}
