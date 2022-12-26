package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class me {
    final long a;

    /* renamed from: b  reason: collision with root package name */
    final long f1169b;

    public me(long j, long j2) {
        this.a = j;
        this.f1169b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        me meVar = (me) obj;
        return this.a == meVar.a && this.f1169b == meVar.f1169b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.f1169b);
    }
}
