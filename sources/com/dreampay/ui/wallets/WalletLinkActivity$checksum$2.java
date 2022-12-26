package com.dreampay.ui.wallets;

import android.os.Bundle;
import com.dreampay.commons.constants.Constants;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes4.dex */
final class WalletLinkActivity$checksum$2 extends Lambda implements Styleable.ArcMotion<String> {
    final /* synthetic */ WalletLinkActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletLinkActivity$checksum$2(WalletLinkActivity walletLinkActivity) {
        super(0);
        this.this$0 = walletLinkActivity;
    }

    @Override // o.Styleable.ArcMotion
    public final String invoke() {
        String string;
        Bundle extras = this.this$0.getIntent().getExtras();
        return (extras == null || (string = extras.getString(Constants.Navigation.CHECKSUM, null)) == null) ? "" : string;
    }
}
