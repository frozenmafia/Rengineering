package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
/* loaded from: classes4.dex */
final class aea {
    public byte[] a;

    /* renamed from: b  reason: collision with root package name */
    public int f506b;
    private final int c;
    private boolean d;
    private boolean e;

    public aea(int i) {
        this.c = i;
        byte[] bArr = new byte[131];
        this.a = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (this.d) {
            int i3 = i2 - i;
            byte[] bArr2 = this.a;
            int length = bArr2.length;
            int i4 = this.f506b + i3;
            if (length < i4) {
                this.a = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.a, this.f506b, i3);
            this.f506b += i3;
        }
    }

    public final void b() {
        this.d = false;
        this.e = false;
    }

    public final void c(int i) {
        af.w(!this.d);
        boolean z = i == this.c;
        this.d = z;
        if (z) {
            this.f506b = 3;
            this.e = false;
        }
    }

    public final boolean d(int i) {
        if (this.d) {
            this.f506b -= i;
            this.d = false;
            this.e = true;
            return true;
        }
        return false;
    }

    public final boolean e() {
        return this.e;
    }
}
