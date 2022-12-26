package o;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import o.DefaultSpecialEffectsController;
/* loaded from: classes4.dex */
public final class postponePostponableTransactions<T> {
    private CountDownLatch ag$a;
    private T valueOf;

    public final T values() {
        ah$a();
        return this.valueOf;
    }

    public postponePostponableTransactions(final Callable<T> callable) {
        runAnimators.ag$a(callable, "callable");
        this.ag$a = new CountDownLatch(1);
        DefaultSpecialEffectsController.AnonymousClass8 anonymousClass8 = DefaultSpecialEffectsController.AnonymousClass8.values;
        DefaultSpecialEffectsController.AnonymousClass8.HaptikWebView().execute(new FutureTask(new Callable() { // from class: o.startPendingDeferredFragments
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void values;
                values = postponePostponableTransactions.values(postponePostponableTransactions.this, callable);
                return values;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void values(postponePostponableTransactions postponepostponabletransactions, Callable callable) {
        runAnimators.ag$a(postponepostponabletransactions, "this$0");
        runAnimators.ag$a(callable, "$callable");
        try {
            postponepostponabletransactions.valueOf = (T) callable.call();
        } finally {
            CountDownLatch countDownLatch = postponepostponabletransactions.ag$a;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }

    private final void ah$a() {
        CountDownLatch countDownLatch = this.ag$a;
        if (countDownLatch == null) {
            return;
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
        }
    }
}
