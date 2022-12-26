package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* loaded from: classes4.dex */
final class bcp implements bcr {
    @Override // com.google.ads.interactivemedia.v3.internal.bcr
    public final int a() {
        return 32;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bcr
    public final byte[] b() {
        return bdd.k;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bcr
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length != 32) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
        }
        return new bbn(bArr).c(bArr2, bArr3, bArr4);
    }
}
