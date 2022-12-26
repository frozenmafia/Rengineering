package com.facebook.react.modules.storage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class AsyncStorageModule$ag$a implements Executor {
    private final ArrayDeque<Runnable> ah$a = new ArrayDeque<>();
    final /* synthetic */ AsyncStorageModule toString;
    private Runnable valueOf;
    private final Executor values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AsyncStorageModule$ag$a(AsyncStorageModule asyncStorageModule, Executor executor) {
        this.toString = asyncStorageModule;
        this.values = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        synchronized (this) {
            this.ah$a.offer(new Runnable() { // from class: com.facebook.react.modules.storage.AsyncStorageModule$ag$a.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        runnable.run();
                    } finally {
                        AsyncStorageModule$ag$a.this.ah$a();
                    }
                }
            });
            if (this.valueOf == null) {
                ah$a();
            }
        }
    }

    void ah$a() {
        synchronized (this) {
            Runnable poll = this.ah$a.poll();
            this.valueOf = poll;
            if (poll != null) {
                this.values.execute(poll);
            }
        }
    }
}
