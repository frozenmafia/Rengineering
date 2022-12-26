package androidx.concurrent.futures;

import o.animateAddImpl;
/* loaded from: classes5.dex */
public final class ResolvableFuture<V> extends AbstractResolvableFuture<V> {
    public static <V> ResolvableFuture<V> create() {
        return new ResolvableFuture<>();
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean set(V v) {
        return super.set(v);
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean setException(Throwable th) {
        return super.setException(th);
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean setFuture(animateAddImpl<? extends V> animateaddimpl) {
        return super.setFuture(animateaddimpl);
    }

    private ResolvableFuture() {
    }
}
