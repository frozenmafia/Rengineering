package o;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.SwipeRefreshLayout;
/* loaded from: classes7.dex */
public abstract class listLength<T> implements SwipeRefreshLayout.AnonymousClass5<T>, dataStart {
    final AtomicReference<getSidecarVersion> ah$b = new AtomicReference<>();

    @Override // o.SwipeRefreshLayout.AnonymousClass5, o.registerConfigurationChangeListener
    public final void onSubscribe(getSidecarVersion getsidecarversion) {
        if (__assign.values(this.ah$b, getsidecarversion, getClass())) {
            ag$a();
        }
    }

    protected void ag$a() {
        this.ah$b.get().request(Long.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void values() {
        dispose();
    }

    @Override // o.dataStart
    public final boolean isDisposed() {
        return this.ah$b.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // o.dataStart
    public final void dispose() {
        SubscriptionHelper.cancel(this.ah$b);
    }
}
