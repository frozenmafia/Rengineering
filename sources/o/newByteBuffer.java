package o;

import java.util.concurrent.atomic.AtomicBoolean;
import o.SwipeRefreshLayout;
/* loaded from: classes7.dex */
public final class newByteBuffer<T> extends SwipeRefreshLayout.SavedState.AnonymousClass1<T> {
    public final list<T> toString;
    final AtomicBoolean valueOf = new AtomicBoolean();

    public newByteBuffer(list<T> listVar) {
        this.toString = listVar;
    }

    @Override // o.SwipeRefreshLayout.SavedState.AnonymousClass1
    protected void valueOf(IdlingResource<? super T> idlingResource) {
        this.toString.subscribe(idlingResource);
        this.valueOf.set(true);
    }

    public boolean ah$a() {
        return !this.valueOf.get() && this.valueOf.compareAndSet(false, true);
    }
}
