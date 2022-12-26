package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class wp {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1332b;
    public final int c;
    public final int d;

    public wp(int i, int i2, int i3, int i4) {
        this.a = i;
        this.f1332b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean a(int i) {
        return i == 1 ? this.a - this.f1332b > 1 : this.c - this.d > 1;
    }
}
