package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
/* loaded from: classes4.dex */
public final class ay {
    public final Object a;

    /* renamed from: b  reason: collision with root package name */
    public final int f763b;
    public final ai c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    public ay(Object obj, int i, ai aiVar, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.a = obj;
        this.f763b = i;
        this.c = aiVar;
        this.d = obj2;
        this.e = i2;
        this.f = j;
        this.g = j2;
        this.h = i3;
        this.i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ay ayVar = (ay) obj;
        return this.f763b == ayVar.f763b && this.e == ayVar.e && this.f == ayVar.f && this.g == ayVar.g && this.h == ayVar.h && this.i == ayVar.i && atc.o(this.a, ayVar.a) && atc.o(this.d, ayVar.d) && atc.o(this.c, ayVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.f763b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i)});
    }
}
