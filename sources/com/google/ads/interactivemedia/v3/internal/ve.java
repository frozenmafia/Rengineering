package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class ve {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1311b;

    public ve(long j, long j2) {
        this.a = j;
        this.f1311b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ve) {
            ve veVar = (ve) obj;
            return this.a == veVar.a && this.f1311b == veVar.f1311b;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.f1311b);
    }
}
