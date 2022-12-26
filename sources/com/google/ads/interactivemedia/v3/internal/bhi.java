package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
/* loaded from: classes4.dex */
public final class bhi implements azb {
    public static final int a = bbt.f791b;

    /* renamed from: b  reason: collision with root package name */
    private final bbk f833b;

    public bhi(byte[] bArr) throws GeneralSecurityException {
        if (!bbt.a(a)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f833b = new bbk(bArr, true);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azb
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.f833b.a(bia.b(12), bArr);
    }
}
