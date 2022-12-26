package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
/* loaded from: classes4.dex */
public final class hu {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final be f1084b;
    public final int c;
    public final ta d;
    public final long e;
    public final be f;
    public final int g;
    public final ta h;
    public final long i;
    public final long j;

    public hu(long j, be beVar, int i, ta taVar, long j2, be beVar2, int i2, ta taVar2, long j3, long j4) {
        this.a = j;
        this.f1084b = beVar;
        this.c = i;
        this.d = taVar;
        this.e = j2;
        this.f = beVar2;
        this.g = i2;
        this.h = taVar2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hu huVar = (hu) obj;
        return this.a == huVar.a && this.c == huVar.c && this.e == huVar.e && this.g == huVar.g && this.i == huVar.i && this.j == huVar.j && atc.o(this.f1084b, huVar.f1084b) && atc.o(this.d, huVar.d) && atc.o(this.f, huVar.f) && atc.o(this.h, huVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.f1084b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j)});
    }
}
