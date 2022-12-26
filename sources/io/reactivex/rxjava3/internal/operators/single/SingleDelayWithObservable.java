package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingResource;
import o.dataStart;
import o.decrement;
import o.endMetadataList;
import o.onTransitionToIdle;
import o.pad;
import o.registerLooperAsIdlingResource;
/* loaded from: classes7.dex */
public final class SingleDelayWithObservable<T, U> extends onTransitionToIdle<T> {
    final decrement<T> ah$a;
    final registerLooperAsIdlingResource<U> valueOf;

    @Override // o.onTransitionToIdle
    public void toString(IdlingResource.ResourceCallback<? super T> resourceCallback) {
        this.valueOf.subscribe(new OtherSubscriber(resourceCallback, this.ah$a));
    }

    /* loaded from: classes7.dex */
    static final class OtherSubscriber<T, U> extends AtomicReference<dataStart> implements IdlingResource<U>, dataStart {
        private static final long serialVersionUID = -8565274649390031272L;
        boolean done;
        final IdlingResource.ResourceCallback<? super T> downstream;
        final decrement<T> source;

        OtherSubscriber(IdlingResource.ResourceCallback<? super T> resourceCallback, decrement<T> decrementVar) {
            this.downstream = resourceCallback;
            this.source = decrementVar;
        }

        @Override // o.IdlingResource
        public void onSubscribe(dataStart datastart) {
            if (DisposableHelper.setOnce(this, datastart)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.IdlingResource
        public void onNext(U u) {
            get().dispose();
            onComplete();
        }

        @Override // o.IdlingResource
        public void onError(Throwable th) {
            if (this.done) {
                endMetadataList.valueOf(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
        }

        @Override // o.IdlingResource
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
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
