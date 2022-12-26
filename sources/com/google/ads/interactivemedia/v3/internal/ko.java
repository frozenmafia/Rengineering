package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ko extends jt {
    private int d;
    private int e;
    private boolean f;
    private int g;
    private byte[] h = cp.f;
    private int i;
    private long j;

    @Override // com.google.ads.interactivemedia.v3.internal.jt, com.google.ads.interactivemedia.v3.internal.ja
    public final ByteBuffer b() {
        int i;
        if (super.h() && (i = this.i) > 0) {
            j(i).put(this.h, 0, this.i).flip();
            this.i = 0;
        }
        return super.b();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ja
    public final void e(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.g);
        this.j += min / this.f1124b.e;
        this.g -= min;
        byteBuffer.position(position + min);
        if (this.g > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.i + i2) - this.h.length;
        ByteBuffer j = j(length);
        int d = cp.d(length, 0, this.i);
        j.put(this.h, 0, d);
        int d2 = cp.d(length - d, 0, i2);
        byteBuffer.limit(byteBuffer.position() + d2);
        j.put(byteBuffer);
        byteBuffer.limit(limit);
        int i3 = i2 - d2;
        int i4 = this.i - d;
        this.i = i4;
        byte[] bArr = this.h;
        System.arraycopy(bArr, d, bArr, 0, i4);
        byteBuffer.get(this.h, this.i, i3);
        this.i += i3;
        j.flip();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jt, com.google.ads.interactivemedia.v3.internal.ja
    public final boolean h() {
        return super.h() && this.i == 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jt
    public final iy i(iy iyVar) throws iz {
        if (iyVar.d == 2) {
            this.f = true;
            return (this.d == 0 && this.e == 0) ? iy.a : iyVar;
        }
        throw new iz(iyVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jt
    protected final void k() {
        if (this.f) {
            this.f = false;
            int i = this.e;
            int i2 = this.f1124b.e;
            this.h = new byte[i * i2];
            this.g = this.d * i2;
        }
        this.i = 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jt
    protected final void l() {
        int i;
        if (this.f) {
            if (this.i > 0) {
                this.j += i / this.f1124b.e;
            }
            this.i = 0;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jt
    protected final void m() {
        this.h = cp.f;
    }

    public final long o() {
        return this.j;
    }

    public final void p() {
        this.j = 0L;
    }

    public final void q(int i, int i2) {
        this.d = i;
        this.e = i2;
    }
}
