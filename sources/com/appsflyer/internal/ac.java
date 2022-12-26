package com.appsflyer.internal;

import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.b;
/* loaded from: classes3.dex */
public final class ac {
    static String values;

    public static b.e.a AFInAppEventType(ContentResolver contentResolver) {
        String str;
        if (contentResolver != null && AppsFlyerProperties.getInstance().getString("amazon_aid") == null && "Amazon".equals(Build.MANUFACTURER)) {
            int i = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 2);
            if (i == 0) {
                return new b.e.a(Settings.Secure.getString(contentResolver, "advertising_id"), Boolean.FALSE);
            }
            if (i == 2) {
                return null;
            }
            try {
                str = Settings.Secure.getString(contentResolver, "advertising_id");
            } catch (Throwable th) {
                AFLogger.values("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th);
                str = "";
            }
            return new b.e.a(str, Boolean.TRUE);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.appsflyer.internal.b.e.a AFKeystoreWrapper(android.content.Context r5) {
        /*
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = com.appsflyer.internal.ac.values
            r2 = 1
            if (r1 == 0) goto Lb
            r3 = 1
            goto Lc
        Lb:
            r3 = 0
        Lc:
            r4 = 0
            if (r3 == 0) goto L10
            goto L3b
        L10:
            java.lang.String r1 = "collectOAID"
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 == 0) goto L3e
            com.appsflyer.oaid.OaidClient r1 = new com.appsflyer.oaid.OaidClient     // Catch: java.lang.Throwable -> L35
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L35
            boolean r5 = r0.isEnableLog()     // Catch: java.lang.Throwable -> L35
            r1.setLogging(r5)     // Catch: java.lang.Throwable -> L35
            com.appsflyer.oaid.OaidClient$Info r5 = r1.fetch()     // Catch: java.lang.Throwable -> L35
            if (r5 == 0) goto L3e
            java.lang.String r0 = r5.getId()     // Catch: java.lang.Throwable -> L35
            java.lang.Boolean r5 = r5.getLat()     // Catch: java.lang.Throwable -> L33
            goto L40
        L33:
            r1 = r0
            goto L36
        L35:
            r1 = r4
        L36:
            java.lang.String r5 = "No OAID library"
            com.appsflyer.AFLogger.AFKeystoreWrapper(r5)
        L3b:
            r0 = r1
            r5 = r4
            goto L40
        L3e:
            r5 = r4
            r0 = r5
        L40:
            if (r0 == 0) goto L4e
            com.appsflyer.internal.b$e$a r1 = new com.appsflyer.internal.b$e$a
            r1.<init>(r0, r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            r1.valueOf = r5
            return r1
        L4e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.ac.AFKeystoreWrapper(android.content.Context):com.appsflyer.internal.b$e$a");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r7.length() == 0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.appsflyer.internal.b.e.a values(android.content.Context r11, java.util.Map<java.lang.String, java.lang.Object> r12) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.ac.values(android.content.Context, java.util.Map):com.appsflyer.internal.b$e$a");
    }
}
