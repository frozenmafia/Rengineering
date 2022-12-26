package com.google.ads.interactivemedia.v3.internal;

import java.nio.charset.Charset;
import java.util.Arrays;
/* loaded from: classes4.dex */
public final class ci {
    private byte[] a;

    /* renamed from: b  reason: collision with root package name */
    private int f998b;
    private int c;

    public ci() {
        this.a = cp.f;
    }

    public ci(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }

    public final void A(byte[] bArr, int i, int i2) {
        System.arraycopy(this.a, this.f998b, bArr, i, i2);
        this.f998b += i2;
    }

    public final void B(int i) {
        D(b() < i ? new byte[i] : this.a, i);
    }

    public final void C(byte[] bArr) {
        D(bArr, bArr.length);
    }

    public final void D(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
        this.f998b = 0;
    }

    public final void E(int i) {
        af.u(i >= 0 && i <= this.a.length);
        this.c = i;
    }

    public final void F(int i) {
        af.u(i >= 0 && i <= this.c);
        this.f998b = i;
    }

    public final void G(int i) {
        F(this.f998b + i);
    }

    public final byte[] H() {
        return this.a;
    }

    public final int a() {
        return this.c - this.f998b;
    }

    public final int b() {
        return this.a.length;
    }

    public final int c() {
        return this.f998b;
    }

    public final int d() {
        return this.c;
    }

    public final int e() {
        byte[] bArr = this.a;
        int i = this.f998b;
        int i2 = i + 1;
        this.f998b = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.f998b = i3;
        byte b3 = bArr[i2];
        int i4 = i3 + 1;
        this.f998b = i4;
        byte b4 = bArr[i3];
        this.f998b = i4 + 1;
        return (bArr[i4] & 255) | ((b2 & 255) << 24) | ((b3 & 255) << 16) | ((b4 & 255) << 8);
    }

    public final int f() {
        byte[] bArr = this.a;
        int i = this.f998b;
        int i2 = i + 1;
        this.f998b = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.f998b = i3;
        byte b3 = bArr[i2];
        int i4 = i3 + 1;
        this.f998b = i4;
        byte b4 = bArr[i3];
        this.f998b = i4 + 1;
        return ((bArr[i4] & 255) << 24) | (b2 & 255) | ((b3 & 255) << 8) | ((b4 & 255) << 16);
    }

    public final int g() {
        byte[] bArr = this.a;
        int i = this.f998b;
        int i2 = i + 1;
        this.f998b = i2;
        byte b2 = bArr[i];
        this.f998b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (b2 & 255);
    }

    public final int h() {
        return (i() << 21) | (i() << 14) | (i() << 7) | i();
    }

    public final int i() {
        byte[] bArr = this.a;
        int i = this.f998b;
        this.f998b = i + 1;
        return bArr[i] & 255;
    }

    public final int j() {
        byte[] bArr = this.a;
        int i = this.f998b;
        int i2 = i + 1;
        this.f998b = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.f998b = i3;
        byte b3 = bArr[i2];
        this.f998b = i3 + 2;
        return (b3 & 255) | ((b2 & 255) << 8);
    }

    public final int k() {
        byte[] bArr = this.a;
        int i = this.f998b;
        int i2 = i + 1;
        this.f998b = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.f998b = i3;
        byte b3 = bArr[i2];
        this.f998b = i3 + 1;
        return (bArr[i3] & 255) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
    }

    public final int l() {
        int e = e();
        if (e >= 0) {
            return e;
        }
        throw new IllegalStateException("Top bit not zero: " + e);
    }

    public final int m() {
        byte[] bArr = this.a;
        int i = this.f998b;
        int i2 = i + 1;
        this.f998b = i2;
        byte b2 = bArr[i];
        this.f998b = i2 + 1;
        return (bArr[i2] & 255) | ((b2 & 255) << 8);
    }

    public final long n() {
        byte[] bArr = this.a;
        int i = this.f998b;
        int i2 = i + 1;
        this.f998b = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.f998b = i3;
        byte b3 = bArr[i2];
        int i4 = i3 + 1;
        this.f998b = i4;
        byte b4 = bArr[i3];
        this.f998b = i4 + 1;
        return ((b3 & 255) << 8) | (b2 & 255) | ((b4 & 255) << 16) | ((bArr[i4] & 255) << 24);
    }

