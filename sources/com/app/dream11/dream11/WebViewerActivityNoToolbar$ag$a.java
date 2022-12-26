package com.app.dream11.dream11;

import android.webkit.WebView;
import android.webkit.WebViewClient;
/* loaded from: classes6.dex */
class WebViewerActivityNoToolbar$ag$a extends WebViewClient {
    final /* synthetic */ WebViewerActivityNoToolbar ag$a;

    private WebViewerActivityNoToolbar$ag$a(WebViewerActivityNoToolbar webViewerActivityNoToolbar) {
        this.ag$a = webViewerActivityNoToolbar;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.loadUrl(str);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.ag$a.toString.setVisibility(8);
    }
}
