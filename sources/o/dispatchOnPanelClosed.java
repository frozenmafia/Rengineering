package o;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
/* loaded from: classes5.dex */
public interface dispatchOnPanelClosed {
    void ag$a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError);

    void ag$a(WebView webView, String str);

    void ah$a(WebView webView, String str);

    void valueOf(WebView webView, String str, Bitmap bitmap);

    boolean valueOf(WebView webView, Object obj);
}
