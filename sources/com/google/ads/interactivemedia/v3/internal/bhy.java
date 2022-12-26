package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* loaded from: classes4.dex */
public final class bhy implements azs {
    private final bey a;

    /* renamed from: b  reason: collision with root package name */
    private final int f842b;

    public bhy(bey beyVar, int i) throws GeneralSecurityException {
        this.a = beyVar;
        this.f842b = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        beyVar.a(new byte[0], i);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azs
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        return this.a.a(bArr, this.f842b);
    }
}
