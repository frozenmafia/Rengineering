package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* loaded from: classes4.dex */
public final class bhp implements azb {
    private final bhu a;

    /* renamed from: b  reason: collision with root package name */
    private final azs f837b;

    public bhp(bhu bhuVar, azs azsVar) {
        this.a = bhuVar;
        this.f837b = azsVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azb
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] a = this.a.a(bArr);
        return bic.y(a, this.f837b.a(bic.y(bArr2, a, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8))));
    }
}
