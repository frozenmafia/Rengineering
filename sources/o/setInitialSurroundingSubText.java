package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* loaded from: classes4.dex */
public class setInitialSurroundingSubText implements Executor {
    Handler valueOf = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.valueOf.post(runnable);
    }
}
