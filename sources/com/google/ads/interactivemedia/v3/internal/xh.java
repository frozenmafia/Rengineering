package com.google.ads.interactivemedia.v3.internal;

import com.google.android.exoplayer2.C;
/* loaded from: classes4.dex */
public final class xh {
    private static final Object a = new Object();

    /* renamed from: b */
    private static final Object f1341b = new Object();
    private static boolean c = false;
    private static long d = 0;
    private static final String e = "time.android.com";

    /* JADX WARN: Code restructure failed: missing block: B:91:0x00fc, code lost:
        if (r6 > 15) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0102, code lost:
        if (r13 == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0104, code lost:
        r11 = ((r11 - r9) + (r13 - r7)) / 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x010a, code lost:
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x010f, code lost:
        return (r7 + r11) - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0117, code lost:
        throw new java.io.IOException("SNTP: Zero transmitTime");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ long a() {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.xh.a():long");
    }

    public static long b() {
        long j;
        synchronized (f1341b) {
            j = c ? d : C.TIME_UNSET;
        }
        return j;
    }

    public static void f(wx wxVar, xe xeVar) {
        if (h()) {
            xeVar.b();
            return;
        }
        if (wxVar == null) {
            wxVar = new wx("SntpClient");
        }
        wxVar.b(new xg(null), new xf(xeVar), 1);
    }

    public static boolean h() {
        boolean z;
        synchronized (f1341b) {
            z = c;
        }
        return z;
    }

    private static long j(byte[] bArr, int i) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & 127) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        return (i2 << 24) + (i3 << 16) + (i4 << 8) + i5;
    }

    private static long k(byte[] bArr, int i) {
        long j = j(bArr, i);
        long j2 = j(bArr, i + 4);
        if (j == 0) {
            if (j2 == 0) {
                return 0L;
            }
            j = 0;
        }
        return ((j - 2208988800L) * 1000) + ((j2 * 1000) / 4294967296L);
    }
}
