package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* loaded from: classes4.dex */
public final class bbb implements azb {
    private static final byte[] a = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    private final bgo f786b;
    private final azb c;

    public bbb(bgo bgoVar, azb azbVar) {
        this.f786b = bgoVar;
        this.c = azbVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azb
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] aw = bab.c(this.f786b).aw();
        byte[] a2 = this.c.a(aw, a);
        byte[] a3 = ((azb) bab.h(this.f786b.d(), aw, azb.class)).a(bArr, bArr2);
        int length = a2.length;
        return ByteBuffer.allocate(length + 4 + a3.length).putInt(length).put(a2).put(a3).array();
    }
}
