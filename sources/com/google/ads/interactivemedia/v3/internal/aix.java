package com.google.ads.interactivemedia.v3.internal;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
/* loaded from: classes4.dex */
final class aix extends WebViewClient {
    final /* synthetic */ aiy a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aix(aiy aiyVar) {
        this.a = aiyVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.a.f582b.a(str);
        for (CompanionAdSlot.ClickListener clickListener : this.a.c) {
            clickListener.onCompanionAdClick();
        }
        return true;
    }
}
