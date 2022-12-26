package o;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* loaded from: classes7.dex */
public final class animateRemove {
    public static Executor ah$a() {
        return com.google.common.util.concurrent.DirectExecutor.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor values(final Executor executor, final countItemsBefore<?> countitemsbefore) {
        markViewHoldersUpdated.toString(executor);
        markViewHoldersUpdated.toString(countitemsbefore);
        return executor == com.google.common.util.concurrent.DirectExecutor.INSTANCE ? executor : new Executor() { // from class: o.animateRemove.4
            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RejectedExecutionException e) {
                    countitemsbefore.values((Throwable) e);
                }
            }
        };
    }
}
