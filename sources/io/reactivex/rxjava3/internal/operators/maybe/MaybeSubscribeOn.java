package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingRegistry;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.getLoopers;
import o.sizedByteArray;
/* loaded from: classes7.dex */
public final class MaybeSubscribeOn<T> extends sizedByteArray<T, T> {
    final getLoopers valueOf;

    @Override // o.SwipeRefreshLayout.AnonymousClass8
    public void valueOf(IdlingRegistry<? super T> idlingRegistry) {
        SubscribeOnMaybeObserver subscribeOnMaybeObserver = new SubscribeOnMaybeObserver(idlingRegistry);
        idlingRegistry.onSubscribe(subscribeOnMaybeObserver);
        subscribeOnMaybeObserver.task.replace(this.valueOf.values(new values(subscribeOnMaybeObserver, this.ag$a)));
    }

    /* loaded from: classes7.dex */
    static final class values<T> implements Runnable {
        final IdlingRegistry<? super T> toString;
        final SwipeRefreshLayout.SavedState<T> values;

        values(IdlingRegistry<? super T> idlingRegistry, SwipeRefreshLayout.SavedState<T> savedState) {
            this.toString = idlingRegistry;
            this.values = savedState;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.values.ag$a(this.toString);
        }
    }

    /* loaded from: classes7.dex */
    static final class SubscribeOnMaybeObserver<T> extends AtomicReference<dataStart> implements IdlingRegistry<T>, dataStart {
        private static final long serialVersionUID = 8571289934935992137L;
        final IdlingRegistry<? super T> downstream;
        final SequentialDisposable task = new SequentialDisposable();

        SubscribeOnMaybeObserver(IdlingRegistry<? super T> idlingRegistry) {
            this.downstream = idlingRegistry;
        }

        @Override // o.dataStart
        public void dispose() {
            DisposableHelper.dispose(this);
            this.task.dispose();
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
        public void onSubscribe(dataStart datastart) {
            DisposableHelper.setOnce(this, datastart);
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
            this.downstream.onComplete();
        }
    }
}
