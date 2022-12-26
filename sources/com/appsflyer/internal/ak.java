package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
/* loaded from: classes3.dex */
public final class ak {
    private static String AFInAppEventParameterName;
    private static String AFInAppEventType;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void AFInAppEventParameterName(String str) {
        AFInAppEventType = str;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == str.length() - 1) {
                sb.append(str.charAt(i));
            } else {
                sb.append("*");
            }
        }
        AFInAppEventParameterName = sb.toString();
    }

    public static void values(String str) {
        if (AFInAppEventType == null) {
            AFInAppEventParameterName(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY));
        }
        String str2 = AFInAppEventType;
        if (str2 != null) {
            AFLogger.valueOf(str.replace(str2, AFInAppEventParameterName));
        }
    }
}