    public final long o() {
        byte[] bArr = this.a;
        int i = this.f998b;
        int i2 = i + 1;
        this.f998b = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.f998b = i3;
        byte b3 = bArr[i2];
        int i4 = i3 + 1;
        this.f998b = i4;
        byte b4 = bArr[i3];
        int i5 = i4 + 1;
        this.f998b = i5;
        byte b5 = bArr[i4];
        int i6 = i5 + 1;
        this.f998b = i6;
        byte b6 = bArr[i5];
        int i7 = i6 + 1;
        this.f998b = i7;
        byte b7 = bArr[i6];
        int i8 = i7 + 1;
        this.f998b = i8;
        byte b8 = bArr[i7];
        this.f998b = i8 + 1;
        return ((b3 & 255) << 48) | ((b2 & 255) << 56) | ((b4 & 255) << 40) | ((b5 & 255) << 32) | ((b6 & 255) << 24) | ((b7 & 255) << 16) | ((b8 & 255) << 8) | (bArr[i8] & 255);
    }

    public final long p() {
        byte[] bArr = this.a;
        int i = this.f998b;
        int i2 = i + 1;
        this.f998b = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.f998b = i3;
        byte b3 = bArr[i2];
        int i4 = i3 + 1;
        this.f998b = i4;
        byte b4 = bArr[i3];
        this.f998b = i4 + 1;
        return ((b3 & 255) << 16) | ((b2 & 255) << 24) | ((b4 & 255) << 8) | (bArr[i4] & 255);
    }

    public final long q() {
        long o2 = o();
        if (o2 >= 0) {
            return o2;
        }
        throw new IllegalStateException("Top bit not zero: " + o2);
    }

    public final String r() {
        if (a() == 0) {
            return null;
        }
        int i = this.f998b;
        while (i < this.c && !cp.Z(this.a[i])) {
            i++;
        }
        int i2 = this.f998b;
        if (i - i2 >= 3) {
            byte[] bArr = this.a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                i2 += 3;
                this.f998b = i2;
            }
        }
        String J = cp.J(this.a, i2, i - i2);
        this.f998b = i;
        int i3 = this.c;
        if (i == i3) {
            return J;
        }
        byte[] bArr2 = this.a;
        if (bArr2[i] == 13) {
            i++;
            this.f998b = i;
            if (i == i3) {
                return J;
            }
        }
        if (bArr2[i] == 10) {
            this.f998b = i + 1;
        }
        return J;
    }

    public final String s() {
        if (a() == 0) {
            return null;
        }
        int i = this.f998b;
        while (i < this.c && this.a[i] != 0) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.f998b;
        String J = cp.J(bArr, i2, i - i2);
        this.f998b = i;
        if (i >= this.c) {
            return J;
        }
        this.f998b = i + 1;
        return J;
    }

    public final String t(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f998b;
        int i3 = (i2 + i) - 1;
        String J = cp.J(this.a, i2, (i3 >= this.c || this.a[i3] != 0) ? i : i - 1);
        this.f998b += i;
        return J;
    }

    public final String u(int i) {
        return v(i, asu.f704b);
    }

    public final String v(int i, Charset charset) {
        byte[] bArr = this.a;
        int i2 = this.f998b;
        String str = new String(bArr, i2, i, charset);
        this.f998b = i2 + i;
        return str;
    }

    public final short w() {
        byte[] bArr = this.a;
        int i = this.f998b;
        int i2 = i + 1;
        this.f998b = i2;
        byte b2 = bArr[i];
        this.f998b = i2 + 1;
        return (short) (((bArr[i2] & 255) << 8) | (b2 & 255));
    }

    public final short x() {
        byte[] bArr = this.a;
        int i = this.f998b;
        int i2 = i + 1;
        this.f998b = i2;
        byte b2 = bArr[i];
        this.f998b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((b2 & 255) << 8));
    }

    public final void y(int i) {
        if (i > b()) {
            this.a = Arrays.copyOf(this.a, i);
        }
    }

    public final void z(ch chVar, int i) {
        A(chVar.a, 0, i);
        chVar.g(0);
    }

    public ci(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public ci(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }
}
