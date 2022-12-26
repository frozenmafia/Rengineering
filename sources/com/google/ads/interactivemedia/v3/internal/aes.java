package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* loaded from: classes4.dex */
final class aes implements aet {
    private final ByteBuffer a;

    public aes(ByteBuffer byteBuffer) {
        this.a = byteBuffer.slice();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aet
    public final long a() {
        return this.a.capacity();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aet
    public final void b(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        ByteBuffer slice;
        synchronized (this.a) {
            int i2 = (int) j;
            this.a.position(i2);
            this.a.limit(i2 + i);
            slice = this.a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }
}
