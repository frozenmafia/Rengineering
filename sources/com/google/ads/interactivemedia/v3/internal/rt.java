package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
/* loaded from: classes4.dex */
public final class rt implements rb {
    private final MediaCodec a;

    /* renamed from: b  reason: collision with root package name */
    private ByteBuffer[] f1253b;
    private ByteBuffer[] c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ rt(MediaCodec mediaCodec) {
        this.a = mediaCodec;
        if (cp.a < 21) {
            this.f1253b = mediaCodec.getInputBuffers();
            this.c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rb
    public final int a() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rb
    public final int b(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3) {
                if (cp.a < 21) {
                    this.c = this.a.getOutputBuffers();
                }
                dequeueOutputBuffer = -3;
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rb
    public final MediaFormat c() {
        return this.a.getOutputFormat();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rb
    public final ByteBuffer f(int i) {
        if (cp.a >= 21) {
            return this.a.getInputBuffer(i);
        }
        return ((ByteBuffer[]) cp.G(this.f1253b))[i];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rb
    public final ByteBuffer g(int i) {
        if (cp.a >= 21) {
            return this.a.getOutputBuffer(i);
        }
        return ((ByteBuffer[]) cp.G(this.c))[i];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rb
    public final void h() {
        this.a.flush();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rb
    public final void i() {
        this.f1253b = null;
        this.c = null;
        this.a.release();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rb
    public final void j(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rb
    public final void k(int i, boolean z) {
        this.a.releaseOutputBuffer(i, z);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rb
    public final void l(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rb
    public final void m(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rb
    public final void n(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rb
    public final void p() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rb
    public final void q(int i, int i2, long j, int i3) {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rb
    public final void r(int i, eb ebVar, long j) {
        this.a.queueSecureInputBuffer(i, 0, ebVar.a(), j, 0);
    }
}
