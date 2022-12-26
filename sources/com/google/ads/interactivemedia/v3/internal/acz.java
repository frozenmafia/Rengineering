package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
final class acz {
    public final acw a;

    /* renamed from: b  reason: collision with root package name */
    public final int f476b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public acz(acw acwVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        af.u(length == length2);
        int length3 = jArr.length;
        af.u(length3 == length2);
        int length4 = iArr2.length;
        af.u(length4 == length2);
        this.a = acwVar;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.f476b = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }

    public final int a(long j) {
        for (int aq = cp.aq(this.f, j, false); aq >= 0; aq--) {
            if ((this.g[aq] & 1) != 0) {
                return aq;
            }
        }
        return -1;
    }

    public final int b(long j) {
        for (int ao = cp.ao(this.f, j, true); ao < this.f.length; ao++) {
            if ((this.g[ao] & 1) != 0) {
                return ao;
            }
        }
        return -1;
    }
}
