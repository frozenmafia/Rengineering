package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class bdf implements bcv {
    private final bcq a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bdf(bcq bcqVar) {
        this.a = bcqVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bcv
    public final bcw a(byte[] bArr) throws GeneralSecurityException {
        byte[] b2 = bic.b();
        byte[] a = bic.a(b2, bArr);
        byte[] c = bic.c(b2);
        byte[] y = bic.y(c, bArr);
        byte[] d = bdd.d(bdd.f800b);
        bcq bcqVar = this.a;
        return new bcw(bcqVar.e(a, y, d, bcqVar.a()), c);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bcv
    public final byte[] b() throws GeneralSecurityException {
        if (Arrays.equals(this.a.b(), bdd.f)) {
            return bdd.f800b;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
