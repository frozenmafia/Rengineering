package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingResource;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.decrement;
import o.onTransitionToIdle;
import o.pad;
/* loaded from: classes7.dex */
public final class SingleDelayWithCompletable<T> extends onTransitionToIdle<T> {
    final SwipeRefreshLayout.AnonymousClass1 ag$a;
    final decrement<T> ah$a;

    @Override // o.onTransitionToIdle
    public void toString(IdlingResource.ResourceCallback<? super T> resourceCallback) {
        this.ag$a.values(new OtherObserver(resourceCallback, this.ah$a));
    }

    /* loaded from: classes7.dex */
    static final class OtherObserver<T> extends AtomicReference<dataStart> implements SwipeRefreshLayout.AnonymousClass3, dataStart {
        private static final long serialVersionUID = -8565274649390031272L;
        final IdlingResource.ResourceCallback<? super T> downstream;
        final decrement<T> source;

        OtherObserver(IdlingResource.ResourceCallback<? super T> resourceCallback, decrement<T> decrementVar) {
            this.downstream = resourceCallback;
            this.source = decrementVar;
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onSubscribe(dataStart datastart) {
            if (DisposableHelper.setOnce(this, datastart)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass3
        public void onComplete() {
            this.source.values(new pad(this, this.downstream));
        }

        @Override // o.dataStart
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }
    }
}
