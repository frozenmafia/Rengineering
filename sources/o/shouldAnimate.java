package o;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.InputContentInfoCompat;
/* loaded from: classes4.dex */
public class shouldAnimate implements startAnimating {
    private ScheduledThreadPoolExecutor valueOf;

    public shouldAnimate() {
        this.valueOf = null;
        this.valueOf = new ScheduledThreadPoolExecutor(2);
    }

    @Override // o.startAnimating
    public InputContentInfoCompat.InputContentInfoCompatImpl values(Runnable runnable, int i, String str) {
        long j = i;
        return new setRelativeEdges(this.valueOf.scheduleAtFixedRate(runnable, j, j, TimeUnit.MILLISECONDS));
    }

    @Override // o.startAnimating
    public void valueOf() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.valueOf;
        if (scheduledThreadPoolExecutor != null) {
            scheduledThreadPoolExecutor.shutdownNow();
        }
    }
}
