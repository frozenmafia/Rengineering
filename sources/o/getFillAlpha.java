package o;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class getFillAlpha implements Executor {
    public final parseInterpolatorFromTypeArray ag$a;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.ag$a.dispatch(EmptyCoroutineContext.INSTANCE, runnable);
    }

    public String toString() {
        return this.ag$a.toString();
    }
}
