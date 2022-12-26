package com.google.ads.interactivemedia.v3.internal;

import android.content.BroadcastReceiver;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class cf extends BroadcastReceiver {
    final /* synthetic */ cg a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ cf(cg cgVar) {
        this.a = cgVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
        if (com.google.ads.interactivemedia.v3.internal.cp.a >= 29) goto L16;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r7, android.content.Intent r8) {
        /*
            r6 = this;
            java.lang.String r8 = "connectivity"
            java.lang.Object r8 = r7.getSystemService(r8)
            android.net.ConnectivityManager r8 = (android.net.ConnectivityManager) r8
            r0 = 9
            r1 = 6
            r2 = 4
            r3 = 1
            r4 = 5
            if (r8 != 0) goto L11
            goto L4d
        L11:
            android.net.NetworkInfo r8 = r8.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L4d
            if (r8 == 0) goto L4b
            boolean r5 = r8.isConnected()
            if (r5 != 0) goto L1e
            goto L4b
        L1e:
            int r5 = r8.getType()
            if (r5 == 0) goto L33
            if (r5 == r3) goto L43
            if (r5 == r2) goto L33
            if (r5 == r4) goto L33
            if (r5 == r1) goto L45
            if (r5 == r0) goto L31
            r0 = 8
            goto L4e
        L31:
            r0 = 7
            goto L4e
        L33:
            int r8 = r8.getSubtype()
            switch(r8) {
                case 1: goto L49;
                case 2: goto L49;
                case 3: goto L47;
                case 4: goto L47;
                case 5: goto L47;
                case 6: goto L47;
                case 7: goto L47;
                case 8: goto L47;
                case 9: goto L47;
                case 10: goto L47;
                case 11: goto L47;
                case 12: goto L47;
                case 13: goto L45;
                case 14: goto L47;
                case 15: goto L47;
                case 16: goto L3a;
                case 17: goto L47;
                case 18: goto L43;
                case 19: goto L3a;
                case 20: goto L3c;
                default: goto L3a;
            }
        L3a:
            r0 = 6
            goto L4e
        L3c:
            int r8 = com.google.ads.interactivemedia.v3.internal.cp.a
            r1 = 29
            if (r8 < r1) goto L4d
            goto L4e
        L43:
            r0 = 2
            goto L4e
        L45:
            r0 = 5
            goto L4e
        L47:
            r0 = 4
            goto L4e
        L49:
            r0 = 3
            goto L4e
        L4b:
            r0 = 1
            goto L4e
        L4d:
            r0 = 0
        L4e:
            int r8 = com.google.ads.interactivemedia.v3.internal.cp.a
            r1 = 31
            if (r8 < r1) goto L77
            if (r0 != r4) goto L77
            com.google.ads.interactivemedia.v3.internal.cg r8 = r6.a
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r7.getSystemService(r0)     // Catch: java.lang.RuntimeException -> L73
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.RuntimeException -> L73
            com.google.ads.interactivemedia.v3.internal.af.s(r0)     // Catch: java.lang.RuntimeException -> L73
            com.google.ads.interactivemedia.v3.internal.ce r1 = new com.google.ads.interactivemedia.v3.internal.ce     // Catch: java.lang.RuntimeException -> L73
            r1.<init>(r8)     // Catch: java.lang.RuntimeException -> L73
            java.util.concurrent.Executor r7 = r7.getMainExecutor()     // Catch: java.lang.RuntimeException -> L73
            r0.registerTelephonyCallback(r7, r1)     // Catch: java.lang.RuntimeException -> L73
            r0.unregisterTelephonyCallback(r1)     // Catch: java.lang.RuntimeException -> L73
            return
        L73:
            com.google.ads.interactivemedia.v3.internal.cg.c(r8, r4)
            return
        L77:
            com.google.ads.interactivemedia.v3.internal.cg r7 = r6.a
            com.google.ads.interactivemedia.v3.internal.cg.c(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.cf.onReceive(android.content.Context, android.content.Intent):void");
    }
}
