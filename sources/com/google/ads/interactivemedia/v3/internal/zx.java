package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class zx {
    public static final zx a = new zx(0, 0);

    /* renamed from: b  reason: collision with root package name */
    public final long f1389b;
    public final long c;

    public zx(long j, long j2) {
        this.f1389b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zx zxVar = (zx) obj;
        return this.f1389b == zxVar.f1389b && this.c == zxVar.c;
    }

    public final int hashCode() {
        return (((int) this.f1389b) * 31) + ((int) this.c);
    }

    public final String toString() {
        long j = this.f1389b;
        long j2 = this.c;
        return "[timeUs=" + j + ", position=" + j2 + "]";
    }
}
