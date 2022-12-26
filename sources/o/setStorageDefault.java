package o;

import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes5.dex */
public abstract class setStorageDefault implements Runnable {
    private final TaskCompletionSource toString;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setStorageDefault() {
        this.toString = null;
    }

    public setStorageDefault(TaskCompletionSource taskCompletionSource) {
        this.toString = taskCompletionSource;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final TaskCompletionSource ah$a() {
        return this.toString;
    }

    public final void ah$a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.toString;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            valueOf();
        } catch (Exception e) {
            ah$a(e);
        }
    }

    protected abstract void valueOf();
}
