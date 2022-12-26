package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* loaded from: classes4.dex */
abstract class bbm {
    int[] a;

    /* renamed from: b  reason: collision with root package name */
    private final int f788b;

    public bbm(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.a = bbi.d(bArr);
        this.f788b = i;
    }

    abstract int a();

    abstract int[] b(int[] iArr, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ByteBuffer c(byte[] bArr, int i) {
        int[] b2 = b(bbi.d(bArr), i);
        int[] iArr = (int[]) b2.clone();
        bbi.c(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            b2[i2] = b2[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b2, 0, 16);
        return order;
    }

    public final void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr2);
        if (bArr.length != a()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + a());
        }
        int remaining = wrap.remaining();
        int i = (remaining / 64) + 1;
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer c = c(bArr, this.f788b + i2);
            if (i2 == i - 1) {
                bic.w(byteBuffer, wrap, c, remaining % 64);
            } else {
                bic.w(byteBuffer, wrap, c, 64);
            }
        }
    }
}
