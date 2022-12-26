package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
/* loaded from: classes4.dex */
final class qw {
    private long a;

    /* renamed from: b  reason: collision with root package name */
    private long f1238b;
    private boolean c;

    private final long d(long j) {
        return this.a + Math.max(0L, ((this.f1238b - 529) * 1000000) / j);
    }

    public final long a(s sVar) {
        return d(sVar.z);
    }

    public final long b(s sVar, ee eeVar) {
        if (this.f1238b == 0) {
            this.a = eeVar.d;
        }
        if (this.c) {
            return eeVar.d;
        }
        ByteBuffer byteBuffer = eeVar.f1024b;
        af.s(byteBuffer);
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i = (i << 8) | (byteBuffer.get(i2) & 255);
        }
        int c = zn.c(i);
        if (c == -1) {
            this.c = true;
            this.f1238b = 0L;
            this.a = eeVar.d;
            cc.e("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return eeVar.d;
        }
        long d = d(sVar.z);
        this.f1238b += c;
        return d;
    }

    public final void c() {
        this.a = 0L;
        this.f1238b = 0L;
        this.c = false;
    }
}
