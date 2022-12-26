package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
/* loaded from: classes4.dex */
final class adp {
    private static final byte[] d = {0, 0, 1};
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public int f491b;
    public byte[] c = new byte[128];
    private boolean e;
    private int f;

    public final void a(byte[] bArr, int i, int i2) {
        if (this.e) {
            int i3 = i2 - i;
            byte[] bArr2 = this.c;
            int length = bArr2.length;
            int i4 = this.a + i3;
            if (length < i4) {
                this.c = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.c, this.a, i3);
            this.a += i3;
        }
    }

    public final void b() {
        this.e = false;
        this.a = 0;
        this.f = 0;
    }

    public final boolean c(int i, int i2) {
        int i3 = this.f;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i == 179 || i == 181) {
                            this.a -= i2;
                            this.e = false;
                            return true;
                        }
                    } else if ((i & 240) != 32) {
                        cc.e("H263Reader", "Unexpected start code value");
                        b();
                    } else {
                        this.f491b = this.a;
                        this.f = 4;
                    }
                } else if (i > 31) {
                    cc.e("H263Reader", "Unexpected start code value");
                    b();
                } else {
                    this.f = 3;
                }
            } else if (i != 181) {
                cc.e("H263Reader", "Unexpected start code value");
                b();
            } else {
                this.f = 2;
            }
        } else if (i == 176) {
            this.f = 1;
            this.e = true;
        }
        a(d, 0, 3);
        return false;
    }
}
