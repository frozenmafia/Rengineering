package o;

import android.os.Process;
import android.os.StrictMode;
import java.util.concurrent.ThreadFactory;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class WindowCompat$ah$a implements ThreadFactory {
    final boolean ag$a;
    final WindowCompat$ag$a toString;
    private final String valueOf;
    private int values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WindowCompat$ah$a(String str, WindowCompat$ag$a windowCompat$ag$a, boolean z) {
        this.valueOf = str;
        this.toString = windowCompat$ag$a;
        this.ag$a = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread;
        synchronized (this) {
            thread = new Thread(runnable, "glide-" + this.valueOf + "-thread-" + this.values) { // from class: o.WindowCompat$ah$a.2
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    Process.setThreadPriority(9);
                    if (WindowCompat$ah$a.this.ag$a) {
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                    }
                    try {
                        super.run();
                    } catch (Throwable th) {
                        WindowCompat$ah$a.this.toString.ag$a(th);
                    }
                }
            };
            this.values = this.values + 1;
        }
        return thread;
    }
}
