package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public final class as {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject AFInAppEventType(String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
            if (jSONObject.optBoolean("monitor", false) && !z) {
                ap.AFInAppEventParameterName().AFInAppEventType();
            } else {
                ap.AFInAppEventParameterName().valueOf();
                ap.AFInAppEventParameterName().values();
            }
            if (jSONObject.has("ol_id")) {
                String optString = jSONObject.optString("ol_scheme", null);
                String optString2 = jSONObject.optString("ol_domain", null);
                String optString3 = jSONObject.optString("ol_ver", null);
                if (optString != null) {
                    AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_SCHEME, optString);
                }
                if (optString2 != null) {
                    AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_DOMAIN, optString2);
                }
                if (optString3 != null) {
                    AppsFlyerProperties.getInstance().set("onelinkVersion", optString3);
                    return jSONObject;
                }
                return jSONObject;
            }
            return jSONObject;
        } catch (Throwable th2) {
            th = th2;
            jSONObject2 = jSONObject;
            AFLogger.values(th.getMessage(), th);
            ap.AFInAppEventParameterName().valueOf();
            ap.AFInAppEventParameterName().values();
            return jSONObject2;
        }
    }

    public static String AFKeystoreWrapper(String str) {
        return String.format(str, AppsFlyerLib.getInstance().getHostPrefix(), ah.AFInAppEventParameterName().getHostName());
    }
}
