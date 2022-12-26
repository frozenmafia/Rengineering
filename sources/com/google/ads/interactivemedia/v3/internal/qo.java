package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCodec;
import android.os.HandlerThread;
import java.io.IOException;
/* loaded from: classes4.dex */
public final class qo implements ra {

    /* renamed from: b  reason: collision with root package name */
    private final atd f1233b;
    private final atd c;

    public qo(final int i) {
        atd atdVar = new atd() { // from class: com.google.ads.interactivemedia.v3.internal.qn
            @Override // com.google.ads.interactivemedia.v3.internal.atd
            public final Object a() {
                String s;
                String s2;
                if (r2 != 0) {
                    s2 = qp.s(i, "ExoPlayer:MediaCodecAsyncAdapter:");
                    return new HandlerThread(s2);
                }
                s = qp.s(i, "ExoPlayer:MediaCodecQueueingThread:");
                return new HandlerThread(s);
            }
        };
        atd atdVar2 = new atd() { // from class: com.google.ads.interactivemedia.v3.internal.qn
            @Override // com.google.ads.interactivemedia.v3.internal.atd
            public final Object a() {
                String s;
                String s2;
                if (r2 != 0) {
                    s2 = qp.s(i, "ExoPlayer:MediaCodecAsyncAdapter:");
                    return new HandlerThread(s2);
                }
                s = qp.s(i, "ExoPlayer:MediaCodecQueueingThread:");
                return new HandlerThread(s);
            }
        };
        this.f1233b = atdVar;
        this.c = atdVar2;
    }

    public final qp a(qz qzVar) throws IOException {
        MediaCodec mediaCodec;
        String str = qzVar.a.a;
        qp qpVar = null;
        try {
            af.o("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                qp qpVar2 = new qp(mediaCodec, (HandlerThread) this.f1233b.a(), (HandlerThread) this.c.a());
                try {
                    af.p();
                    qp.o(qpVar2, qzVar.f1240b, qzVar.d, qzVar.e);
                    return qpVar2;
                } catch (Exception e) {
                    e = e;
                    qpVar = qpVar2;
                    if (qpVar != null) {
                        qpVar.i();
                    } else if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodec = null;
        }
    }
}
