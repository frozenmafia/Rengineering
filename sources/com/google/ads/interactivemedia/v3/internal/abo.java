package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
/* loaded from: classes4.dex */
final class abo {
    private static final long[] a = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f447b = new byte[8];
    private int c;
    private int d;

    public static int b(int i) {
        int i2 = 0;
        while (i2 < 8) {
            i2++;
            if ((a[i2] & i) != 0) {
                return i2;
            }
        }
        return -1;
    }

    public static long c(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~a[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public final int a() {
        return this.d;
    }

    public final long d(zd zdVar, boolean z, boolean z2, int i) throws IOException {
        if (this.c == 0) {
            if (!zdVar.l(this.f447b, 0, 1, z)) {
                return -1L;
            }
            int b2 = b(this.f447b[0] & 255);
            this.d = b2;
            if (b2 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.c = 1;
        }
        int i2 = this.d;
        if (i2 > i) {
            this.c = 0;
            return -2L;
        }
        if (i2 != 1) {
            zdVar.g(this.f447b, 1, i2 - 1);
        }
        this.c = 0;
        return c(this.f447b, this.d, z2);
    }

    public final void e() {
        this.c = 0;
        this.d = 0;
    }
}
