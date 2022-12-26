package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCodec;
/* loaded from: classes4.dex */
public final class eb {
    public byte[] a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f1023b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    private final MediaCodec.CryptoInfo i;
    private final ea j;

    public eb() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        this.j = cp.a >= 24 ? new ea(cryptoInfo) : null;
    }

    public final MediaCodec.CryptoInfo a() {
        return this.i;
    }

    public final void b(int i) {
        if (i == 0) {
            return;
        }
        if (this.d == null) {
            int[] iArr = new int[1];
            this.d = iArr;
            this.i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.d;
        iArr2[0] = iArr2[0] + i;
    }

    public final void c(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f = i;
        this.d = iArr;
        this.e = iArr2;
        this.f1023b = bArr;
        this.a = bArr2;
        this.c = i2;
        this.g = i3;
        this.h = i4;
        this.i.numSubSamples = i;
        this.i.numBytesOfClearData = iArr;
        this.i.numBytesOfEncryptedData = iArr2;
        this.i.key = bArr;
        this.i.iv = bArr2;
        this.i.mode = i2;
        if (cp.a >= 24) {
            ea eaVar = this.j;
            af.s(eaVar);
            ea.a(eaVar, i3, i4);
        }
    }
}
