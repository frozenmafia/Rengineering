package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* loaded from: classes4.dex */
public final class bbn extends bbo {
    public bbn(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bbo
    final bbm a(byte[] bArr, int i) throws InvalidKeyException {
        return new bbl(bArr, i);
    }
}
