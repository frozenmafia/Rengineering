package com.appsamurai.storyly.exoplayer2.hls;

import java.io.IOException;
import o.FontRequestWorker;
import o.getElevationDegrees;
/* loaded from: classes6.dex */
final class UnexpectedSampleTimestampException extends IOException {
    public final long lastAcceptedSampleTimeUs;
    public final FontRequestWorker.AnonymousClass1 mediaChunk;
    public final long rejectedSampleTimeUs;

    public UnexpectedSampleTimestampException(FontRequestWorker.AnonymousClass1 anonymousClass1, long j, long j2) {
        super("Unexpected sample timestamp: " + getElevationDegrees.ag$a(j2) + " in chunk [" + anonymousClass1.ah$a + ", " + anonymousClass1.values + "]");
        this.mediaChunk = anonymousClass1;
        this.lastAcceptedSampleTimeUs = j;
        this.rejectedSampleTimeUs = j2;
    }
}
