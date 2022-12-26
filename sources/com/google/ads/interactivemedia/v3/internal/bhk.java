package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* loaded from: classes4.dex */
public final class bhk implements azb {
    private final bbn a;

    public bhk(byte[] bArr) throws GeneralSecurityException {
        this.a = new bbn(bArr);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azb
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] b2 = bia.b(12);
        allocate.put(b2);
        this.a.b(allocate, b2, bArr, bArr2);
        return allocate.array();
    }
}
