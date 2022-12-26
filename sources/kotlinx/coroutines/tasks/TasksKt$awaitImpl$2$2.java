package kotlinx.coroutines.tasks;

import com.google.android.gms.tasks.CancellationTokenSource;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes7.dex */
public final class TasksKt$awaitImpl$2$2 extends Lambda implements Styleable.ChangeBounds<Throwable, setAnimationMatrix> {
    final /* synthetic */ CancellationTokenSource $cancellationTokenSource;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TasksKt$awaitImpl$2$2(CancellationTokenSource cancellationTokenSource) {
        super(1);
        this.$cancellationTokenSource = cancellationTokenSource;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(Throwable th) {
        invoke2(th);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.$cancellationTokenSource.cancel();
    }
}
