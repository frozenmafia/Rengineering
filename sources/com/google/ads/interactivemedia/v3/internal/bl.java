package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bl {
    public static final bl a = new bl(0, 0, 0, 1.0f);

    /* renamed from: b  reason: collision with root package name */
    public final int f873b;
    public final int c;
    public final int d;
    public final float e;

    public bl(int i, int i2, int i3, float f) {
        this.f873b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bl) {
            bl blVar = (bl) obj;
            return this.f873b == blVar.f873b && this.c == blVar.c && this.d == blVar.d && this.e == blVar.e;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f873b + 217) * 31) + this.c) * 31) + this.d) * 31) + Float.floatToRawIntBits(this.e);
    }
}
