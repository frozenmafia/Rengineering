package o;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
/* loaded from: classes4.dex */
public class setReenterTransition extends setPostOnViewCreatedAlpha implements setSharedElementNames {
    public setReenterTransition(Executor executor) {
        super("SerialExecutor", 1, executor, new LinkedBlockingQueue());
    }

    @Override // o.setPostOnViewCreatedAlpha, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this) {
            super.execute(runnable);
        }
    }
}
