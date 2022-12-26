package com.google.ads.interactivemedia.v3.internal;

import androidx.core.view.MotionEventCompat;
/* loaded from: classes4.dex */
public final class ch {
    public byte[] a;

    /* renamed from: b  reason: collision with root package name */
    private int f997b;
    private int c;
    private int d;

    public ch() {
        this.a = cp.f;
    }

    private final void n() {
        int i;
        int i2 = this.f997b;
        af.w(i2 >= 0 && (i2 < (i = this.d) || (i2 == i && this.c == 0)));
    }

    public final int a() {
        return ((this.d - this.f997b) * 8) - this.c;
    }

    public final int b() {
        return (this.f997b * 8) + this.c;
    }

    public final int c(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.c += i;
        int i3 = 0;
        while (true) {
            i2 = this.c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.c = i4;
            byte[] bArr = this.a;
            int i5 = this.f997b;
            this.f997b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.a;
        int i6 = this.f997b;
        byte b2 = bArr2[i6];
        if (i2 == 8) {
            this.c = 0;
            this.f997b = i6 + 1;
        }
        n();
        return ((-1) >>> (32 - i)) & (((b2 & 255) >> (8 - i2)) | i3);
    }

    public final void d() {
        if (this.c == 0) {
            return;
        }
        this.c = 0;
        this.f997b++;
        n();
    }

    public final void e(byte[] bArr) {
        f(bArr, bArr.length);
    }

    public final void f(byte[] bArr, int i) {
        this.a = bArr;
        this.f997b = 0;
        this.c = 0;
        this.d = i;
    }

    public final void g(int i) {
        int i2 = i / 8;
        this.f997b = i2;
        this.c = i - (i2 * 8);
        n();
    }

    public final void h() {
        int i = this.c + 1;
        this.c = i;
        if (i == 8) {
            this.c = 0;
            this.f997b++;
        }
        n();
    }

    public final void i(int i) {
        int i2 = i / 8;
        int i3 = this.f997b + i2;
        this.f997b = i3;
        int i4 = this.c + (i - (i2 * 8));
        this.c = i4;
        if (i4 > 7) {
            this.f997b = i3 + 1;
            this.c = i4 - 8;
        }
        n();
    }

    public final void j(int i) {
        af.w(this.c == 0);
        this.f997b += i;
        n();
    }

    public final boolean k() {
        boolean z = (this.a[this.f997b] & (128 >> this.c)) != 0;
        h();
        return z;
    }

    public final void l(int i) {
        int i2 = i & 16383;
        int min = Math.min(8 - this.c, 14);
        int i3 = this.c;
        int i4 = (8 - i3) - min;
        byte[] bArr = this.a;
        int i5 = this.f997b;
        byte b2 = (byte) (((MotionEventCompat.ACTION_POINTER_INDEX_MASK >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        bArr[i5] = b2;
        int i6 = 14 - min;
        bArr[i5] = (byte) (b2 | ((i2 >>> i6) << i4));
        int i7 = i5 + 1;
        while (i6 > 8) {
            i6 -= 8;
            this.a[i7] = (byte) (i2 >>> i6);
            i7++;
        }
        int i8 = 8 - i6;
        byte[] bArr2 = this.a;
        byte b3 = (byte) (bArr2[i7] & ((1 << i8) - 1));
        bArr2[i7] = b3;
        bArr2[i7] = (byte) (((i2 & ((1 << i6) - 1)) << i8) | b3);
        i(14);
        n();
    }

    public final void m(byte[] bArr, int i) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.a;
            int i4 = this.f997b;
            int i5 = i4 + 1;
            this.f997b = i5;
            byte b2 = bArr2[i4];
            int i6 = this.c;
            byte b3 = (byte) (b2 << i6);
            bArr[i3] = b3;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b3);
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return;
        }
        byte b4 = (byte) (bArr[i2] & (255 >> i7));
        bArr[i2] = b4;
        int i8 = this.c;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.a;
            int i9 = this.f997b;
            this.f997b = i9 + 1;
            b4 = (byte) (b4 | ((bArr3[i9] & 255) << i8));
            bArr[i2] = b4;
            i8 -= 8;
        }
        int i10 = i8 + i7;
        this.c = i10;
        byte[] bArr4 = this.a;
        int i11 = this.f997b;
        bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | b4);
        if (i10 == 8) {
            this.c = 0;
            this.f997b = i11 + 1;
        }
        n();
    }

    public ch(byte[] bArr) {
        int length = bArr.length;
        this.a = bArr;
        this.d = length;
    }
}
