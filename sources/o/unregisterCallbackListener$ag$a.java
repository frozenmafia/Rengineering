package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
class unregisterCallbackListener$ag$a implements Executor {
    private unregisterCallbackListener$ag$a() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }
}
