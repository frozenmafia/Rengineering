package o;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes3.dex */
public final class getUserHandleForUid {
    private static final AtomicLong invoke = new AtomicLong();
    public final Uri HaptikSDK$a;
    public final Map<String, List<String>> HaptikSDK$b;
    public final long ag$a;
    public final long ah$a;
    public final long toString;
    public final long valueOf;
    public final SplashScreen$Impl31$hierarchyListener$1 values;

    public static long values() {
        return invoke.getAndIncrement();
    }

    public getUserHandleForUid(long j, SplashScreen$Impl31$hierarchyListener$1 splashScreen$Impl31$hierarchyListener$1, long j2) {
        this(j, splashScreen$Impl31$hierarchyListener$1, splashScreen$Impl31$hierarchyListener$1.HaptikSDK$b, Collections.emptyMap(), j2, 0L, 0L);
    }

    public getUserHandleForUid(long j, SplashScreen$Impl31$hierarchyListener$1 splashScreen$Impl31$hierarchyListener$1, Uri uri, Map<String, List<String>> map, long j2, long j3, long j4) {
        this.toString = j;
        this.values = splashScreen$Impl31$hierarchyListener$1;
        this.HaptikSDK$a = uri;
        this.HaptikSDK$b = map;
        this.ag$a = j2;
        this.valueOf = j3;
        this.ah$a = j4;
    }
}
