package androidx.work;

import java.util.concurrent.Executor;
import o.runAnimators;
/* loaded from: classes6.dex */
public enum DirectExecutor implements Executor {
    INSTANCE;

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runAnimators.ag$a(runnable, "command");
        runnable.run();
    }
}
