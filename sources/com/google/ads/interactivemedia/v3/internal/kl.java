package com.google.ads.interactivemedia.v3.internal;

import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import java.nio.ByteBuffer;
/* loaded from: classes4.dex */
public final class kl extends jt {
    private int d;
    private boolean e;
    private byte[] f;
    private byte[] g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private long l;

    public kl() {
        af.u(true);
        this.f = cp.f;
        this.g = cp.f;
    }

    private final int q(long j) {
        return (int) ((j * this.f1124b.f1109b) / 1000000);
    }

    private final int r(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > 1024) {
                int i = this.d;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    private final void s(byte[] bArr, int i) {
        j(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.k = true;
        }
    }

    private final void t(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.j);
        int i2 = this.j - min;
        System.arraycopy(bArr, i - i2, this.g, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.g, i2, min);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ja
    public final void e(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !n()) {
            int i = this.h;
            if (i == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f.length));
                int limit2 = byteBuffer.limit();
                while (true) {
                    limit2 -= 2;
                    if (limit2 >= byteBuffer.position()) {
                        if (Math.abs((int) byteBuffer.getShort(limit2)) > 1024) {
                            int i2 = this.d;
                            position = ((limit2 / i2) * i2) + i2;
                            break;
                        }
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.h = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    j(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.k = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i == 1) {
                int limit3 = byteBuffer.limit();
                int r = r(byteBuffer);
                int position2 = r - byteBuffer.position();
                byte[] bArr = this.f;
                int length = bArr.length;
                int i3 = this.i;
                int i4 = length - i3;
                if (r >= limit3 || position2 >= i4) {
                    int min = Math.min(position2, i4);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f, this.i, min);
                    int i5 = this.i + min;
                    this.i = i5;
                    byte[] bArr2 = this.f;
                    if (i5 == bArr2.length) {
                        if (this.k) {
                            s(bArr2, this.j);
                            long j = this.l;
                            int i6 = this.i;
                            int i7 = this.j;
                            this.l = j + ((i6 - (i7 + i7)) / this.d);
                            i5 = i6;
                        } else {
                            this.l += (i5 - this.j) / this.d;
                        }
                        t(byteBuffer, this.f, i5);
                        this.i = 0;
                        this.h = 2;
                    }
                    byteBuffer.limit(limit3);
                } else {
                    s(bArr, i3);
                    this.i = 0;
                    this.h = 0;
                }
            } else {
                int limit4 = byteBuffer.limit();
                int r2 = r(byteBuffer);
                byteBuffer.limit(r2);
                this.l += byteBuffer.remaining() / this.d;
                t(byteBuffer, this.g, this.j);
                if (r2 < limit4) {
                    s(this.g, this.j);
                    this.h = 0;
                    byteBuffer.limit(limit4);
                }
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jt, com.google.ads.interactivemedia.v3.internal.ja
    public final boolean g() {
        return this.e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jt
    public final iy i(iy iyVar) throws iz {
        if (iyVar.d == 2) {
            return this.e ? iyVar : iy.a;
        }
        throw new iz(iyVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jt
    protected final void k() {
        if (this.e) {
            this.d = this.f1124b.e;
            int q = q(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) * this.d;
            if (this.f.length != q) {
                this.f = new byte[q];
            }
            int q2 = q(SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US) * this.d;
            this.j = q2;
            if (this.g.length != q2) {
                this.g = new byte[q2];
            }
        }
        this.h = 0;
        this.l = 0L;
        this.i = 0;
        this.k = false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jt
    protected final void l() {
        int i = this.i;
        if (i > 0) {
            s(this.f, i);
        }
        if (this.k) {
            return;
        }
        this.l += this.j / this.d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jt
    protected final void m() {
        this.e = false;
        this.j = 0;
        this.f = cp.f;
        this.g = cp.f;
    }

    public final long o() {
        return this.l;
    }

    public final void p(boolean z) {
        this.e = z;
    }
}
