package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingRegistry;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.endMetadataList;
import o.sizedByteArray;
/* loaded from: classes7.dex */
public final class MaybeTakeUntilMaybe<T, U> extends sizedByteArray<T, T> {
    final SwipeRefreshLayout.SavedState<U> valueOf;

    @Override // o.SwipeRefreshLayout.AnonymousClass8
    public void valueOf(IdlingRegistry<? super T> idlingRegistry) {
        TakeUntilMainMaybeObserver takeUntilMainMaybeObserver = new TakeUntilMainMaybeObserver(idlingRegistry);
        idlingRegistry.onSubscribe(takeUntilMainMaybeObserver);
        this.valueOf.ag$a(takeUntilMainMaybeObserver.other);
        this.ag$a.ag$a(takeUntilMainMaybeObserver);
    }

    /* loaded from: classes7.dex */
    static final class TakeUntilMainMaybeObserver<T, U> extends AtomicReference<dataStart> implements IdlingRegistry<T>, dataStart {
        private static final long serialVersionUID = -2187421758664251153L;
        final IdlingRegistry<? super T> downstream;
        final TakeUntilOtherMaybeObserver<U> other = new TakeUntilOtherMaybeObserver<>(this);

        TakeUntilMainMaybeObserver(IdlingRegistry<? super T> idlingRegistry) {
            this.downstream = idlingRegistry;
        }

        @Override // o.dataStart
        public void dispose() {
            DisposableHelper.dispose(this);
            DisposableHelper.dispose(this.other);
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
            DisposableHelper.dispose(this.other);
            if (getAndSet(DisposableHelper.DISPOSED) != DisposableHelper.DISPOSED) {
                this.downstream.onSuccess(t);
            }
        }

        @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
        public void onError(Throwable th) {
            DisposableHelper.dispose(this.other);
            if (getAndSet(DisposableHelper.DISPOSED) != DisposableHelper.DISPOSED) {
                this.downstream.onError(th);
            } else {
                endMetadataList.valueOf(th);
            }
        }

        @Override // o.IdlingRegistry
        public void onComplete() {
            DisposableHelper.dispose(this.other);
            if (getAndSet(DisposableHelper.DISPOSED) != DisposableHelper.DISPOSED) {
                this.downstream.onComplete();
            }
        }

        void otherError(Throwable th) {
            if (DisposableHelper.dispose(this)) {
                this.downstream.onError(th);
            } else {
                endMetadataList.valueOf(th);
            }
        }

        void otherComplete() {
            if (DisposableHelper.dispose(this)) {
                this.downstream.onComplete();
            }
        }

        /* loaded from: classes7.dex */
        static final class TakeUntilOtherMaybeObserver<U> extends AtomicReference<dataStart> implements IdlingRegistry<U> {
            private static final long serialVersionUID = -1266041316834525931L;
            final TakeUntilMainMaybeObserver<?, U> parent;

            TakeUntilOtherMaybeObserver(TakeUntilMainMaybeObserver<?, U> takeUntilMainMaybeObserver) {
                this.parent = takeUntilMainMaybeObserver;
            }

            @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
            public void onSubscribe(dataStart datastart) {
                DisposableHelper.setOnce(this, datastart);
            }

            @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
            public void onSuccess(Object obj) {
                this.parent.otherComplete();
            }

            @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
            public void onError(Throwable th) {
                this.parent.otherError(th);
            }

            @Override // o.IdlingRegistry
            public void onComplete() {
                this.parent.otherComplete();
            }
        }
    }
}
