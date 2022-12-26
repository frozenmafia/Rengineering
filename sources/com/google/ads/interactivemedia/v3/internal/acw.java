package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class acw {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int f472b;
    public final long c;
    public final long d;
    public final long e;
    public final s f;
    public final int g;
    public final long[] h;
    public final long[] i;
    public final int j;
    private final acx[] k;

    public acw(int i, int i2, long j, long j2, long j3, s sVar, int i3, acx[] acxVarArr, int i4, long[] jArr, long[] jArr2) {
        this.a = i;
        this.f472b = i2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = sVar;
        this.g = i3;
        this.k = acxVarArr;
        this.j = i4;
        this.h = jArr;
        this.i = jArr2;
    }

    public final acx a(int i) {
        acx[] acxVarArr = this.k;
        if (acxVarArr == null) {
            return null;
        }
        return acxVarArr[i];
    }
}
