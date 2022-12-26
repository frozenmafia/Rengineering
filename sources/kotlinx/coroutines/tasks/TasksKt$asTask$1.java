package kotlinx.coroutines.tasks;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getTargetByName;
import o.setAnimationMatrix;
/* loaded from: classes7.dex */
public final class TasksKt$asTask$1 extends Lambda implements Styleable.ChangeBounds<Throwable, setAnimationMatrix> {
    final /* synthetic */ CancellationTokenSource $cancellation;
    final /* synthetic */ TaskCompletionSource<T> $source;
    final /* synthetic */ getTargetByName<T> $this_asTask;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TasksKt$asTask$1(CancellationTokenSource cancellationTokenSource, getTargetByName<? extends T> gettargetbyname, TaskCompletionSource<T> taskCompletionSource) {
        super(1);
        this.$cancellation = cancellationTokenSource;
        this.$this_asTask = gettargetbyname;
        this.$source = taskCompletionSource;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(Throwable th) {
        invoke2(th);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        if (th instanceof CancellationException) {
            this.$cancellation.cancel();
            return;
        }
        Throwable q_ = this.$this_asTask.q_();
        if (q_ == null) {
            this.$source.setResult(this.$this_asTask.values());
            return;
        }
        TaskCompletionSource<T> taskCompletionSource = this.$source;
        RuntimeExecutionException runtimeExecutionException = q_ instanceof Exception ? (Exception) q_ : null;
        if (runtimeExecutionException == null) {
            runtimeExecutionException = new RuntimeExecutionException(q_);
        }
        taskCompletionSource.setException(runtimeExecutionException);
    }
}
