package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.v3.internal.ass;
@ass(a = as.class)
/* loaded from: classes4.dex */
public abstract class by {
    private static final String DEFAULT_TIME_UNIT = "ms";

    public static by create(VideoProgressUpdate videoProgressUpdate) {
        return new as(videoProgressUpdate.getCurrentTimeMs(), videoProgressUpdate.getDurationMs(), DEFAULT_TIME_UNIT);
    }

    public abstract long currentTime();

    public abstract long duration();

    public abstract String timeUnit();
}
