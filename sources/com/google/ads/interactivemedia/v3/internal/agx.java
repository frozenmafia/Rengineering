package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public final class agx {
    private static final agx a = new agx();

    private agx() {
    }

    public static agx a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            if (objArr.length > 0) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        sb.append("\"\"");
                    } else if (obj instanceof String) {
                        String obj2 = obj.toString();
                        if (obj2.startsWith("{")) {
                            sb.append(obj2);
                        } else {
                            sb.append('\"');
                            sb.append(obj2);
                            sb.append('\"');
                        }
                    } else {
                        sb.append(obj);
                    }
                    sb.append(",");
                }
                sb.setLength(sb.length() - 1);
            }
            sb.append(")}");
            String sb2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler == null || Looper.myLooper() == handler.getLooper()) {
                webView.loadUrl(sb2);
                return;
            } else {
                handler.post(new agw(webView, sb2));
                return;
            }
        }
        String concat = "The WebView is null for ".concat(str);
        if (!agg.a.booleanValue() || TextUtils.isEmpty(concat)) {
            return;
        }
        Log.i("OMIDLIB", concat);
    }

    public final void c(WebView webView) {
        b(webView, "finishSession", new Object[0]);
    }

    public final void d(WebView webView, JSONObject jSONObject) {
        b(webView, "init", jSONObject);
    }

    public final void e(WebView webView, float f) {
        b(webView, "setDeviceVolume", Float.valueOf(f));
    }

    public final void f(WebView webView, String str) {
        b(webView, "setNativeViewHierarchy", str);
    }

    public final void g(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        b(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    public final void h(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(null)) {
            return;
        }
        webView.loadUrl("javascript: ".concat("null"));
    }
}
