package o;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* loaded from: classes5.dex */
public class findInterceptingOnItemTouchListener {
    private final Executor valueOf;
    private Task<Void> values = Tasks.forResult(null);
    private final Object toString = new Object();
    private final ThreadLocal<Boolean> ah$a = new ThreadLocal<>();

    public findInterceptingOnItemTouchListener(Executor executor) {
        this.valueOf = executor;
        executor.execute(new Runnable() { // from class: o.findInterceptingOnItemTouchListener.2
            @Override // java.lang.Runnable
            public void run() {
                findInterceptingOnItemTouchListener.this.ah$a.set(true);
            }
        });
    }

    public Executor ag$a() {
        return this.valueOf;
    }

    private boolean valueOf() {
        return Boolean.TRUE.equals(this.ah$a.get());
    }

    public void ah$a() {
        if (!valueOf()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task<Void> values(final Runnable runnable) {
        return valueOf(new Callable<Void>() { // from class: o.findInterceptingOnItemTouchListener.3
            @Override // java.util.concurrent.Callable
            /* renamed from: ag$a */
            public Void call() throws Exception {
                runnable.run();
                return null;
            }
        });
    }

    private <T> Continuation<Void, T> values(final Callable<T> callable) {
        return new Continuation<Void, T>() { // from class: o.findInterceptingOnItemTouchListener.1
            /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object] */
            @Override // com.google.android.gms.tasks.Continuation
            public T then(Task<Void> task) throws Exception {
                return callable.call();
            }
        };
    }

    private <T> Task<Void> toString(Task<T> task) {
        return task.continueWith(this.valueOf, (Continuation<T, Void>) new Continuation<T, Void>() { // from class: o.findInterceptingOnItemTouchListener.5
            @Override // com.google.android.gms.tasks.Continuation
            /* renamed from: values */
            public Void then(Task<T> task2) throws Exception {
                return null;
            }
        });
    }

    public <T> Task<T> valueOf(Callable<T> callable) {
        Task<T> continueWith;
        synchronized (this.toString) {
            continueWith = this.values.continueWith(this.valueOf, values(callable));
            this.values = toString(continueWith);
        }
        return continueWith;
    }

    public <T> Task<T> toString(Callable<Task<T>> callable) {
        Task<T> continueWithTask;
        synchronized (this.toString) {
            continueWithTask = this.values.continueWithTask(this.valueOf, values(callable));
            this.values = toString(continueWithTask);
        }
        return continueWithTask;
    }
}
