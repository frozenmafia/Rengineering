package o;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes.dex */
final class addObserver$ah$a {
    Timer ah$a;
    final Map<Integer, TimerTask> valueOf = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void values(final int i, final Runnable runnable, long j) {
        TimerTask timerTask = new TimerTask() { // from class: o.addObserver$ah$a.4
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                try {
                    runnable.run();
                } finally {
                    addObserver$ah$a.this.ag$a(i);
                }
            }
        };
        synchronized (this) {
            TimerTask put = this.valueOf.put(Integer.valueOf(i), timerTask);
            if (put != null) {
                put.cancel();
            }
            if (this.ah$a == null) {
                this.ah$a = new Timer("Subscription SmartTimer", true);
            }
            this.ah$a.schedule(timerTask, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ag$a(int i) {
        Timer timer;
        synchronized (this) {
            TimerTask remove = this.valueOf.remove(Integer.valueOf(i));
            if (remove != null) {
                remove.cancel();
            }
            if (this.valueOf.isEmpty() && (timer = this.ah$a) != null) {
                timer.cancel();
                this.ah$a = null;
            }
        }
    }
}
