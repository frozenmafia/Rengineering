package com.google.ads.interactivemedia.v3.internal;

import java.security.InvalidKeyException;
import java.util.Arrays;
/* loaded from: classes4.dex */
public final class bbp extends bbm {
    public bbp(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bbm
    final int a() {
        return 24;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bbm
    final int[] b(int[] iArr, int i) {
        int length = iArr.length;
        if (length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        bbi.b(r0, this.a);
        int[] iArr3 = {0, 0, 0, 0, iArr3[12], iArr3[13], iArr3[14], iArr3[15], 0, 0, 0, 0, iArr[0], iArr[1], iArr[2], iArr[3]};
        bbi.c(iArr3);
        bbi.b(iArr2, Arrays.copyOf(iArr3, 8));
        iArr2[12] = i;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }
}
