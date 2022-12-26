package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class aiy extends WebChromeClient {
    final /* synthetic */ Context a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ aln f582b;
    final /* synthetic */ List c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aiy(Context context, aln alnVar, List list) {
        this.a = context;
        this.f582b = alnVar;
        this.c = list;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView webView2 = new WebView(this.a);
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        webView2.setWebViewClient(new aix(this));
        message.sendToTarget();
        return true;
    }
}
