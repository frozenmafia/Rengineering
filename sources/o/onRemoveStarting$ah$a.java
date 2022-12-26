package o;

import com.google.firebase.perf.util.Timer;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
class onRemoveStarting$ah$a {
    private double HaptikSDK$a;
    private Timer HaptikSDK$b;
    private final boolean HaptikSDK$c;
    private long HaptikSDK$e;
    private long ag$a;
    private long ah$b;
    private double getInitSettings;
    private final snapFromFling invoke;
    private long toString;
    private double values;
    private static final shouldBeKeptAsChild valueOf = shouldBeKeptAsChild.ah$a();
    private static final long ah$a = TimeUnit.SECONDS.toMicros(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public onRemoveStarting$ah$a(double d, long j, snapFromFling snapfromfling, isAttachedToTransitionOverlay isattachedtotransitionoverlay, String str, boolean z) {
        this.invoke = snapfromfling;
        this.ag$a = j;
        this.getInitSettings = d;
        this.HaptikSDK$e = j;
        this.HaptikSDK$b = snapfromfling.ag$a();
        valueOf(isattachedtotransitionoverlay, str, z);
        this.HaptikSDK$c = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean ah$a(beginBatchedUpdates beginbatchedupdates) {
        synchronized (this) {
            Timer ag$a = this.invoke.ag$a();
            long min = Math.min(this.HaptikSDK$e + Math.max(0L, (long) ((this.HaptikSDK$b.ag$a(ag$a) * this.getInitSettings) / ah$a)), this.ag$a);
            this.HaptikSDK$e = min;
            if (min > 0) {
                this.HaptikSDK$e = min - 1;
                this.HaptikSDK$b = ag$a;
                return true;
            }
            if (this.HaptikSDK$c) {
                valueOf.ah$a("Exceeded log rate limit, dropping the log.");
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ag$a(boolean z) {
        synchronized (this) {
            this.getInitSettings = z ? this.HaptikSDK$a : this.values;
            this.ag$a = z ? this.ah$b : this.toString;
        }
    }

    private void valueOf(isAttachedToTransitionOverlay isattachedtotransitionoverlay, String str, boolean z) {
        long valueOf2 = valueOf(isattachedtotransitionoverlay, str);
        long ah$a2 = ah$a(isattachedtotransitionoverlay, str);
        double d = ah$a2 / valueOf2;
        this.HaptikSDK$a = d;
        this.ah$b = ah$a2;
        if (z) {
            valueOf.valueOf("Foreground %s logging rate:%f, burst capacity:%d", str, Double.valueOf(d), Long.valueOf(this.ah$b));
        }
        long onremovestarting_ah_a = toString(isattachedtotransitionoverlay, str);
        long ag$a = ag$a(isattachedtotransitionoverlay, str);
        double d2 = ag$a / onremovestarting_ah_a;
        this.values = d2;
        this.toString = ag$a;
        if (z) {
            valueOf.valueOf("Background %s logging rate:%f, capacity:%d", str, Double.valueOf(d2), Long.valueOf(this.toString));
        }
    }

    private static long valueOf(isAttachedToTransitionOverlay isattachedtotransitionoverlay, String str) {
        if (str == "Trace") {
            return isattachedtotransitionoverlay.HaptikSDK$b();
        }
        return isattachedtotransitionoverlay.HaptikSDK$b();
    }

    private static long ah$a(isAttachedToTransitionOverlay isattachedtotransitionoverlay, String str) {
        if (str == "Trace") {
            return isattachedtotransitionoverlay.onXdkEvent();
        }
        return isattachedtotransitionoverlay.invoke();
    }

    private static long toString(isAttachedToTransitionOverlay isattachedtotransitionoverlay, String str) {
        if (str == "Trace") {
            return isattachedtotransitionoverlay.HaptikSDK$b();
        }
        return isattachedtotransitionoverlay.HaptikSDK$b();
    }

    private static long ag$a(isAttachedToTransitionOverlay isattachedtotransitionoverlay, String str) {
        if (str == "Trace") {
            return isattachedtotransitionoverlay.isLogoutPending();
        }
        return isattachedtotransitionoverlay.HaptikSDK$c();
    }
}
