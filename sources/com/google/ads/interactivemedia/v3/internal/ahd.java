package com.google.ads.interactivemedia.v3.internal;

import android.webkit.WebView;
/* loaded from: classes4.dex */
public final class ahd extends ahc {
    public ahd(WebView webView) {
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        i(webView);
    }
}
