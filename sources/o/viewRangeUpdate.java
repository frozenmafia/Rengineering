package o;

import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
public class viewRangeUpdate {
    private ScheduledFuture<?> HaptikSDK$a;
    private final long HaptikSDK$b;
    private final Random HaptikSDK$c;
    private final ScheduledExecutorService ag$a;
    private final double ah$a;
    private final long ah$b;
    private final double invoke;
    private boolean toString;
    private final detachAndScrapView valueOf;
    private long values;

    private viewRangeUpdate(ScheduledExecutorService scheduledExecutorService, detachAndScrapView detachandscrapview, long j, long j2, double d, double d2) {
        this.HaptikSDK$c = new Random();
        this.toString = true;
        this.ag$a = scheduledExecutorService;
        this.valueOf = detachandscrapview;
        this.HaptikSDK$b = j;
        this.ah$b = j2;
        this.invoke = d;
        this.ah$a = d2;
    }

    public void ah$a(final Runnable runnable) {
        Runnable runnable2 = new Runnable() { // from class: o.viewRangeUpdate.4
            @Override // java.lang.Runnable
            public void run() {
                viewRangeUpdate.this.HaptikSDK$a = null;
                runnable.run();
            }
        };
        if (this.HaptikSDK$a != null) {
            this.valueOf.toString("Cancelling previous scheduled retry", new Object[0]);
            this.HaptikSDK$a.cancel(false);
            this.HaptikSDK$a = null;
        }
        long j = 0;
        if (!this.toString) {
            long j2 = this.values;
            if (j2 == 0) {
                this.values = this.HaptikSDK$b;
            } else {
                this.values = Math.min((long) (j2 * this.invoke), this.ah$b);
            }
            double d = this.ah$a;
            double d2 = this.values;
            j = (long) (((1.0d - d) * d2) + (d * d2 * this.HaptikSDK$c.nextDouble()));
        }
        this.toString = false;
        this.valueOf.toString("Scheduling retry in %dms", Long.valueOf(j));
        this.HaptikSDK$a = this.ag$a.schedule(runnable2, j, TimeUnit.MILLISECONDS);
    }

    public void ah$a() {
        this.toString = true;
        this.values = 0L;
    }

    public void ag$a() {
        this.values = this.ah$b;
    }

    public void values() {
        if (this.HaptikSDK$a != null) {
            this.valueOf.toString("Cancelling existing retry attempt", new Object[0]);
            this.HaptikSDK$a.cancel(false);
            this.HaptikSDK$a = null;
        } else {
            this.valueOf.toString("No existing retry attempt to cancel", new Object[0]);
        }
        this.values = 0L;
    }

    /* loaded from: classes5.dex */
    public static class toString {
        private final ScheduledExecutorService HaptikSDK$c;
        private final detachAndScrapView ah$a;
        private long toString = 1000;
        private double ag$a = 0.5d;
        private long values = 30000;
        private double valueOf = 1.3d;

        public toString(ScheduledExecutorService scheduledExecutorService, com.google.firebase.database.logging.Logger logger, String str) {
            this.HaptikSDK$c = scheduledExecutorService;
            this.ah$a = new detachAndScrapView(logger, str);
        }

        public toString ag$a(long j) {
            this.toString = j;
            return this;
        }

        public toString ah$a(long j) {
            this.values = j;
            return this;
        }

        public toString ah$a(double d) {
            this.valueOf = d;
            return this;
        }

        public toString valueOf(double d) {
            if (d < 0.0d || d > 1.0d) {
                throw new IllegalArgumentException("Argument out of range: " + d);
            }
            this.ag$a = d;
            return this;
        }

        public viewRangeUpdate ah$a() {
            return new viewRangeUpdate(this.HaptikSDK$c, this.ah$a, this.toString, this.values, this.valueOf, this.ag$a);
        }
    }
}
