package com.appsamurai.storyly.exoplayer2.core.video;

import android.view.Surface;
import com.appsamurai.storyly.exoplayer2.core.mediacodec.MediaCodecDecoderException;
import o.MessageCompat;
/* loaded from: classes3.dex */
public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {
    public final boolean isSurfaceValid;
    public final int surfaceIdentityHashCode;

    public MediaCodecVideoDecoderException(Throwable th, MessageCompat messageCompat, Surface surface) {
        super(th, messageCompat);
        this.surfaceIdentityHashCode = System.identityHashCode(surface);
        this.isSurfaceValid = surface == null || surface.isValid();
    }
}
