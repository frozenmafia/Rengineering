package com.google.ads.interactivemedia.v3.internal;

import com.google.android.exoplayer2.C;
/* loaded from: classes4.dex */
final class adv {
    private final zz a;

    /* renamed from: b  reason: collision with root package name */
    private long f500b;
    private boolean c;
    private int d;
    private long e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private long k;
    private long l;
    private boolean m;

    public adv(zz zzVar) {
        this.a = zzVar;
    }

    private final void e(int i) {
        long j = this.l;
        if (j == C.TIME_UNSET) {
            return;
        }
        boolean z = this.m;
        long j2 = this.f500b;
        long j3 = this.k;
        this.a.f(j, z ? 1 : 0, (int) (j2 - j3), i, null);
    }

    public final void a(long j, int i, boolean z) {
        if (this.j && this.g) {
            this.m = this.c;
            this.j = false;
        } else if (this.h || this.g) {
            if (z && this.i) {
                e(i + ((int) (j - this.f500b)));
            }
            this.k = this.f500b;
            this.l = this.e;
            this.m = this.c;
            this.i = true;
        }
    }

    public final void b(byte[] bArr, int i, int i2) {
        if (this.f) {
            int i3 = this.d;
            int i4 = (i + 2) - i3;
            if (i4 >= i2) {
                this.d = i3 + (i2 - i);
                return;
            }
            this.g = (bArr[i4] & 128) != 0;
            this.f = false;
        }
    }

    public final void c() {
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
    }

    public final void d(long j, int i, int i2, long j2, boolean z) {
        boolean z2 = false;
        this.g = false;
        this.h = false;
        this.e = j2;
        this.d = 0;
        this.f500b = j;
        if (i2 >= 32 && i2 != 40) {
            if (this.i && !this.j) {
                if (z) {
                    e(i);
                }
                this.i = false;
            }
            if (i2 <= 35 || i2 == 39) {
                this.h = !this.j;
                this.j = true;
            }
        }
        boolean z3 = i2 >= 16 && i2 <= 21;
        this.c = z3;
        this.f = (z3 || i2 <= 9) ? true : true;
    }
}
