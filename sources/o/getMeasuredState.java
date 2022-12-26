package o;

import com.bugsnag.android.TaskType;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
/* loaded from: classes3.dex */
public final class getMeasuredState {
    private final ThreadPoolExecutor ag$a;
    private final ThreadPoolExecutor ah$a;
    private final ThreadPoolExecutor toString;
    private final ThreadPoolExecutor valueOf;
    private final ThreadPoolExecutor values;

    public getMeasuredState() {
        this(null, null, null, null, null, 31, null);
    }

    public getMeasuredState(ThreadPoolExecutor threadPoolExecutor, ThreadPoolExecutor threadPoolExecutor2, ThreadPoolExecutor threadPoolExecutor3, ThreadPoolExecutor threadPoolExecutor4, ThreadPoolExecutor threadPoolExecutor5) {
        runAnimators.valueOf(threadPoolExecutor, "errorExecutor");
        runAnimators.valueOf(threadPoolExecutor2, "sessionExecutor");
        runAnimators.valueOf(threadPoolExecutor3, "ioExecutor");
        runAnimators.valueOf(threadPoolExecutor4, "internalReportExecutor");
        runAnimators.valueOf(threadPoolExecutor5, "defaultExecutor");
        this.values = threadPoolExecutor;
        this.ah$a = threadPoolExecutor2;
        this.toString = threadPoolExecutor3;
        this.ag$a = threadPoolExecutor4;
        this.valueOf = threadPoolExecutor5;
    }

    public /* synthetic */ getMeasuredState(ThreadPoolExecutor threadPoolExecutor, ThreadPoolExecutor threadPoolExecutor2, ThreadPoolExecutor threadPoolExecutor3, ThreadPoolExecutor threadPoolExecutor4, ThreadPoolExecutor threadPoolExecutor5, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? getMatrix.toString("Bugsnag Error thread", true) : threadPoolExecutor, (i & 2) != 0 ? getMatrix.toString("Bugsnag Session thread", true) : threadPoolExecutor2, (i & 4) != 0 ? getMatrix.toString("Bugsnag IO thread", true) : threadPoolExecutor3, (i & 8) != 0 ? getMatrix.toString("Bugsnag Internal Report thread", false) : threadPoolExecutor4, (i & 16) != 0 ? getMatrix.toString("Bugsnag Default thread", false) : threadPoolExecutor5);
    }

    public final Future<?> values(TaskType taskType, Runnable runnable) throws RejectedExecutionException {
        runAnimators.valueOf(taskType, "taskType");
        runAnimators.valueOf(runnable, "runnable");
        Callable<Object> callable = Executors.callable(runnable);
        runAnimators.toString(callable, "Executors.callable(runnable)");
        return values(taskType, callable);
    }

    public final <T> Future<T> values(TaskType taskType, Callable<T> callable) throws RejectedExecutionException {
        runAnimators.valueOf(taskType, "taskType");
        runAnimators.valueOf(callable, "callable");
        int i = getNextClusterForwardId.toString[taskType.ordinal()];
        if (i == 1) {
            Future<T> submit = this.values.submit(callable);
            runAnimators.toString(submit, "errorExecutor.submit(callable)");
            return submit;
        } else if (i == 2) {
            Future<T> submit2 = this.ah$a.submit(callable);
            runAnimators.toString(submit2, "sessionExecutor.submit(callable)");
            return submit2;
        } else if (i == 3) {
            Future<T> submit3 = this.toString.submit(callable);
            runAnimators.toString(submit3, "ioExecutor.submit(callable)");
            return submit3;
        } else if (i == 4) {
            Future<T> submit4 = this.ag$a.submit(callable);
            runAnimators.toString(submit4, "internalReportExecutor.submit(callable)");
            return submit4;
        } else if (i == 5) {
            Future<T> submit5 = this.valueOf.submit(callable);
            runAnimators.toString(submit5, "defaultExecutor.submit(callable)");
            return submit5;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void values() {
        this.ag$a.shutdownNow();
        this.valueOf.shutdownNow();
        this.values.shutdown();
        this.ah$a.shutdown();
        this.toString.shutdown();
        valueOf(this.values);
        valueOf(this.ah$a);
        valueOf(this.toString);
    }

    private final void valueOf(ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.awaitTermination(1500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
        }
    }
}
