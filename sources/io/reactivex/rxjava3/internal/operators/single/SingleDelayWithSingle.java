package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingResource;
import o.dataStart;
import o.decrement;
import o.onTransitionToIdle;
import o.pad;
/* loaded from: classes7.dex */
public final class SingleDelayWithSingle<T, U> extends onTransitionToIdle<T> {
    final decrement<U> ah$a;
    final decrement<T> toString;

    @Override // o.onTransitionToIdle
    public void toString(IdlingResource.ResourceCallback<? super T> resourceCallback) {
        this.ah$a.values(new OtherObserver(resourceCallback, this.toString));
    }

    /* loaded from: classes7.dex */
    static final class OtherObserver<T, U> extends AtomicReference<dataStart> implements IdlingResource.ResourceCallback<U>, dataStart {
        private static final long serialVersionUID = -8565274649390031272L;
        final IdlingResource.ResourceCallback<? super T> downstream;
        final decrement<T> source;

        OtherObserver(IdlingResource.ResourceCallback<? super T> resourceCallback, decrement<T> decrementVar) {
            this.downstream = resourceCallback;
            this.source = decrementVar;
        }

        @Override // o.IdlingResource.ResourceCallback
        public void onSubscribe(dataStart datastart) {
            if (DisposableHelper.setOnce(this, datastart)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.IdlingResource.ResourceCallback
        public void onSuccess(U u) {
            this.source.values(new pad(this, this.downstream));
        }

        @Override // o.IdlingResource.ResourceCallback
        public void onError(Throwable th) {
            this.downstream.onError(th);
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
