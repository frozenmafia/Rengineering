package o;

import android.content.Context;
import android.media.metrics.LogSessionId;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class getSpeedAccuracyMetersPerSecond$ag$a {
    public static sendUrgentData values(Context context, getSpeedAccuracyMetersPerSecond getspeedaccuracymeterspersecond, boolean z) {
        getOutputStream ag$a = getOutputStream.ag$a(context);
        if (ag$a == null) {
            SupportMenuItem.toString("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new sendUrgentData(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z) {
            getspeedaccuracymeterspersecond.ah$a(ag$a);
        }
        return new sendUrgentData(ag$a.ah$a());
    }
}
