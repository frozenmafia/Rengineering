package com.google.ads.interactivemedia.v3.internal;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes4.dex */
public abstract class vh implements vz {
    protected final bf a;

    /* renamed from: b  reason: collision with root package name */
    protected final int f1312b;
    protected final int[] c;
    private final s[] d;
    private final long[] e;
    private int f;

    public vh(bf bfVar, int[] iArr) {
        int length = iArr.length;
        int i = 0;
        af.w(length > 0);
        af.s(bfVar);
        this.a = bfVar;
        this.f1312b = length;
        this.d = new s[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.d[i2] = bfVar.b(iArr[i2]);
        }
        Arrays.sort(this.d, vk.f1314b);
        this.c = new int[this.f1312b];
        while (true) {
            int i3 = this.f1312b;
            if (i >= i3) {
                this.e = new long[i3];
                return;
            } else {
                this.c[i] = bfVar.a(this.d[i]);
                i++;
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public int e(long j, List list) {
        return list.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        vh vhVar = (vh) obj;
        return this.a == vhVar.a && Arrays.equals(this.c, vhVar.c);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public void f() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public void g() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public void h(float f) {
    }

    public final int hashCode() {
        int i = this.f;
        if (i == 0) {
            int identityHashCode = (System.identityHashCode(this.a) * 31) + Arrays.hashCode(this.c);
            this.f = identityHashCode;
            return identityHashCode;
        }
        return i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wc
    public final int j(int i) {
        return this.c[i];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final int k() {
        return this.c[a()];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wc
    public final int l(int i) {
        for (int i2 = 0; i2 < this.f1312b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wc
    public final int m(s sVar) {
        for (int i = 0; i < this.f1312b; i++) {
            if (this.d[i] == sVar) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wc
    public final int n() {
        return this.c.length;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wc
    public final s o(int i) {
        return this.d[i];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final s p() {
        return this.d[a()];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wc
    public final bf q() {
        return this.a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final boolean r(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean s = s(i, elapsedRealtime);
        int i2 = 0;
        while (true) {
            if (i2 < this.f1312b) {
                if (s) {
                    break;
                }
                s = (i2 == i || s(i2, elapsedRealtime)) ? false : true;
                i2++;
            } else if (!s) {
                return false;
            }
        }
        long[] jArr = this.e;
        jArr[i] = Math.max(jArr[i], cp.an(elapsedRealtime, j));
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final boolean s(int i, long j) {
        return this.e[i] > j;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final /* synthetic */ void t() {
    }
}
