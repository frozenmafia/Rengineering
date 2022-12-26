package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;
/* loaded from: classes4.dex */
public final class bho implements azg {
    private static final byte[] a = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    private final String f836b;
    private final byte[] c;
    private final bhm d;
    private final int e;
    private final om f;

    public bho(ECPublicKey eCPublicKey, byte[] bArr, String str, int i, bhm bhmVar) throws GeneralSecurityException {
        bic.m(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f = new om(eCPublicKey);
        this.c = bArr;
        this.f836b = str;
        this.e = i;
        this.d = bhmVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azg
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        bdi h = this.f.h(this.f836b, this.c, bArr2, this.d.a(), this.e);
        byte[] d = this.d.b(h.e()).d(bArr, a);
        byte[] d2 = h.d();
        return ByteBuffer.allocate(d2.length + d.length).put(d2).put(d).array();
    }
}
