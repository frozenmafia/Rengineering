package com.appsamurai.storyly.exoplayer2.common;

import o.RoundedBitmapDrawable;
/* loaded from: classes3.dex */
public final class IllegalSeekPositionException extends IllegalStateException {
    public final long positionMs;
    public final RoundedBitmapDrawable timeline;
    public final int windowIndex;

    public IllegalSeekPositionException(RoundedBitmapDrawable roundedBitmapDrawable, int i, long j) {
        this.timeline = roundedBitmapDrawable;
        this.windowIndex = i;
        this.positionMs = j;
    }
}
