package o;

import com.google.firebase.database.DatabaseException;
import java.lang.Thread;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
public abstract class setMoveDuration implements notifyItemInserted {
    private ScheduledThreadPoolExecutor valueOf;

    public abstract void ag$a(Throwable th);

    /* loaded from: classes5.dex */
    class toString implements ThreadFactory {
        private toString() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = setMoveDuration.this.values().newThread(runnable);
            registerAdapterDataObserver valueOf = setMoveDuration.this.valueOf();
            valueOf.values(newThread, "FirebaseDatabaseWorker");
            valueOf.valueOf(newThread, true);
            valueOf.valueOf(newThread, new Thread.UncaughtExceptionHandler() { // from class: o.setMoveDuration.toString.3
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, Throwable th) {
                    setMoveDuration.this.ag$a(th);
                }
            });
            return newThread;
        }
    }

    protected ThreadFactory values() {
        return Executors.defaultThreadFactory();
    }

    protected registerAdapterDataObserver valueOf() {
        return registerAdapterDataObserver.values;
    }

    public setMoveDuration() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new toString()) { // from class: o.setMoveDuration.2
            @Override // java.util.concurrent.ThreadPoolExecutor
            protected void afterExecute(Runnable runnable, Throwable th) {
                super.afterExecute(runnable, th);
                if (th == null && (runnable instanceof Future)) {
                    Future future = (Future) runnable;
                    try {
                        if (future.isDone()) {
                            future.get();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    } catch (CancellationException unused2) {
                    } catch (ExecutionException e) {
                        th = e.getCause();
                    }
                }
                if (th != null) {
                    setMoveDuration.this.ag$a(th);
                }
            }
        };
        this.valueOf = scheduledThreadPoolExecutor;
        scheduledThreadPoolExecutor.setKeepAliveTime(3L, TimeUnit.SECONDS);
    }

    public ScheduledExecutorService ag$a() {
        return this.valueOf;
    }

    @Override // o.notifyItemInserted
    public void toString(Runnable runnable) {
        this.valueOf.execute(runnable);
    }

    @Override // o.notifyItemInserted
    public void ah$a() {
        this.valueOf.setCorePoolSize(1);
    }

    public static String toString(Throwable th) {
        if (th instanceof OutOfMemoryError) {
            return "Firebase Database encountered an OutOfMemoryError. You may need to reduce the amount of data you are syncing to the client (e.g. by using queries or syncing a deeper path). See https://firebase.google.com/docs/database/ios/structure-data#best_practices_for_data_structure and https://firebase.google.com/docs/database/android/retrieve-data#filtering_data";
        }
        if (th instanceof NoClassDefFoundError) {
            return "A symbol that the Firebase Database SDK depends on failed to load. This usually indicates that your project includes an incompatible version of another Firebase dependency. If updating your dependencies to the latest version does not resolve this issue, please file a report at https://github.com/firebase/firebase-android-sdk";
        }
        if (th instanceof DatabaseException) {
            return "";
        }
        return "Uncaught exception in Firebase Database runloop (" + postAnimationRunner.valueOf() + "). If you are not already on the latest version of the Firebase SDKs, try updating your dependencies. Should this problem persist, please file a report at https://github.com/firebase/firebase-android-sdk";
    }
}
