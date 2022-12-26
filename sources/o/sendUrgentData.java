package o;

import android.media.metrics.LogSessionId;
/* loaded from: classes3.dex */
public final class sendUrgentData {
    public static final sendUrgentData values;
    private final toString ag$a;

    static {
        values = getElevationDegrees.HaptikSDK$b < 31 ? new sendUrgentData() : new sendUrgentData(toString.values);
    }

    public sendUrgentData() {
        this((toString) null);
        FingerprintManagerCompat.ah$a(getElevationDegrees.HaptikSDK$b < 31);
    }

    public sendUrgentData(LogSessionId logSessionId) {
        this(new toString(logSessionId));
    }

    private sendUrgentData(toString tostring) {
        this.ag$a = tostring;
    }

    public LogSessionId ag$a() {
        return ((toString) FingerprintManagerCompat.toString(this.ag$a)).ah$a;
    }

    /* loaded from: classes3.dex */
    static final class toString {
        public static final toString values = new toString(LogSessionId.LOG_SESSION_ID_NONE);
        public final LogSessionId ah$a;

        public toString(LogSessionId logSessionId) {
            this.ah$a = logSessionId;
        }
    }
}
