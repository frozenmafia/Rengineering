package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingRegistry;
import o.IdlingResource;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.decrement;
import o.onTransitionToIdle;
/* loaded from: classes7.dex */
public final class MaybeSwitchIfEmptySingle<T> extends onTransitionToIdle<T> {
    final SwipeRefreshLayout.SavedState<T> ag$a;
    final decrement<? extends T> toString;

    @Override // o.onTransitionToIdle
    public void toString(IdlingResource.ResourceCallback<? super T> resourceCallback) {
        this.ag$a.ag$a(new SwitchIfEmptyMaybeObserver(resourceCallback, this.toString));
    }

    /* loaded from: classes7.dex */
    static final class SwitchIfEmptyMaybeObserver<T> extends AtomicReference<dataStart> implements IdlingRegistry<T>, dataStart {
        private static final long serialVersionUID = 4603919676453758899L;
        final IdlingResource.ResourceCallback<? super T> downstream;
        final decrement<? extends T> other;

        SwitchIfEmptyMaybeObserver(IdlingResource.ResourceCallback<? super T> resourceCallback, decrement<? extends T> decrementVar) {
            this.downstream = resourceCallback;
            this.other = decrementVar;
        }

        @Override // o.dataStart
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
        public void onSubscribe(dataStart datastart) {
            if (DisposableHelper.setOnce(this, datastart)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }

        @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.IdlingRegistry
        public void onComplete() {
            dataStart datastart = get();
            if (datastart == DisposableHelper.DISPOSED || !compareAndSet(datastart, null)) {
                return;
            }
            this.other.values(new valueOf(this.downstream, this));
        }

        /* loaded from: classes7.dex */
        static final class valueOf<T> implements IdlingResource.ResourceCallback<T> {
            final IdlingResource.ResourceCallback<? super T> valueOf;
            final AtomicReference<dataStart> values;

            valueOf(IdlingResource.ResourceCallback<? super T> resourceCallback, AtomicReference<dataStart> atomicReference) {
                this.valueOf = resourceCallback;
                this.values = atomicReference;
            }

            @Override // o.IdlingResource.ResourceCallback
            public void onSubscribe(dataStart datastart) {
                DisposableHelper.setOnce(this.values, datastart);
            }

            @Override // o.IdlingResource.ResourceCallback
            public void onSuccess(T t) {
                this.valueOf.onSuccess(t);
            }

            @Override // o.IdlingResource.ResourceCallback
            public void onError(Throwable th) {
                this.valueOf.onError(th);
            }
        }
    }
}
