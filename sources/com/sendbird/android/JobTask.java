package com.sendbird.android;

import com.sendbird.android.log.Logger;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
abstract class JobTask<T> implements Callable<T> {
    private Callable<T> task = new Callable<T>() { // from class: com.sendbird.android.JobTask.1
        @Override // java.util.concurrent.Callable
        public T call() {
            try {
                return JobTask.this.call();
            } catch (Exception e) {
                Logger.w(e);
                return null;
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Callable<T> getCallable() {
        return this.task;
    }
}
