package androidx.work;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Result$ah$a;
import o.animateAddImpl;
import o.createInterpolatorFromXml;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ListenableFutureKt$await$2$1 implements Runnable {
    final /* synthetic */ createInterpolatorFromXml<R> $cancellableContinuation;
    final /* synthetic */ animateAddImpl<R> $this_await;

    /* JADX WARN: Multi-variable type inference failed */
    public ListenableFutureKt$await$2$1(createInterpolatorFromXml<? super R> createinterpolatorfromxml, animateAddImpl<R> animateaddimpl) {
        this.$cancellableContinuation = createinterpolatorfromxml;
        this.$this_await = animateaddimpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Object obj = this.$this_await.get();
            Result$ah$a result$ah$a = Result.Companion;
            this.$cancellableContinuation.resumeWith(Result.m1233constructorimpl(obj));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            if (th instanceof CancellationException) {
                this.$cancellableContinuation.toString(cause);
                return;
            }
            Result$ah$a result$ah$a2 = Result.Companion;
            this.$cancellableContinuation.resumeWith(Result.m1233constructorimpl(runAnimators.ag$a(cause, "exception")));
        }
    }
}
