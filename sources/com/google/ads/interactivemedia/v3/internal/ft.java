package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.media.metrics.LogSessionId;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ft {
    public static iv a(Context context, gb gbVar, boolean z) {
        ir k = ir.k(context);
        if (k == null) {
            cc.e("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new iv(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z) {
            gbVar.M(k);
        }
        return new iv(k.j());
    }
}
