package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class ac {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final long f454b;
    public final long c;
    public final float d;
    public final float e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ac(ab abVar) {
        long j;
        long j2;
        long j3;
        float f;
        float f2;
        j = abVar.a;
        j2 = abVar.f435b;
        j3 = abVar.c;
        f = abVar.d;
        f2 = abVar.e;
        this.a = j;
        this.f454b = j2;
        this.c = j3;
        this.d = f;
        this.e = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ac) {
            ac acVar = (ac) obj;
            return this.a == acVar.a && this.f454b == acVar.f454b && this.c == acVar.c && this.d == acVar.d && this.e == acVar.e;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.f454b;
        long j3 = this.c;
        int i = (int) (j ^ (j >>> 32));
        int i2 = (int) (j2 ^ (j2 >>> 32));
        int i3 = (int) ((j3 >>> 32) ^ j3);
        float f = this.d;
        int floatToIntBits = f != 0.0f ? Float.floatToIntBits(f) : 0;
        float f2 = this.e;
        return (((((((i * 31) + i2) * 31) + i3) * 31) + floatToIntBits) * 31) + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }
}
