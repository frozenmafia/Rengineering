package com.google.ads.interactivemedia.v3.internal;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.dreampay.commons.constants.Constants;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ajt extends WebViewClient {
    final /* synthetic */ ajw a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ajt(ajw ajwVar) {
        this.a = ajwVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        com.google.ads.interactivemedia.v3.impl.data.m.c("Finished loading WebView".concat(String.valueOf(str)));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        com.google.ads.interactivemedia.v3.impl.data.m.c("Started loading WebView".concat(String.valueOf(str)));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        com.google.ads.interactivemedia.v3.impl.data.m.c("Error: " + i + Constants.WHITE_SPACE + str + Constants.WHITE_SPACE + str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith("gmsg://")) {
            this.a.f(str);
            return true;
        }
        return false;
    }
}
