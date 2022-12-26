package androidx.work.impl.utils.futures;

import o.animateAddImpl;
/* loaded from: classes.dex */
public final class SettableFuture<V> extends AbstractFuture<V> {
    public static <V> SettableFuture<V> create() {
        return new SettableFuture<>();
    }

    @Override // androidx.work.impl.utils.futures.AbstractFuture
    public boolean set(V v) {
        return super.set(v);
    }

    @Override // androidx.work.impl.utils.futures.AbstractFuture
    public boolean setException(Throwable th) {
        return super.setException(th);
    }

    @Override // androidx.work.impl.utils.futures.AbstractFuture
    public boolean setFuture(animateAddImpl<? extends V> animateaddimpl) {
        return super.setFuture(animateaddimpl);
    }

    private SettableFuture() {
    }
}
