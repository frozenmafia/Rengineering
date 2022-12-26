package com.paytm.pgsdk;

import android.app.IntentService;
import android.content.Intent;
/* loaded from: classes5.dex */
public class IntentServicePreNotification extends IntentService {
    public IntentServicePreNotification() {
        super("IntentServicePreNotification");
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            values(intent.getExtras().getString("url"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void values(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            java.net.URLConnection r6 = r1.openConnection()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            java.io.InputStream r0 = r6.getInputStream()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            int r0 = r1.read()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
        L19:
            r2 = -1
            if (r0 == r2) goto L28
            char r0 = (char) r0     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            int r2 = r1.read()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            java.io.PrintStream r3 = java.lang.System.out     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r3.print(r0)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r0 = r2
            goto L19
        L28:
            if (r6 == 0) goto L3e
            goto L3b
        L2b:
            r0 = move-exception
            goto L43
        L2d:
            r0 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
            goto L35
        L32:
            r6 = move-exception
            goto L46
        L34:
            r6 = move-exception
        L35:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L3e
            r6 = r0
        L3b:
            r6.disconnect()
        L3e:
            return
        L3f:
            r6 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L43:
            r4 = r0
            r0 = r6
            r6 = r4
        L46:
            if (r0 == 0) goto L4b
            r0.disconnect()
        L4b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paytm.pgsdk.IntentServicePreNotification.values(java.lang.String):void");
    }
}
