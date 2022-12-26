package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* loaded from: classes4.dex */
final class bco implements bcr {
    private final int a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bco(int i) throws InvalidAlgorithmParameterException {
        if (i == 16 || i == 32) {
            this.a = i;
            return;
        }
        throw new InvalidAlgorithmParameterException("Unsupported key length: " + i);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bcr
    public final int a() {
        return this.a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bcr
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        int length = bArr.length;
        if (length != this.a) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: " + length);
        }
        return new bbk(bArr, false).a(bArr2, bArr3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bcr
    public final byte[] b() throws GeneralSecurityException {
        int i = this.a;
        if (i != 16) {
            if (i == 32) {
                return bdd.j;
            }
            throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
        }
        return bdd.i;
    }
}
