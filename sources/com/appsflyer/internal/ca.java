package com.appsflyer.internal;
/* loaded from: classes3.dex */
public final class ca {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static long[] values(int i, int i2) {
        long[] jArr = new long[4];
        jArr[0] = (i2 & 4294967295L) | ((i & 4294967295L) << 32);
        for (int i3 = 1; i3 < 4; i3++) {
            long j = jArr[i3 - 1];
            jArr[i3] = ((j ^ (j >> 30)) * 1812433253) + i3;
        }
        return jArr;
    }
}
