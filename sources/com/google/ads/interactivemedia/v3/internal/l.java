package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class l {
    public final int a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final int f1145b;
    public final int c;

    public l(int i, int i2) {
        this.f1145b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            int i = lVar.a;
            return this.f1145b == lVar.f1145b && this.c == lVar.c;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f1145b + 16337) * 31) + this.c;
    }
}
