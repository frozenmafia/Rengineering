package com.appsamurai.storyly.exoplayer2.core.drm;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import o.SplashScreen$Impl31$hierarchyListener$1;
/* loaded from: classes3.dex */
public final class MediaDrmCallbackException extends IOException {
    public final long bytesLoaded;
    public final SplashScreen$Impl31$hierarchyListener$1 dataSpec;
    public final Map<String, List<String>> responseHeaders;
    public final Uri uriAfterRedirects;

    public MediaDrmCallbackException(SplashScreen$Impl31$hierarchyListener$1 splashScreen$Impl31$hierarchyListener$1, Uri uri, Map<String, List<String>> map, long j, Throwable th) {
        super(th);
        this.dataSpec = splashScreen$Impl31$hierarchyListener$1;
        this.uriAfterRedirects = uri;
        this.responseHeaders = map;
        this.bytesLoaded = j;
    }
}
