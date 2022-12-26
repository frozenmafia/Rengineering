package com.dreampay.webview;

import android.os.Bundle;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes6.dex */
final class WebViewActivity$webViewUrl$2 extends Lambda implements Styleable.ArcMotion<String> {
    final /* synthetic */ WebViewActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewActivity$webViewUrl$2(WebViewActivity webViewActivity) {
        super(0);
        this.this$0 = webViewActivity;
    }

    @Override // o.Styleable.ArcMotion
    public final String invoke() {
        String string;
        Bundle extras = this.this$0.getIntent().getExtras();
        return (extras == null || (string = extras.getString("url")) == null) ? "" : string;
    }
}
