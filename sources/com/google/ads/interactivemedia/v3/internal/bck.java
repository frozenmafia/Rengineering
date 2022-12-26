package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
/* loaded from: classes4.dex */
final class bck implements azg {
    final azy a;

    public bck(azy azyVar) {
        this.a = azyVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azg
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        azy azyVar = this.a;
        if (azyVar.a() == null) {
            throw new GeneralSecurityException("keyset without primary key");
        }
        return bic.y(azyVar.a().c(), ((azg) this.a.a().b()).a(bArr, bArr2));
    }
}
