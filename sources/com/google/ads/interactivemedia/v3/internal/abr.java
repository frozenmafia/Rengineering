package com.google.ads.interactivemedia.v3.internal;

import android.util.Pair;
import com.google.android.exoplayer2.C;
/* loaded from: classes4.dex */
final class abr implements abu {
    private final long[] a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f448b;
    private final long c;

    private abr(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.f448b = jArr2;
        this.c = j == C.TIME_UNSET ? cp.t(jArr2[jArr2.length - 1]) : j;
    }

    public static abr c(long j, aax aaxVar, long j2) {
        int length = aaxVar.d.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += aaxVar.f432b + aaxVar.d[i3];
            j3 += aaxVar.c + aaxVar.e[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new abr(jArr, jArr2, j2);
    }

    private static Pair d(long j, long[] jArr, long[] jArr2) {
        int aq = cp.aq(jArr, j, true);
        long j2 = jArr[aq];
        long j3 = jArr2[aq];
        int i = aq + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abu
    public final long a() {
        return -1L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abu
    public final long b(long j) {
        return cp.t(((Long) d(j, this.a, this.f448b).second).longValue());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zw
    public final long e() {
        return this.c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zw
    public final zu g(long j) {
        Pair d = d(cp.x(cp.p(j, 0L, this.c)), this.f448b, this.a);
        long longValue = ((Long) d.first).longValue();
        zx zxVar = new zx(cp.t(longValue), ((Long) d.second).longValue());
        return new zu(zxVar, zxVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zw
    public final boolean h() {
        return true;
    }
}
