package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
/* loaded from: classes4.dex */
final class qp implements rb {
    private final MediaCodec a;

    /* renamed from: b  reason: collision with root package name */
    private final qu f1234b;
    private final qs c;
    private boolean d;
    private int e = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ qp(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2) {
        this.a = mediaCodec;
        this.f1234b = new qu(handlerThread);
        this.c = new qs(mediaCodec, handlerThread2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void o(qp qpVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        qpVar.f1234b.f(qpVar.a);
        af.o("configureCodec");
        qpVar.a.configure(mediaFormat, surface, mediaCrypto, 0);
        af.p();
        qpVar.c.d();
        af.o("startCodec");
        qpVar.a.start();
        af.p();
        qpVar.e = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String s(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rb
    public final int a() {
        return this.f1234b.a();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rb
    public final int b(MediaCodec.BufferInfo bufferInfo) {
        return this.f1234b.b(bufferInfo);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rb
    public final MediaFormat c() {
        return this.f1234b.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rb
    public final ByteBuffer f(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rb
    public final ByteBuffer g(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rb
    public final void h() {
        this.c.b();
        this.a.flush();
        this.f1234b.e();
        this.a.start();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rb
    public final void i() {
        try {
            if (this.e == 1) {
                this.c.c();
                this.f1234b.g();
            }
            this.e = 2;
            if (this.d) {
                return;
            }
            this.a.release();
            this.d = true;
        } catch (Throwable th) {
            if (!this.d) {
                this.a.release();
                this.d = true;
            }
            throw th;
        }
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
        this.c.e(i, i2, j, i3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rb
    public final void r(int i, eb ebVar, long j) {
        this.c.f(i, ebVar, j);
    }
}
