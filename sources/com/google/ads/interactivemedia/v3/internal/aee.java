package com.google.ads.interactivemedia.v3.internal;

import androidx.core.view.InputDeviceCompat;
/* loaded from: classes4.dex */
public final class aee implements aep {
    private final aed a;

    /* renamed from: b  reason: collision with root package name */
    private final ci f509b = new ci(32);
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    public aee(aed aedVar) {
        this.a = aedVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aep
    public final void a(ci ciVar, int i) {
        int i2 = i & 1;
        int c = i2 != 0 ? ciVar.c() + ciVar.i() : -1;
        if (this.f) {
            if (i2 == 0) {
                return;
            }
            this.f = false;
            ciVar.F(c);
            this.d = 0;
        }
        while (ciVar.a() > 0) {
            int i3 = this.d;
            if (i3 < 3) {
                if (i3 == 0) {
                    int i4 = ciVar.i();
                    ciVar.F(ciVar.c() - 1);
                    if (i4 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(ciVar.a(), 3 - this.d);
                ciVar.A(this.f509b.H(), this.d, min);
                int i5 = this.d + min;
                this.d = i5;
                if (i5 == 3) {
                    this.f509b.F(0);
                    this.f509b.E(3);
                    this.f509b.G(1);
                    int i6 = this.f509b.i();
                    int i7 = this.f509b.i();
                    this.e = (i6 & 128) != 0;
                    this.c = (((i6 & 15) << 8) | i7) + 3;
                    int b2 = this.f509b.b();
                    int i8 = this.c;
                    if (b2 < i8) {
                        int b3 = this.f509b.b();
                        this.f509b.y(Math.min((int) InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i8, b3 + b3)));
                    }
                }
            } else {
                int min2 = Math.min(ciVar.a(), this.c - i3);
                ciVar.A(this.f509b.H(), this.d, min2);
                int i9 = this.d + min2;
                this.d = i9;
                int i10 = this.c;
                if (i9 != i10) {
                    continue;
                } else {
                    if (this.e) {
                        if (cp.ar(this.f509b.H(), i10) != 0) {
                            this.f = true;
                            return;
                        }
                        this.f509b.E(this.c - 4);
                    } else {
                        this.f509b.E(i10);
                    }
                    this.f509b.F(0);
                    this.a.a(this.f509b);
                    this.d = 0;
                }
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aep
    public final void b(cn cnVar, zf zfVar, aeo aeoVar) {
        this.a.b(cnVar, zfVar, aeoVar);
        this.f = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aep
    public final void c() {
        this.f = true;
    }
}
