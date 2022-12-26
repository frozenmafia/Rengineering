package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingRegistry;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.endMetadataList;
import o.sizedByteArray;
/* loaded from: classes7.dex */
public final class MaybeTimeoutMaybe<T, U> extends sizedByteArray<T, T> {
    final SwipeRefreshLayout.SavedState<? extends T> valueOf;
    final SwipeRefreshLayout.SavedState<U> values;

    @Override // o.SwipeRefreshLayout.AnonymousClass8
    public void valueOf(IdlingRegistry<? super T> idlingRegistry) {
        TimeoutMainMaybeObserver timeoutMainMaybeObserver = new TimeoutMainMaybeObserver(idlingRegistry, this.valueOf);
        idlingRegistry.onSubscribe(timeoutMainMaybeObserver);
        this.values.ag$a(timeoutMainMaybeObserver.other);
        this.ag$a.ag$a(timeoutMainMaybeObserver);
    }

    /* loaded from: classes7.dex */
    static final class TimeoutMainMaybeObserver<T, U> extends AtomicReference<dataStart> implements IdlingRegistry<T>, dataStart {
        private static final long serialVersionUID = -5955289211445418871L;
        final IdlingRegistry<? super T> downstream;
        final SwipeRefreshLayout.SavedState<? extends T> fallback;
        final TimeoutOtherMaybeObserver<T, U> other = new TimeoutOtherMaybeObserver<>(this);
        final TimeoutFallbackMaybeObserver<T> otherObserver;

        TimeoutMainMaybeObserver(IdlingRegistry<? super T> idlingRegistry, SwipeRefreshLayout.SavedState<? extends T> savedState) {
            this.downstream = idlingRegistry;
            this.fallback = savedState;
            this.otherObserver = savedState != null ? new TimeoutFallbackMaybeObserver<>(idlingRegistry) : null;
        }

        @Override // o.dataStart
        public void dispose() {
            DisposableHelper.dispose(this);
            DisposableHelper.dispose(this.other);
            TimeoutFallbackMaybeObserver<T> timeoutFallbackMaybeObserver = this.otherObserver;
            if (timeoutFallbackMaybeObserver != null) {
                DisposableHelper.dispose(timeoutFallbackMaybeObserver);
            }
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

        public void otherError(Throwable th) {
            if (DisposableHelper.dispose(this)) {
                this.downstream.onError(th);
            } else {
                endMetadataList.valueOf(th);
            }
        }

        public void otherComplete() {
            if (DisposableHelper.dispose(this)) {
                SwipeRefreshLayout.SavedState<? extends T> savedState = this.fallback;
                if (savedState == null) {
                    this.downstream.onError(new TimeoutException());
                } else {
                    savedState.ag$a(this.otherObserver);
                }
            }
        }
    }

    /* loaded from: classes7.dex */
    static final class TimeoutOtherMaybeObserver<T, U> extends AtomicReference<dataStart> implements IdlingRegistry<Object> {
        private static final long serialVersionUID = 8663801314800248617L;
        final TimeoutMainMaybeObserver<T, U> parent;

        TimeoutOtherMaybeObserver(TimeoutMainMaybeObserver<T, U> timeoutMainMaybeObserver) {
            this.parent = timeoutMainMaybeObserver;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class TimeoutFallbackMaybeObserver<T> extends AtomicReference<dataStart> implements IdlingRegistry<T> {
        private static final long serialVersionUID = 8663801314800248617L;
        final IdlingRegistry<? super T> downstream;

        TimeoutFallbackMaybeObserver(IdlingRegistry<? super T> idlingRegistry) {
            this.downstream = idlingRegistry;
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
