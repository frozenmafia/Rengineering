package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCodec;
/* loaded from: classes4.dex */
public class rc extends ec {
    public final String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc(Throwable th, rd rdVar) {
        super("Decoder failed: ".concat(String.valueOf(rdVar == null ? null : rdVar.a)), th);
        String str = null;
        if (cp.a >= 21 && (th instanceof MediaCodec.CodecException)) {
            str = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.a = str;
    }
}
