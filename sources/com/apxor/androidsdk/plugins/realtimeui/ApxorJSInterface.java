package com.apxor.androidsdk.plugins.realtimeui;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.apxor.androidsdk.core.ApxorSDK;
import com.apxor.androidsdk.core.Attributes;
import com.apxor.androidsdk.core.ce.ContextEvaluator;
import com.apxor.androidsdk.core.utils.Logger;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class ApxorJSInterface {
    @JavascriptInterface
    public void logActionEvent(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            Logger.e("", "Params can't be empty or null", null);
        } else {
            UIManager.getInstance().a(str, str2, str3);
        }
    }

    @JavascriptInterface
    public void logAppEvent(String str) {
        logAppEvent(str, null);
    }

    @JavascriptInterface
    public void logAppEvent(String str, String str2) {
        Attributes attributes = new Attributes();
        if (str2 != null) {
            try {
                attributes.flatten(new JSONObject(str2));
            } catch (Exception unused) {
            }
        }
        ApxorSDK.logAppEvent(str, attributes);
    }

    @JavascriptInterface
    public void logClientEvent(String str) {
        logClientEvent(str, null);
    }

    @JavascriptInterface
    public void logClientEvent(String str, String str2) {
        Attributes attributes = new Attributes();
        if (str2 != null) {
            try {
                attributes.flatten(new JSONObject(str2));
            } catch (Exception unused) {
            }
        }
        ApxorSDK.logClientEvent(str, attributes);
    }

    @JavascriptInterface
    public void updateCount(String str) {
        if (TextUtils.isEmpty(str)) {
            Logger.e("", "Param can't be empty or null", null);
        } else {
            ContextEvaluator.getInstance().updateShowCount(str);
        }
    }

    @JavascriptInterface
    public void updateFlag(boolean z) {
        UIManager.getInstance().a("IN_LINE", z);
    }
}
