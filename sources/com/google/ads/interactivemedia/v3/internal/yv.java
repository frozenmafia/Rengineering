package com.google.ads.interactivemedia.v3.internal;

import com.google.android.exoplayer2.C;
/* loaded from: classes4.dex */
public class yv implements zw {
    private final long a;

    /* renamed from: b  reason: collision with root package name */
    private final long f1370b;
    private final int c;
    private final long d;
    private final int e;
    private final long f;

    public yv(long j, long j2, int i, int i2) {
        long b2;
        this.a = j;
        this.f1370b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        if (j == -1) {
            this.d = -1L;
            b2 = C.TIME_UNSET;
        } else {
            this.d = j - j2;
            b2 = b(j, j2, i);
        }
        this.f = b2;
    }

    private static long b(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / i;
    }

    public final long B(long j) {
        return b(j, this.f1370b, this.e);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zw
    public final long e() {
        return this.f;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zw
    public final zu g(long j) {
        long j2 = this.d;
        int i = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
        if (i != 0) {
            int i2 = this.e;
            long j3 = this.c;
            long j4 = (((i2 * j) / 8000000) / j3) * j3;
            if (i != 0) {
                j4 = Math.min(j4, j2 - j3);
            }
            long max = this.f1370b + Math.max(j4, 0L);
            long B = B(max);
            zx zxVar = new zx(B, max);
            if (this.d != -1 && B < j) {
                long j5 = max + this.c;
                if (j5 < this.a) {
                    return new zu(zxVar, new zx(B(j5), j5));
                }
            }
            return new zu(zxVar, zxVar);
        }
        zx zxVar2 = new zx(0L, this.f1370b);
        return new zu(zxVar2, zxVar2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zw
    public final boolean h() {
        return this.d != -1;
    }
}
