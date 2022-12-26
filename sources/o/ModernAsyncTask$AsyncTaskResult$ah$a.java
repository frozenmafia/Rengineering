package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.ModernAsyncTask;
/* loaded from: classes4.dex */
public final class ModernAsyncTask$AsyncTaskResult$ah$a {
    private ModernAsyncTask$AsyncTaskResult$ah$a() {
    }

    public /* synthetic */ ModernAsyncTask$AsyncTaskResult$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    public final int valueOf() {
        int i;
        i = ModernAsyncTask.AsyncTaskResult.values;
        return i;
    }

    public final int HaptikSDK$c() {
        int i;
        i = ModernAsyncTask.AsyncTaskResult.HaptikSDK$c;
        return i;
    }

    public final long ag$a() {
        long j;
        j = ModernAsyncTask.AsyncTaskResult.invoke;
        return j;
    }

    public final ExecutorService values() {
        ExecutorService executorService;
        ExecutorService executorService2;
        executorService = ModernAsyncTask.AsyncTaskResult.ah$a;
        if (executorService == null) {
            ModernAsyncTask$AsyncTaskResult$ah$a modernAsyncTask$AsyncTaskResult$ah$a = this;
            ModernAsyncTask.AsyncTaskResult.ah$a = new ThreadPoolExecutor(modernAsyncTask$AsyncTaskResult$ah$a.valueOf(), modernAsyncTask$AsyncTaskResult$ah$a.HaptikSDK$c(), modernAsyncTask$AsyncTaskResult$ah$a.ag$a(), TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        executorService2 = ModernAsyncTask.AsyncTaskResult.ah$a;
        runAnimators.toString(executorService2);
        return executorService2;
    }

    public final Executor ah$a() {
        Executor executor;
        Executor executor2;
        executor = ModernAsyncTask.AsyncTaskResult.toString;
        if (executor == null) {
            ModernAsyncTask.AsyncTaskResult.toString = new Executor(new Handler(Looper.getMainLooper())) { // from class: o.ModernAsyncTask.3
                private final Handler ag$a;

                {
                    runAnimators.ag$a(r2, "handler");
                    this.ag$a = r2;
                }

                @Override // java.util.concurrent.Executor
                public void execute(Runnable runnable) {
                    runAnimators.ag$a(runnable, "command");
                    this.ag$a.post(runnable);
                }
            };
        }
        executor2 = ModernAsyncTask.AsyncTaskResult.toString;
        runAnimators.toString(executor2);
        return executor2;
    }
}
