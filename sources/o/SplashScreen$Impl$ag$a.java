package o;

import android.view.Surface;
/* loaded from: classes3.dex */
final class SplashScreen$Impl$ag$a {
    public static void ag$a(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            SupportMenuItem.toString("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
