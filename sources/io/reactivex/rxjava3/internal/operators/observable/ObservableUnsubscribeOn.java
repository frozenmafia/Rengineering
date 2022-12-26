package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.observable.ObservableUnsubscribeOn;
import java.util.concurrent.atomic.AtomicBoolean;
import o.IdlingResource;
import o.dataStart;
import o.endMetadataList;
import o.getLoopers;
import o.startObject;
/* loaded from: classes7.dex */
public final class ObservableUnsubscribeOn<T> extends startObject<T, T> {
    final getLoopers values;

    @Override // o.SwipeRefreshLayout.SavedState.AnonymousClass1
    public void valueOf(IdlingResource<? super T> idlingResource) {
        this.valueOf.subscribe(new UnsubscribeObserver(idlingResource, this.values));
    }

    /* loaded from: classes7.dex */
    static final class UnsubscribeObserver<T> extends AtomicBoolean implements IdlingResource<T>, dataStart {
        private static final long serialVersionUID = 1015244841293359600L;
        final IdlingResource<? super T> downstream;
        final getLoopers scheduler;
        dataStart upstream;

        UnsubscribeObserver(IdlingResource<? super T> idlingResource, getLoopers getloopers) {
            this.downstream = idlingResource;
            this.scheduler = getloopers;
        }

        @Override // o.IdlingResource
        public void onSubscribe(dataStart datastart) {
            if (DisposableHelper.validate(this.upstream, datastart)) {
                this.upstream = datastart;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.IdlingResource
        public void onNext(T t) {
            if (get()) {
                return;
            }
            this.downstream.onNext(t);
        }

        @Override // o.IdlingResource
        public void onError(Throwable th) {
            if (get()) {
                endMetadataList.valueOf(th);
            } else {
                this.downstream.onError(th);
            }
        }

        @Override // o.IdlingResource
        public void onComplete() {
            if (get()) {
                return;
            }
            this.downstream.onComplete();
        }

        @Override // o.dataStart
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.scheduler.values(new Runnable() { // from class: io.reactivex.rxjava3.internal.operators.observable.ObservableUnsubscribeOn$UnsubscribeObserver$ag$a
                    @Override // java.lang.Runnable
                    public void run() {
                        ObservableUnsubscribeOn.UnsubscribeObserver.this.upstream.dispose();
                    }
                });
            }
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return get();
        }
    }
}
