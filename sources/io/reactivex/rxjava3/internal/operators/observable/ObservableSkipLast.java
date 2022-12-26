package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;
import o.IdlingResource;
import o.dataStart;
import o.startObject;
/* loaded from: classes7.dex */
public final class ObservableSkipLast<T> extends startObject<T, T> {
    final int toString;

    @Override // o.SwipeRefreshLayout.SavedState.AnonymousClass1
    public void valueOf(IdlingResource<? super T> idlingResource) {
        this.valueOf.subscribe(new SkipLastObserver(idlingResource, this.toString));
    }

    /* loaded from: classes7.dex */
    static final class SkipLastObserver<T> extends ArrayDeque<T> implements IdlingResource<T>, dataStart {
        private static final long serialVersionUID = -3807491841935125653L;
        final IdlingResource<? super T> downstream;
        final int skip;
        dataStart upstream;

        SkipLastObserver(IdlingResource<? super T> idlingResource, int i) {
            super(i);
            this.downstream = idlingResource;
            this.skip = i;
        }

        @Override // o.IdlingResource
        public void onSubscribe(dataStart datastart) {
            if (DisposableHelper.validate(this.upstream, datastart)) {
                this.upstream = datastart;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.dataStart
        public void dispose() {
            this.upstream.dispose();
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // o.IdlingResource
        public void onNext(T t) {
            if (this.skip == size()) {
                this.downstream.onNext((T) poll());
            }
            offer(t);
        }

        @Override // o.IdlingResource
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.IdlingResource
        public void onComplete() {
            this.downstream.onComplete();
        }
    }
}
