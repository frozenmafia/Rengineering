package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bng {
    private final byte[] a = new byte[256];

    /* renamed from: b  reason: collision with root package name */
    private int f900b;
    private int c;

    public bng(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.a[i] = (byte) i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            byte[] bArr2 = this.a;
            byte b2 = bArr2[i3];
            i2 = (i2 + b2 + bArr[i3 % bArr.length]) & 255;
            bArr2[i3] = bArr2[i2];
            bArr2[i2] = b2;
        }
        this.f900b = 0;
        this.c = 0;
    }

    public final void a(byte[] bArr) {
        int i = this.f900b;
        int i2 = this.c;
        for (int i3 = 0; i3 < 256; i3++) {
            i = (i + 1) & 255;
            byte[] bArr2 = this.a;
            byte b2 = bArr2[i];
            i2 = (i2 + b2) & 255;
            bArr2[i] = bArr2[i2];
            bArr2[i2] = b2;
            bArr[i3] = (byte) (bArr2[(bArr2[i] + b2) & 255] ^ bArr[i3]);
        }
        this.f900b = i;
        this.c = i2;
    }
}
