package com.paytm.pgsdk;

import android.app.IntentService;
import android.content.Intent;
/* loaded from: classes5.dex */
public class IntentServicePostNotification extends IntentService {
    public IntentServicePostNotification() {
        super("IntentServicePostNotification");
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        if (intent == null || intent.getExtras() == null) {
            return;
        }
        ah$a(intent.getExtras().getString("url"));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ah$a(java.lang.String r6) {
        /*
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            java.net.URLConnection r6 = r1.openConnection()     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            java.io.InputStream r0 = r6.getInputStream()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            int r0 = r1.read()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
        L20:
            r2 = -1
            if (r0 == r2) goto L2f
            char r0 = (char) r0     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            int r2 = r1.read()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            java.io.PrintStream r3 = java.lang.System.out     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            r3.print(r0)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            r0 = r2
            goto L20
        L2f:
            if (r6 == 0) goto L45
            goto L42
        L32:
            r0 = move-exception
            goto L4a
        L34:
            r0 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
            goto L3c
        L39:
            r6 = move-exception
            goto L4d
        L3b:
            r6 = move-exception
        L3c:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L45
            r6 = r0
        L42:
            r6.disconnect()
        L45:
            return
        L46:
            r6 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L4a:
            r4 = r0
            r0 = r6
            r6 = r4
        L4d:
            if (r0 == 0) goto L52
            r0.disconnect()
        L52:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paytm.pgsdk.IntentServicePostNotification.ah$a(java.lang.String):void");
    }
}
