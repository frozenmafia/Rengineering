package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
/* loaded from: classes4.dex */
final class bae implements azb {
    private final azy a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ bae(azy azyVar) {
        this.a = azyVar;
        if (azyVar.e()) {
            beu b2 = bdp.a().b();
            bdn.a(azyVar);
            b2.a();
            b2.a();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azb
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            byte[] y = bic.y(this.a.a().c(), ((azb) this.a.a().b()).a(bArr, bArr2));
            this.a.a().a();
            int length = bArr.length;
            return y;
        } catch (GeneralSecurityException e) {
            throw e;
        }
    }
}
