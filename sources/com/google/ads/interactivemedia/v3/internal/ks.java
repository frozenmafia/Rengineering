package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
final class ks {
    public final int[] a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1139b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    private ks(int i, int i2, int[] iArr, int i3, int i4, int i5, int i6) {
        this.f1139b = i;
        this.a = iArr;
        this.c = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.d = i6;
    }

    public static ks a(int[] iArr, int i) {
        return new ks(3, 1, iArr, i, -1, -1, -1);
    }

    public static ks b(int[] iArr, int i) {
        return new ks(5, 1, iArr, i, -1, -1, -1);
    }

    public static ks c(int i) {
        return new ks(5, 2, new int[0], -1, -1, -1, i);
    }

    public static ks d(int i, int[] iArr, int i2, int i3, int i4) {
        return new ks(i, 0, iArr, i2, i3, i4, -1);
    }
}
