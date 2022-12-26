package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
/* loaded from: classes4.dex */
final class bpu extends InputStream {
    private Iterator a;

    /* renamed from: b  reason: collision with root package name */
    private ByteBuffer f935b;
    private int c = 0;
    private int d;
    private int e;
    private boolean f;
    private byte[] g;
    private int h;
    private long i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bpu(Iterable iterable) {
        this.a = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            this.c++;
        }
        this.d = -1;
        if (b()) {
            return;
        }
        this.f935b = bpr.c;
        this.d = 0;
        this.e = 0;
        this.i = 0L;
    }

    private final void a(int i) {
        int i2 = this.e + i;
        this.e = i2;
        if (i2 == this.f935b.limit()) {
            b();
        }
    }

    private final boolean b() {
        this.d++;
        if (this.a.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) this.a.next();
            this.f935b = byteBuffer;
            this.e = byteBuffer.position();
            if (this.f935b.hasArray()) {
                this.f = true;
                this.g = this.f935b.array();
                this.h = this.f935b.arrayOffset();
            } else {
                this.f = false;
                this.i = bsb.e(this.f935b);
                this.g = null;
            }
            return true;
        }
        return false;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte a;
        if (this.d == this.c) {
            return -1;
        }
        if (this.f) {
            a = this.g[this.e + this.h];
            a(1);
        } else {
            a = bsb.a(this.e + this.i);
            a(1);
        }
        return a & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.d == this.c) {
            return -1;
        }
        int limit = this.f935b.limit();
        int i3 = this.e;
        int i4 = limit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f) {
            System.arraycopy(this.g, i3 + this.h, bArr, i, i2);
            a(i2);
        } else {
            int position = this.f935b.position();
            ByteBuffer byteBuffer = (ByteBuffer) this.f935b.position(this.e);
            this.f935b.get(bArr, i, i2);
            ByteBuffer byteBuffer2 = (ByteBuffer) this.f935b.position(position);
            a(i2);
        }
        return i2;
    }
}
