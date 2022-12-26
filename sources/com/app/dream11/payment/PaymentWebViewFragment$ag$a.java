package com.app.dream11.payment;

import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
/* loaded from: classes3.dex */
class PaymentWebViewFragment$ag$a extends WebChromeClient {
    final /* synthetic */ PaymentWebViewFragment values;

    private PaymentWebViewFragment$ag$a(PaymentWebViewFragment paymentWebViewFragment) {
        this.values = paymentWebViewFragment;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        try {
            if (i < 100) {
                this.values.Pbar.setVisibility(0);
            } else {
                this.values.Pbar.setVisibility(8);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.onProgressChanged(webView, i);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return super.onJsAlert(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return super.onConsoleMessage(consoleMessage);
    }
}
