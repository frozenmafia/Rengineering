package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;
import o.IdlingResource;
import o.dataStart;
import o.startObject;
/* loaded from: classes7.dex */
public final class ObservableTakeLast<T> extends startObject<T, T> {
    final int ah$a;

    @Override // o.SwipeRefreshLayout.SavedState.AnonymousClass1
    public void valueOf(IdlingResource<? super T> idlingResource) {
        this.valueOf.subscribe(new TakeLastObserver(idlingResource, this.ah$a));
    }

    /* loaded from: classes7.dex */
    static final class TakeLastObserver<T> extends ArrayDeque<T> implements IdlingResource<T>, dataStart {
        private static final long serialVersionUID = 7240042530241604978L;
        volatile boolean cancelled;
        final int count;
        final IdlingResource<? super T> downstream;
        dataStart upstream;

        TakeLastObserver(IdlingResource<? super T> idlingResource, int i) {
            this.downstream = idlingResource;
            this.count = i;
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
            if (this.count == size()) {
                poll();
            }
            offer(t);
        }

        @Override // o.IdlingResource
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.IdlingResource
        public void onComplete() {
            IdlingResource<? super T> idlingResource = this.downstream;
            while (!this.cancelled) {
                Object obj = (T) poll();
                if (obj == null) {
                    idlingResource.onComplete();
                    return;
                }
                idlingResource.onNext(obj);
            }
        }

        @Override // o.dataStart
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.dispose();
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return this.cancelled;
        }
    }
}
