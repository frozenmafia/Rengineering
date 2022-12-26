package com.google.ads.interactivemedia.v3.internal;

import android.view.Surface;
/* loaded from: classes4.dex */
final class xr {
    public static void a(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            cc.c("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
