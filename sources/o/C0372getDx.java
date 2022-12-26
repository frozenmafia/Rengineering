package o;

import java.util.concurrent.TimeUnit;
/* renamed from: o.getDx  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C0372getDx {
    private static final long ag$a = TimeUnit.HOURS.toMillis(24);
    private static final long values = TimeUnit.MINUTES.toMillis(30);
    private final triggerUpdateProcessor ah$a = triggerUpdateProcessor.valueOf();
    private int toString;
    private long valueOf;

    private static boolean ag$a(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    private static boolean values(int i) {
        return i == 429 || (i >= 500 && i < 600);
    }

    public void valueOf(int i) {
        synchronized (this) {
            if (ag$a(i)) {
                ah$a();
                return;
            }
            this.toString++;
            this.valueOf = this.ah$a.ah$a() + ah$a(i);
        }
    }

    private void ah$a() {
        synchronized (this) {
            this.toString = 0;
        }
    }

    private long ah$a(int i) {
        synchronized (this) {
            if (!values(i)) {
                return ag$a;
            }
            return (long) Math.min(Math.pow(2.0d, this.toString) + this.ah$a.values(), values);
        }
    }

    public boolean valueOf() {
        boolean z;
        synchronized (this) {
            if (this.toString != 0) {
                z = this.ah$a.ah$a() > this.valueOf;
            }
        }
        return z;
    }
}
