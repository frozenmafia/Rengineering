package com.apxor.androidsdk.plugins.realtimeui.g.c;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Map;
/* loaded from: classes3.dex */
public class a extends WebView {
    private WebViewClient a;

    public a(Context context) {
        this(context, null);
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAppCacheEnabled(false);
        settings.setAllowFileAccess(true);
        settings.setDomStorageEnabled(true);
        settings.setCacheMode(2);
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setHorizontalFadingEdgeEnabled(false);
        setVerticalFadingEdgeEnabled(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setBackgroundColor(0);
        if (i >= 21) {
            settings.setMixedContentMode(2);
        }
    }

    @Override // android.webkit.WebView
    public WebViewClient getWebViewClient() {
        return this.a;
    }

    @Override // android.webkit.WebView
    public void loadData(String str, String str2, String str3) {
        super.loadData(str, str2, str3);
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        super.loadUrl(str);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        super.loadUrl(str, map);
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        this.a = webViewClient;
        super.setWebViewClient(webViewClient);
    }
}
