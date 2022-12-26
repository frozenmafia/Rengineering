package com.google.ads.interactivemedia.v3.internal;

import android.webkit.WebView;
/* loaded from: classes4.dex */
final class ahe implements Runnable {
    final /* synthetic */ ahf a;

    /* renamed from: b  reason: collision with root package name */
    private final WebView f556b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ahe(ahf ahfVar) {
        WebView webView;
        this.a = ahfVar;
        webView = ahfVar.a;
        this.f556b = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f556b.destroy();
    }
}
