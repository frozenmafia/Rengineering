package com.apxor.androidsdk.plugins.wysiwyg;

import android.webkit.JavascriptInterface;
import com.apxor.androidsdk.core.SDKController;
/* loaded from: classes6.dex */
public class ApxJavascriptInterface {
    private String a(String str) {
        SDKController sDKController = SDKController.getInstance();
        return String.format(str + "art-config?appId=%s&deviceId=%s", sDKController.getApplicationID(), sDKController.getDeviceID());
    }

    @JavascriptInterface
    public String getApi() {
        return a("https://sse.apxor.com/v1/api/");
    }

    @JavascriptInterface
    public String getAppId() {
        return "https://sse.apxor.com/v1/api/sse-ui-config?appId=" + SDKController.getInstance().getApplicationID();
    }

    @JavascriptInterface
    public String getNApi() {
        return a("https://server.apxor.com/v1/sse/");
    }

    @JavascriptInterface
    public String getNAppId() {
        SDKController sDKController = SDKController.getInstance();
        return String.format("https://server.apxor.com/v1/sse/ui-config?appId=%s&deviceId=%s", sDKController.getApplicationID(), sDKController.getDeviceID());
    }

    @JavascriptInterface
    public void onMessage(String str) {
        e.b().a(str);
    }
}
