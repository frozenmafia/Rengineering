package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
final class abv implements abu {
    private final long[] a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f451b;
    private final long c;
    private final long d;

    private abv(long[] jArr, long[] jArr2, long j, long j2) {
        this.a = jArr;
        this.f451b = jArr2;
        this.c = j;
        this.d = j2;
    }

    public static abv c(long j, long j2, zm zmVar, ci ciVar) {
        int i;
        ciVar.G(10);
        int e = ciVar.e();
        if (e <= 0) {
            return null;
        }
        int i2 = zmVar.d;
        long w = cp.w(e, (i2 >= 32000 ? 1152 : 576) * 1000000, i2);
        int m = ciVar.m();
        int m2 = ciVar.m();
        int m3 = ciVar.m();
        ciVar.G(2);
        long j3 = j2 + zmVar.c;
        long[] jArr = new long[m];
        long[] jArr2 = new long[m];
        int i3 = 0;
        long j4 = j2;
        while (i3 < m) {
            int i4 = m2;
            long j5 = j3;
            jArr[i3] = (i3 * w) / m;
            jArr2[i3] = Math.max(j4, j5);
            if (m3 == 1) {
                i = ciVar.i();
            } else if (m3 == 2) {
                i = ciVar.m();
            } else if (m3 == 3) {
                i = ciVar.k();
            } else if (m3 != 4) {
                return null;
            } else {
                i = ciVar.l();
            }
            j4 += i * i4;
            i3++;
            jArr = jArr;
            m2 = i4;
            j3 = j5;
        }
        long[] jArr3 = jArr;
        if (j != -1 && j != j4) {
            cc.e("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new abv(jArr3, jArr2, w, j4);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abu
    public final long a() {
        return this.d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abu
    public final long b(long j) {
        return this.a[cp.aq(this.f451b, j, true)];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zw
    public final long e() {
        return this.c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zw
    public final zu g(long j) {
        int aq = cp.aq(this.a, j, true);
        zx zxVar = new zx(this.a[aq], this.f451b[aq]);
        if (zxVar.f1389b < j) {
            long[] jArr = this.a;
            if (aq != jArr.length - 1) {
                int i = aq + 1;
                return new zu(zxVar, new zx(jArr[i], this.f451b[i]));
            }
        }
        return new zu(zxVar, zxVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zw
    public final boolean h() {
        return true;
    }
}
