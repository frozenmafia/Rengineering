package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
public class DisplayFeature {
    private boolean ag$a;
    private long ah$a;
    private long values;
    public static final DisplayFeature$ag$a valueOf = new DisplayFeature$ag$a(null);
    public static final DisplayFeature toString = new valueOf();

    public DisplayFeature ag$a(long j, TimeUnit timeUnit) {
        runAnimators.ag$a(timeUnit, "unit");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("timeout < 0: " + j).toString());
        }
        this.values = timeUnit.toNanos(j);
        return this;
    }

    public long F_() {
        return this.values;
    }

    public boolean ah$b() {
        return this.ag$a;
    }

    public long G_() {
        if (!this.ag$a) {
            throw new IllegalStateException("No deadline".toString());
        }
        return this.ah$a;
    }

    public DisplayFeature ah$a(long j) {
        this.ag$a = true;
        this.ah$a = j;
        return this;
    }

    public DisplayFeature D_() {
        this.values = 0L;
        return this;
    }

    public DisplayFeature C_() {
        this.ag$a = false;
        return this;
    }

    public void E_() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.ag$a && this.ah$a - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* loaded from: classes5.dex */
    public static final class valueOf extends DisplayFeature {
        @Override // o.DisplayFeature
        public void E_() {
        }

        valueOf() {
        }

        @Override // o.DisplayFeature
        public DisplayFeature ag$a(long j, TimeUnit timeUnit) {
            runAnimators.ag$a(timeUnit, "unit");
            return this;
        }

        @Override // o.DisplayFeature
        public DisplayFeature ah$a(long j) {
            return this;
        }
    }
}
