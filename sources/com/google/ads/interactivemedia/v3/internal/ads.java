package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
final class ads {
    private boolean a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f494b;
    private zq c;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private int n;

    /* renamed from: o  reason: collision with root package name */
    private int f495o;
    private int p;

    private ads() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ads(byte[] bArr) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean d(ads adsVar, ads adsVar2) {
        int i;
        int i2;
        int i3;
        boolean z;
        if (adsVar.a) {
            if (adsVar2.a) {
                zq zqVar = adsVar.c;
                af.t(zqVar);
                zq zqVar2 = adsVar2.c;
                af.t(zqVar2);
                return (adsVar.f == adsVar2.f && adsVar.g == adsVar2.g && adsVar.h == adsVar2.h && (!adsVar.i || !adsVar2.i || adsVar.j == adsVar2.j) && (((i = adsVar.d) == (i2 = adsVar2.d) || (i != 0 && i2 != 0)) && ((i3 = zqVar.k) != 0 ? !(i3 == 1 && zqVar2.k == 1 && (adsVar.f495o != adsVar2.f495o || adsVar.p != adsVar2.p)) : zqVar2.k != 0 || (adsVar.m == adsVar2.m && adsVar.n == adsVar2.n)) && (z = adsVar.k) == adsVar2.k && (!z || adsVar.l == adsVar2.l))) ? false : true;
            }
            return true;
        }
        return false;
    }

    public final void a() {
        this.f494b = false;
        this.a = false;
    }

    public final void b(zq zqVar, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
        this.c = zqVar;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = i5;
        this.m = i6;
        this.n = i7;
        this.f495o = i8;
        this.p = i9;
        this.a = true;
        this.f494b = true;
    }

    public final void c(int i) {
        this.e = i;
        this.f494b = true;
    }

    public final boolean e() {
        int i;
        return this.f494b && ((i = this.e) == 7 || i == 2);
    }
}
