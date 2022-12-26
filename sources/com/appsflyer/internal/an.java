package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
/* loaded from: classes3.dex */
public final class an {
    private static String AFInAppEventType;

    public static String AFKeystoreWrapper(WeakReference<Context> weakReference) {
        synchronized (an.class) {
            if (weakReference.get() == null) {
                return AFInAppEventType;
            }
            if (AFInAppEventType == null) {
                String str = null;
                if (weakReference.get() != null) {
                    str = ah.values(weakReference.get()).getString("AF_INSTALLATION", null);
                }
                if (str != null) {
                    AFInAppEventType = str;
                } else {
                    try {
                        File file = new File(weakReference.get().getFilesDir(), "AF_INSTALLATION");
                        if (file.exists()) {
                            AFInAppEventType = AFInAppEventType(file);
                            file.delete();
                        } else {
                            long currentTimeMillis = System.currentTimeMillis();
                            StringBuilder sb = new StringBuilder();
                            sb.append(currentTimeMillis);
                            sb.append("-");
                            sb.append(Math.abs(new SecureRandom().nextLong()));
                            AFInAppEventType = sb.toString();
                        }
                        String str2 = AFInAppEventType;
                        SharedPreferences.Editor edit = ah.values(weakReference.get()).edit();
                        edit.putString("AF_INSTALLATION", str2);
                        edit.apply();
                    } catch (Exception e) {
                        AFLogger.values("Error getting AF unique ID", e);
                    }
                }
                if (AFInAppEventType != null) {
                    AppsFlyerProperties.getInstance().set("uid", AFInAppEventType);
                }
            }
            return AFInAppEventType;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String AFInAppEventType(java.io.File r6) {
        /*
            java.lang.String r0 = "Exception while trying to close the InstallationFile"
            r1 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            java.lang.String r3 = "r"
            r2.<init>(r6, r3)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            long r3 = r2.length()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22
            int r6 = (int) r3     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22
            byte[] r1 = new byte[r6]     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22
            r2.readFully(r1)     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22
            r2.close()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22
            r2.close()     // Catch: java.io.IOException -> L1b
            goto L3b
        L1b:
            r6 = move-exception
            com.appsflyer.AFLogger.values(r0, r6)
            goto L3b
        L20:
            r6 = move-exception
            goto L48
        L22:
            r6 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
            goto L2b
        L27:
            r6 = move-exception
            goto L47
        L29:
            r6 = move-exception
            r2 = r1
        L2b:
            java.lang.String r3 = "Exception while reading InstallationFile: "
            com.appsflyer.AFLogger.values(r3, r6)     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L3a
            r1.close()     // Catch: java.io.IOException -> L36
            goto L3a
        L36:
            r6 = move-exception
            com.appsflyer.AFLogger.values(r0, r6)
        L3a:
            r1 = r2
        L3b:
            if (r1 == 0) goto L3e
            goto L41
        L3e:
            r6 = 0
            byte[] r1 = new byte[r6]
        L41:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1)
            return r6
        L47:
            r2 = r1
        L48:
            if (r2 == 0) goto L52
            r2.close()     // Catch: java.io.IOException -> L4e
            goto L52
        L4e:
            r1 = move-exception
            com.appsflyer.AFLogger.values(r0, r1)
        L52:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.an.AFInAppEventType(java.io.File):java.lang.String");
    }
}
