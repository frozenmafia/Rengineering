package o;

import android.os.Handler;
import o.FrameworkSQLiteDatabase;
/* loaded from: classes5.dex */
final class selection$ag$a implements Runnable, FrameworkSQLiteDatabase.AnonymousClass2 {
    private volatile boolean ah$a;
    private final Runnable toString;
    private final Handler values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public selection$ag$a(Handler handler, Runnable runnable) {
        this.values = handler;
        this.toString = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.toString.run();
        } catch (Throwable th) {
            setProgressBackgroundColor.values(th);
        }
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public void dispose() {
        this.ah$a = true;
        this.values.removeCallbacks(this);
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public boolean isDisposed() {
        return this.ah$a;
    }
}
