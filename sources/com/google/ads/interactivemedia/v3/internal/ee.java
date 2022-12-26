package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
/* loaded from: classes4.dex */
public class ee extends dy {
    public final eb a;

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f1024b;
    public boolean c;
    public long d;
    public ByteBuffer e;
    private final int f;

    static {
        aj.b("media3.decoder");
    }

    public ee(int i) {
        this.a = new eb();
        this.f = i;
    }

    private final ByteBuffer l(int i) {
        int i2 = this.f;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f1024b;
        throw new ed(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.dy
    public void b() {
        super.b();
        ByteBuffer byteBuffer = this.f1024b;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.e;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.c = false;
    }

    public final void i(int i) {
        ByteBuffer byteBuffer = this.f1024b;
        if (byteBuffer == null) {
            this.f1024b = l(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.f1024b = byteBuffer;
            return;
        }
        ByteBuffer l = l(i2);
        l.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            l.put(byteBuffer);
        }
        this.f1024b = l;
    }

    public final void j() {
        ByteBuffer byteBuffer = this.f1024b;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.e;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean k() {
        return d(1073741824);
    }

    public ee() {
        this(1);
    }
}
