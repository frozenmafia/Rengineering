package com.google.ads.interactivemedia.v3.internal;

import android.util.SparseArray;
import com.google.android.exoplayer2.C;
/* loaded from: classes4.dex */
final class adt {
    private final zz a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f496b;
    private final boolean c;
    private final zs f;
    private byte[] g;
    private int h;
    private int i;
    private long j;
    private boolean k;
    private long l;

    /* renamed from: o  reason: collision with root package name */
    private boolean f497o;
    private long p;
    private long q;
    private boolean r;
    private final SparseArray d = new SparseArray();
    private final SparseArray e = new SparseArray();
    private ads m = new ads(null);
    private ads n = new ads(null);

    public adt(zz zzVar, boolean z, boolean z2) {
        this.a = zzVar;
        this.f496b = z;
        this.c = z2;
        byte[] bArr = new byte[128];
        this.g = bArr;
        this.f = new zs(bArr, 0, 0);
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(byte[] r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.adt.a(byte[], int, int):void");
    }

    public final void b(zp zpVar) {
        this.e.append(zpVar.a, zpVar);
    }

    public final void c(zq zqVar) {
        this.d.append(zqVar.d, zqVar);
    }

    public final void d() {
        this.k = false;
        this.f497o = false;
        this.n.a();
    }

    public final void e(long j, int i, long j2) {
        this.i = i;
        this.l = j2;
        this.j = j;
        if (!this.f496b || i != 1) {
            if (!this.c) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        ads adsVar = this.m;
        this.m = this.n;
        this.n = adsVar;
        adsVar.a();
        this.h = 0;
        this.k = true;
    }

    public final boolean f(long j, int i, boolean z, boolean z2) {
        boolean z3 = false;
        if (this.i == 9 || (this.c && ads.d(this.n, this.m))) {
            if (z && this.f497o) {
                long j2 = this.j;
                int i2 = (int) (j - j2);
                long j3 = this.q;
                if (j3 != C.TIME_UNSET) {
                    this.a.f(j3, this.r ? 1 : 0, (int) (j2 - this.p), i + i2, null);
                }
            }
            this.p = this.j;
            this.q = this.l;
            this.r = false;
            this.f497o = true;
        }
        boolean e = this.f496b ? this.n.e() : z2;
        boolean z4 = this.r;
        int i3 = this.i;
        if (i3 == 5 || (e && i3 == 1)) {
            z3 = true;
        }
        boolean z5 = z4 | z3;
        this.r = z5;
        return z5;
    }

    public final boolean g() {
        return this.c;
    }
}
