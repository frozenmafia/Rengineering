package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingResource;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.registerLooperAsIdlingResource;
/* loaded from: classes7.dex */
public final class CompletableAndThenObservable<R> extends SwipeRefreshLayout.SavedState.AnonymousClass1<R> {
    final registerLooperAsIdlingResource<? extends R> ah$a;
    final SwipeRefreshLayout.AnonymousClass1 valueOf;

    @Override // o.SwipeRefreshLayout.SavedState.AnonymousClass1
    public void valueOf(IdlingResource<? super R> idlingResource) {
        AndThenObservableObserver andThenObservableObserver = new AndThenObservableObserver(idlingResource, this.ah$a);
        idlingResource.onSubscribe(andThenObservableObserver);
        this.valueOf.values(andThenObservableObserver);
    }

    /* loaded from: classes7.dex */
    static final class AndThenObservableObserver<R> extends AtomicReference<dataStart> implements IdlingResource<R>, SwipeRefreshLayout.AnonymousClass3, dataStart {
        private static final long serialVersionUID = -8948264376121066672L;
        final IdlingResource<? super R> downstream;
        registerLooperAsIdlingResource<? extends R> other;

        AndThenObservableObserver(IdlingResource<? super R> idlingResource, registerLooperAsIdlingResource<? extends R> registerlooperasidlingresource) {
            this.other = registerlooperasidlingresource;
            this.downstream = idlingResource;
        }

        @Override // o.IdlingResource
        public void onNext(R r) {
            this.downstream.onNext(r);
        }

        @Override // o.IdlingResource
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.IdlingResource
        public void onComplete() {
            registerLooperAsIdlingResource<? extends R> registerlooperasidlingresource = this.other;
            if (registerlooperasidlingresource == null) {
                this.downstream.onComplete();
                return;
            }
            this.other = null;
            registerlooperasidlingresource.subscribe(this);
        }

        @Override // o.dataStart
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // o.IdlingResource
        public void onSubscribe(dataStart datastart) {
            DisposableHelper.replace(this, datastart);
        }
    }
}
