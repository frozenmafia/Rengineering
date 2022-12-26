package com.google.ads.interactivemedia.v3.internal;

import java.security.InvalidKeyException;
/* loaded from: classes4.dex */
public final class bbl extends bbm {
    public bbl(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bbm
    public final int a() {
        return 12;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bbm
    public final int[] b(int[] iArr, int i) {
        int length = iArr.length;
        if (length == 3) {
            int[] iArr2 = new int[16];
            bbi.b(iArr2, this.a);
            iArr2[12] = i;
            System.arraycopy(iArr, 0, iArr2, 13, 3);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
    }
}
