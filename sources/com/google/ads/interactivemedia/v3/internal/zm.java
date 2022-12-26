package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class zm {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public String f1380b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public final boolean a(int i) {
        boolean m;
        int i2;
        int i3;
        int i4;
        int i5;
        String[] strArr;
        int[] iArr;
        int l;
        int[] iArr2;
        int[] iArr3;
        int i6;
        int[] iArr4;
        int[] iArr5;
        int i7;
        int[] iArr6;
        m = zn.m(i);
        if (!m || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.a = i2;
        strArr = zn.a;
        this.f1380b = strArr[3 - i3];
        iArr = zn.f1381b;
        int i8 = iArr[i5];
        this.d = i8;
        if (i2 == 2) {
            i8 /= 2;
            this.d = i8;
        } else if (i2 == 0) {
            i8 /= 4;
            this.d = i8;
        }
        int i9 = (i >>> 9) & 1;
        l = zn.l(i2, i3);
        this.g = l;
        if (i3 == 3) {
            if (i2 == 3) {
                iArr6 = zn.c;
                i7 = iArr6[i4 - 1];
            } else {
                iArr5 = zn.d;
                i7 = iArr5[i4 - 1];
            }
            this.f = i7;
            this.c = (((i7 * 12) / i8) + i9) * 4;
        } else {
            if (i2 == 3) {
                if (i3 == 2) {
                    iArr4 = zn.e;
                    i6 = iArr4[i4 - 1];
                } else {
                    iArr3 = zn.f;
                    i6 = iArr3[i4 - 1];
                }
                this.f = i6;
                this.c = ((i6 * 144) / i8) + i9;
            } else {
                iArr2 = zn.g;
                int i10 = iArr2[i4 - 1];
                this.f = i10;
                this.c = (((i3 == 1 ? 72 : 144) * i10) / i8) + i9;
            }
        }
        this.e = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
