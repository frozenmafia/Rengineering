package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class hk {
    public static final hk a;

    /* renamed from: b  reason: collision with root package name */
    public static final hk f1080b;
    public final long c;
    public final long d;

    static {
        hk hkVar = new hk(0L, 0L);
        a = hkVar;
        new hk(Long.MAX_VALUE, Long.MAX_VALUE);
        new hk(Long.MAX_VALUE, 0L);
        new hk(0L, Long.MAX_VALUE);
        f1080b = hkVar;
    }

    public hk(long j, long j2) {
        af.u(j >= 0);
        af.u(j2 >= 0);
        this.c = j;
        this.d = j2;
    }

    public final long a(long j, long j2, long j3) {
        long j4 = this.c;
        if (j4 == 0 && this.d == 0) {
            return j;
        }
        long aw = cp.aw(j, j4);
        long an = cp.an(j, this.d);
        boolean z = false;
        boolean z2 = aw <= j2 && j2 <= an;
        if (aw <= j3 && j3 <= an) {
            z = true;
        }
        return (z2 && z) ? Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3 : z2 ? j2 : z ? j3 : aw;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hk hkVar = (hk) obj;
        return this.c == hkVar.c && this.d == hkVar.d;
    }

    public final int hashCode() {
        return (((int) this.c) * 31) + ((int) this.d);
    }
}
