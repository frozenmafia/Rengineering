package com.sendbird.android;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class JobResultTask<T> implements Callable<T> {
    private Callable<T> task = new Callable<T>() { // from class: com.sendbird.android.JobResultTask.1
        @Override // java.util.concurrent.Callable
        public T call() {
            final SendBirdException e;
            final T t = null;
            try {
                e = null;
                t = JobResultTask.this.call();
            } catch (SendBirdException e2) {
                e = e2;
            } catch (Exception e3) {
                e = new SendBirdException(e3.getMessage(), SendBirdError.ERR_REQUEST_FAILED);
            }
            SendBird.runOnUIThread(new Runnable() { // from class: com.sendbird.android.JobResultTask.1.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    JobResultTask.this.onResultForUiThread(t, e);
                }
            });
            return t;
        }
    };

    abstract void onResultForUiThread(T t, SendBirdException sendBirdException);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Callable<T> getCallable() {
        return this.task;
    }
}
