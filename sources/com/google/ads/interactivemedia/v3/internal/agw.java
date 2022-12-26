package com.google.ads.interactivemedia.v3.internal;

import android.webkit.WebView;
/* loaded from: classes4.dex */
final class agw implements Runnable {
    final /* synthetic */ WebView a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f552b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public agw(WebView webView, String str) {
        this.a = webView;
        this.f552b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.loadUrl(this.f552b);
    }
}
