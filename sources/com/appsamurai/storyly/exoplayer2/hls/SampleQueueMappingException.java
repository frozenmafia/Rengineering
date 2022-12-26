package com.appsamurai.storyly.exoplayer2.hls;

import java.io.IOException;
/* loaded from: classes3.dex */
public final class SampleQueueMappingException extends IOException {
    public SampleQueueMappingException(String str) {
        super("Unable to bind a sample queue to TrackGroup with mime type " + str + ".");
    }
}
