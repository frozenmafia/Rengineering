package com.phonepe.intent.sdk.bridges;

import android.webkit.JavascriptInterface;
import irjuc.irjuc.cqqlq.irjuc.jmjou.jmjou;
import irjuc.irjuc.cqqlq.irjuc.zihjx.krrvc;
import o.CanvasUtils;
import o.__union;
import o.beginAsyncSectionFallback;
import o.handleException;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class BridgeHandler implements handleException {
    public static final String TAG = "NativeSDK";
    public jmjou cqqlq;

    /* renamed from: irjuc  reason: collision with root package name */
    public __union f1403irjuc;

    public jmjou getObjectFactory() {
        return this.cqqlq;
    }

    @Override // o.handleException
    public void init(jmjou jmjouVar, jmjou.chmha chmhaVar) {
        this.f1403irjuc = (__union) chmhaVar.irjuc("bridgeCallback", null);
        this.cqqlq = jmjouVar;
    }

    @Override // o.handleException
    public boolean isCachingAllowed() {
        return false;
    }

    @JavascriptInterface
    public void onJSLoadStateChanged(String str, String str2, String str3) {
        beginAsyncSectionFallback.ag$a(TAG, String.format("onJSLoadStateChanged: isJSLoaded = {%s}", str2));
        this.f1403irjuc.irjuc(str, str2, str3);
    }

    @JavascriptInterface
    public void onTransactionComplete(String str) {
        beginAsyncSectionFallback.ag$a(TAG, String.format("onTransactionComplete: paymentResponse = {%s}", str));
        this.f1403irjuc.irjuc(str);
    }

    @JavascriptInterface
    public void setUrlConfig(String str) {
        beginAsyncSectionFallback.ag$a(TAG, String.format("setUrlConfig : jsData = {%s}", str));
        if (str != null && str.length() > 0 && this.f1403irjuc != null) {
            jmjou jmjouVar = this.cqqlq;
            CanvasUtils canvasUtils = null;
            try {
                JSONObject ah$a = beginAsyncSectionFallback.ah$a(new JSONObject(str), "urlConfig", true, true);
                if (ah$a != null) {
                    canvasUtils = CanvasUtils.ah$a(ah$a.toString(), jmjouVar);
                }
            } catch (JSONException e) {
                beginAsyncSectionFallback.valueOf("UrlConfigData", String.format("JSONException caught with message = {%s}", e.getMessage()), e);
            }
            if (canvasUtils != null) {
                this.f1403irjuc.irjuc(canvasUtils);
                return;
            }
        }
        Object[] objArr = new Object[2];
        objArr[0] = str;
        objArr[1] = Boolean.valueOf(this.f1403irjuc == null);
        String format = String.format("setUrlConfig is called with jsData = {%s}. bridgeCallback is null = {%s}", objArr);
        beginAsyncSectionFallback.ah$a(TAG, format);
        this.cqqlq.valueOf().ah$a(TAG, format, krrvc.irjuc.LOW);
    }

    @JavascriptInterface
    public void showLoader(String str, String str2, String str3) {
        beginAsyncSectionFallback.ag$a(TAG, String.format("showLoader: shouldShowLoader = {%s}", str2));
        this.f1403irjuc.cqqlq(str, str2, str3);
    }
}
