package com.google.ads.interactivemedia.v3.internal;

import android.os.Build;
import android.os.Handler;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
/* loaded from: classes4.dex */
public final class ajw {
    private final WebView a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f594b;
    private aju c;
    private boolean d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ajw(Handler handler, WebView webView) {
        this.f594b = handler;
        this.a = webView;
        webView.setBackgroundColor(0);
        if (Build.VERSION.SDK_INT > 19) {
            webView.getSettings().setMixedContentMode(0);
        }
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new ajt(this));
        webView.setWebChromeClient(new WebChromeClient());
        WebSettings settings = webView.getSettings();
        if (Build.VERSION.SDK_INT >= 17) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        if (Build.VERSION.SDK_INT >= 21) {
            cookieManager.setAcceptThirdPartyCookies(webView, true);
        }
    }

    public final WebView a() {
        return this.a;
    }

    public final void b() {
        this.f594b.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.ajr
            @Override // java.lang.Runnable
            public final void run() {
                ajw.this.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        this.d = true;
        this.a.destroy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void d(ajk ajkVar) {
        String f = ajkVar.f();
        if (this.d) {
            String valueOf = String.valueOf(ajkVar);
            com.google.ads.interactivemedia.v3.impl.data.m.d("Attempted to send bridge message after cleanup: " + valueOf + "; " + f);
            return;
        }
        String valueOf2 = String.valueOf(ajkVar);
        com.google.ads.interactivemedia.v3.impl.data.m.c("Sending Javascript msg: " + valueOf2 + "; URL: " + f);
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                this.a.evaluateJavascript(f, null);
                return;
            } catch (IllegalStateException unused) {
                this.a.loadUrl(f);
                return;
            }
        }
        this.a.loadUrl(f);
    }

    public final void e(String str) {
        this.a.loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f(String str) {
        try {
            ajk c = ajk.c(str);
            String obj = c.toString();
            com.google.ads.interactivemedia.v3.impl.data.m.c("Received Javascript msg: " + obj + "; URL: " + str);
            this.c.k(c);
        } catch (IllegalArgumentException unused) {
            com.google.ads.interactivemedia.v3.impl.data.m.d("Invalid internal message. Make sure the Google IMA SDK library is up to date. Message: ".concat(String.valueOf(str)));
        } catch (Exception e) {
            com.google.ads.interactivemedia.v3.impl.data.m.b("Invalid internal message. Message could not be be parsed: ".concat(String.valueOf(str)), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g(aju ajuVar) {
        this.c = ajuVar;
    }

    public final void h(final ajk ajkVar) {
        this.f594b.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.ajs
            @Override // java.lang.Runnable
            public final void run() {
                ajw.this.d(ajkVar);
            }
        });
    }
}
