package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Map;
import org.json.JSONException;
/* loaded from: classes3.dex */
public final class aq {
    public static void valueOf(String str) {
        if (f.values().values != null) {
            AFLogger.AFKeystoreWrapper("[DDL] Error occurred: ".concat(String.valueOf(str)));
            AFInAppEventParameterName(new DeepLinkResult(null, DeepLinkResult.c.NETWORK));
            return;
        }
        AFInAppEventType(str);
    }

    public static void valueOf(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (f.values().values != null) {
            try {
                try {
                    DeepLink AFKeystoreWrapper = DeepLink.AFKeystoreWrapper(map);
                    AFKeystoreWrapper.valueOf.put("is_deferred", false);
                    deepLinkResult = new DeepLinkResult(AFKeystoreWrapper, null);
                } catch (JSONException e) {
                    AFLogger.AFInAppEventParameterName("[DDL] Error occurred", e);
                    deepLinkResult = new DeepLinkResult(null, DeepLinkResult.c.UNEXPECTED);
                }
                AFInAppEventParameterName(deepLinkResult);
                return;
            } catch (Throwable th) {
                AFInAppEventParameterName(new DeepLinkResult(null, null));
                throw th;
            }
        }
        AFKeystoreWrapper(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void AFInAppEventParameterName(DeepLinkResult deepLinkResult) {
        if (f.values().values != null) {
            StringBuilder sb = new StringBuilder("[DDL] Calling onDeepLinking with:\n");
            sb.append(deepLinkResult.toString());
            AFLogger.AFKeystoreWrapper(sb.toString());
            try {
                f.values().values.onDeepLinking(deepLinkResult);
                return;
            } catch (Throwable th) {
                AFLogger.values(th.getLocalizedMessage(), th);
                return;
            }
        }
        AFLogger.AFKeystoreWrapper("[DDL] skipping, no callback registered");
    }

    private static void AFKeystoreWrapper(Map<String, String> map) {
        if (ah.AFInAppEventType != null) {
            try {
                StringBuilder sb = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb.append(map.toString());
                AFLogger.AFKeystoreWrapper(sb.toString());
                ah.AFInAppEventType.onAppOpenAttribution(map);
            } catch (Throwable th) {
                AFLogger.values(th.getLocalizedMessage(), th);
            }
        }
    }

    private static void AFInAppEventType(String str) {
        if (ah.AFInAppEventType != null) {
            try {
                AFLogger.AFKeystoreWrapper("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                ah.AFInAppEventType.onAttributionFailure(str);
            } catch (Throwable th) {
                AFLogger.values(th.getLocalizedMessage(), th);
            }
        }
    }
}
