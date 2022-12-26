package com.google.android.gms.auth;

import o.isAfterLast;
/* loaded from: classes7.dex */
public final class CookieUtil {
    private static int ag$a = 1;
    private static int toString = 13;
    private static int valueOf;

    private CookieUtil() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        if ((true != zza(r5) ? 'L' : '\b') != 'L') goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        r5 = ag$a((android.view.ViewConfiguration.getTapTimeout() >> 16) + 5, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 125, true, 5 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), new char[]{3, 0, 4, 4, 65528}).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
        r5 = com.google.android.gms.auth.CookieUtil.ag$a + 123;
        com.google.android.gms.auth.CookieUtil.valueOf = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
        if ((r5 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
        r5 = '1';
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
        r5 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
        if (r5 == '1') goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
        r5 = r5.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
        r5 = org.apache.http.HttpHost.DEFAULT_SCHEME_NAME;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (true != zza(r5)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getCookieUrl(java.lang.String r4, java.lang.Boolean r5) {
        /*
            int r0 = com.google.android.gms.auth.CookieUtil.valueOf
            int r0 = r0 + 113
            int r1 = r0 % 128
            com.google.android.gms.auth.CookieUtil.ag$a = r1
            int r0 = r0 % 2
            r1 = 1
            if (r0 != 0) goto Lf
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            if (r0 == 0) goto L1c
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            boolean r5 = zza(r5)
            if (r1 == r5) goto L2e
            goto L54
        L1c:
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            boolean r5 = zza(r5)
            r0 = 76
            if (r1 == r5) goto L2a
            r5 = 76
            goto L2c
        L2a:
            r5 = 8
        L2c:
            if (r5 == r0) goto L54
        L2e:
            int r5 = android.view.ViewConfiguration.getTapTimeout()
            int r5 = r5 >> 16
            r0 = 5
            int r5 = r5 + r0
            int r2 = android.view.ViewConfiguration.getDoubleTapTimeout()
            int r2 = r2 >> 16
            int r2 = r2 + 125
            int r3 = android.view.ViewConfiguration.getMaximumFlingVelocity()
            int r3 = r3 >> 16
            int r3 = 5 - r3
            char[] r0 = new char[r0]
            r0 = {x008e: FILL_ARRAY_DATA  , data: [3, 0, 4, 4, -8} // fill-array
            java.lang.String r5 = ag$a(r5, r2, r1, r3, r0)
            java.lang.String r5 = r5.intern()
            goto L6d
        L54:
            int r5 = com.google.android.gms.auth.CookieUtil.ag$a
            int r5 = r5 + 123
            int r0 = r5 % 128
            com.google.android.gms.auth.CookieUtil.valueOf = r0
            int r5 = r5 % 2
            r0 = 49
            if (r5 == 0) goto L65
            r5 = 49
            goto L66
        L65:
            r5 = 7
        L66:
            if (r5 == r0) goto L69
            goto L6b
        L69:
            r5 = 0
            int r5 = r5.length     // Catch: java.lang.Throwable -> L8c
        L6b:
            java.lang.String r5 = "http"
        L6d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = "://"
            r0.append(r5)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            int r5 = com.google.android.gms.auth.CookieUtil.ag$a
            int r5 = r5 + 33
            int r0 = r5 % 128
            com.google.android.gms.auth.CookieUtil.valueOf = r0
            int r5 = r5 % 2
            return r4
        L8c:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.CookieUtil.getCookieUrl(java.lang.String, java.lang.Boolean):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
        if ((r4 != null) != true) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
        if (r4 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
        if (r4.booleanValue() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002f, code lost:
        if (r4 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
        r4 = com.google.android.gms.auth.CookieUtil.ag$a + 47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0038, code lost:
        com.google.android.gms.auth.CookieUtil.valueOf = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003e, code lost:
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003f, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0040, code lost:
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0041, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean zza(java.lang.Boolean r4) {
        /*
            int r0 = com.google.android.gms.auth.CookieUtil.valueOf
            int r0 = r0 + 65
            int r1 = r0 % 128
            com.google.android.gms.auth.CookieUtil.ag$a = r1
            int r0 = r0 % 2
            r1 = 68
            if (r0 != 0) goto L11
            r0 = 63
            goto L13
        L11:
            r0 = 68
        L13:
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L24
            r0 = 87
            int r0 = r0 / r2
            if (r4 == 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r0 == r3) goto L26
            goto L41
        L22:
            r4 = move-exception
            throw r4
        L24:
            if (r4 == 0) goto L41
        L26:
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L2e
            r4 = 0
            goto L2f
        L2e:
            r4 = 1
        L2f:
            if (r4 == 0) goto L32
            goto L41
        L32:
            int r4 = com.google.android.gms.auth.CookieUtil.ag$a     // Catch: java.lang.Exception -> L3f
            int r4 = r4 + 47
            int r0 = r4 % 128
            com.google.android.gms.auth.CookieUtil.valueOf = r0     // Catch: java.lang.Exception -> L3d
            int r4 = r4 % 2
            return r3
        L3d:
            r4 = move-exception
            throw r4
        L3f:
            r4 = move-exception
            throw r4
        L41:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.CookieUtil.zza(java.lang.Boolean):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:54:0x00d2
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static java.lang.String getCookieValue(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.Boolean r9, java.lang.Boolean r10, java.lang.Long r11) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.CookieUtil.getCookieValue(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Long):java.lang.String");
    }

    private static String ag$a(int i, int i2, boolean z, int i3, char[] cArr) {
        String str;
        synchronized (isAfterLast.valueOf) {
            char[] cArr2 = new char[i3];
            isAfterLast.values = 0;
            while (isAfterLast.values < i3) {
                isAfterLast.ag$a = cArr[isAfterLast.values];
                cArr2[isAfterLast.values] = (char) (isAfterLast.ag$a + i2);
                int i4 = isAfterLast.values;
                cArr2[i4] = (char) (cArr2[i4] - toString);
                isAfterLast.values++;
            }
            if (i > 0) {
                isAfterLast.toString = i;
                char[] cArr3 = new char[i3];
                System.arraycopy(cArr2, 0, cArr3, 0, i3);
                System.arraycopy(cArr3, 0, cArr2, i3 - isAfterLast.toString, isAfterLast.toString);
                System.arraycopy(cArr3, isAfterLast.toString, cArr2, 0, i3 - isAfterLast.toString);
            }
            if (z) {
                char[] cArr4 = new char[i3];
                isAfterLast.values = 0;
                while (isAfterLast.values < i3) {
                    cArr4[isAfterLast.values] = cArr2[(i3 - isAfterLast.values) - 1];
                    isAfterLast.values++;
                }
                cArr2 = cArr4;
            }
            str = new String(cArr2);
        }
        return str;
    }
}
