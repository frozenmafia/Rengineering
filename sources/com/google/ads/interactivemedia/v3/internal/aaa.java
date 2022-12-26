package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
/* loaded from: classes4.dex */
public final class aaa {
    private final byte[] a = new byte[10];

    /* renamed from: b  reason: collision with root package name */
    private boolean f419b;
    private int c;
    private long d;
    private int e;
    private int f;
    private int g;

    public final void a(zz zzVar, zy zyVar) {
        if (this.c > 0) {
            zzVar.f(this.d, this.e, this.f, this.g, zyVar);
            this.c = 0;
        }
    }

    public final void b() {
        this.f419b = false;
        this.c = 0;
    }

    public final void c(zz zzVar, long j, int i, int i2, int i3, zy zyVar) {
        af.x(this.g <= i2 + i3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f419b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(zzVar, zyVar);
            }
        }
    }

    public final void d(zd zdVar) throws IOException {
        if (this.f419b) {
            return;
        }
        zdVar.f(this.a, 0, 10);
        zdVar.h();
        byte[] bArr = this.a;
        int i = yj.a;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.f419b = true;
        }
    }
}
