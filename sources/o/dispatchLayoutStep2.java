package o;

import android.os.Process;
/* loaded from: classes7.dex */
public abstract class dispatchLayoutStep2 implements Runnable {
    protected abstract void ag$a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        ag$a();
    }
}
