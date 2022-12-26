package com.dreampay.wallets.mobikwik;

import android.os.Bundle;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes4.dex */
final class MobikwikWebViewActivity$chargeUrl$2 extends Lambda implements Styleable.ArcMotion<String> {
    final /* synthetic */ MobikwikWebViewActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobikwikWebViewActivity$chargeUrl$2(MobikwikWebViewActivity mobikwikWebViewActivity) {
        super(0);
        this.this$0 = mobikwikWebViewActivity;
    }

    @Override // o.Styleable.ArcMotion
    public final String invoke() {
        String string;
        Bundle extras = this.this$0.getIntent().getExtras();
        return (extras == null || (string = extras.getString("url")) == null) ? "" : string;
    }
}
