package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* loaded from: classes4.dex */
abstract class bbo {
    public static final int a = bbt.a;

    /* renamed from: b  reason: collision with root package name */
    private final bbm f789b;
    private final bbm c;

    public bbo(byte[] bArr) throws GeneralSecurityException {
        if (!bbt.a(a)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f789b = a(bArr, 1);
        this.c = a(bArr, 0);
    }

    abstract bbm a(byte[] bArr, int i) throws InvalidKeyException;

    public final void b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int position = byteBuffer.position();
        this.f789b.d(byteBuffer, bArr, bArr2);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        byte[] bArr4 = new byte[32];
        this.c.c(bArr, 0).get(bArr4);
        int remaining = byteBuffer.remaining();
        int i = remaining % 16;
        int i2 = i == 0 ? remaining : (remaining + 16) - i;
        ByteBuffer order = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr3);
        order.position(0);
        order.put(byteBuffer);
        order.position(i2);
        order.putLong(0L);
        order.putLong(remaining);
        byte[] e = axl.e(bArr4, order.array());
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(e);
    }

    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        int length = bArr2.length;
        if (length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer allocate = ByteBuffer.allocate(length + 16);
        b(allocate, bArr, bArr2, bArr3);
        return allocate.array();
    }
}
