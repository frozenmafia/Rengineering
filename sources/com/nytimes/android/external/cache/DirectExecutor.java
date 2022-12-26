package com.nytimes.android.external.cache;

import java.util.concurrent.Executor;
/* loaded from: classes5.dex */
public enum DirectExecutor implements Executor {
    INSTANCE;

    @Override // java.lang.Enum
    public String toString() {
        return "MoreExecutors.directExecutor()";
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
