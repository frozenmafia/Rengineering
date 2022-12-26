package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
final class abw implements abu {
    private final long a;

    /* renamed from: b  reason: collision with root package name */
    private final int f452b;
    private final long c;
    private final long d;
    private final long e;
    private final long[] f;

    private abw(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.f452b = i;
        this.c = j2;
        this.f = jArr;
        this.d = j3;
        this.e = j3 != -1 ? j + j3 : -1L;
    }

    public static abw c(long j, long j2, zm zmVar, ci ciVar) {
        int l;
        int i = zmVar.g;
        int i2 = zmVar.d;
        int e = ciVar.e();
        if ((e & 1) != 1 || (l = ciVar.l()) == 0) {
            return null;
        }
        long w = cp.w(l, i * 1000000, i2);
        if ((e & 6) != 6) {
            return new abw(j2, zmVar.c, w, -1L, null);
        }
        long p = ciVar.p();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = ciVar.i();
        }
        if (j != -1) {
            long j3 = j2 + p;
            if (j != j3) {
                cc.e("XingSeeker", "XING data size mismatch: " + j + ", " + j3);
            }
        }
        return new abw(j2, zmVar.c, w, p, jArr);
    }

    private final long d(int i) {
        return (this.c * i) / 100;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abu
    public final long a() {
        return this.e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abu
    public final long b(long j) {
        long j2 = j - this.a;
        if (!h() || j2 <= this.f452b) {
            return 0L;
        }
        long[] jArr = (long[]) af.t(this.f);
        double d = (j2 * 256.0d) / this.d;
        int aq = cp.aq(jArr, (long) d, true);
        long d2 = d(aq);
        long j3 = jArr[aq];
        int i = aq + 1;
        long d3 = d(i);
        long j4 = aq == 99 ? 256L : jArr[i];
        return d2 + Math.round((j3 == j4 ? 0.0d : (d - j3) / (j4 - j3)) * (d3 - d2));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zw
    public final long e() {
        return this.c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zw
    public final zu g(long j) {
        long[] jArr;
        if (!h()) {
            zx zxVar = new zx(0L, this.a + this.f452b);
            return new zu(zxVar, zxVar);
        }
        long p = cp.p(j, 0L, this.c);
        double d = (p * 100.0d) / this.c;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                double d3 = ((long[]) af.t(this.f))[i];
                d2 = d3 + ((d - i) * ((i == 99 ? 256.0d : jArr[i + 1]) - d3));
            }
        }
        zx zxVar2 = new zx(p, this.a + cp.p(Math.round((d2 / 256.0d) * this.d), this.f452b, this.d - 1));
        return new zu(zxVar2, zxVar2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zw
    public final boolean h() {
        return this.f != null;
    }
}
