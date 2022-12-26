package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingRegistry;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.sizedByteArray;
/* loaded from: classes7.dex */
public final class MaybeSwitchIfEmpty<T> extends sizedByteArray<T, T> {
    final SwipeRefreshLayout.SavedState<? extends T> toString;

    @Override // o.SwipeRefreshLayout.AnonymousClass8
    public void valueOf(IdlingRegistry<? super T> idlingRegistry) {
        this.ag$a.ag$a(new SwitchIfEmptyMaybeObserver(idlingRegistry, this.toString));
    }

    /* loaded from: classes7.dex */
    static final class SwitchIfEmptyMaybeObserver<T> extends AtomicReference<dataStart> implements IdlingRegistry<T>, dataStart {
        private static final long serialVersionUID = -2223459372976438024L;
        final IdlingRegistry<? super T> downstream;
        final SwipeRefreshLayout.SavedState<? extends T> other;

        SwitchIfEmptyMaybeObserver(IdlingRegistry<? super T> idlingRegistry, SwipeRefreshLayout.SavedState<? extends T> savedState) {
            this.downstream = idlingRegistry;
            this.other = savedState;
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
            final IdlingRegistry<? super T> idlingRegistry = this.downstream;
            this.other.ag$a(new IdlingRegistry<T>(idlingRegistry, this) { // from class: io.reactivex.rxjava3.internal.operators.maybe.MaybeSwitchIfEmpty$SwitchIfEmptyMaybeObserver$ag$a
                final IdlingRegistry<? super T> ah$a;
                final AtomicReference<dataStart> toString;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.ah$a = idlingRegistry;
                    this.toString = this;
                }

                @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
                public void onSubscribe(dataStart datastart2) {
                    DisposableHelper.setOnce(this.toString, datastart2);
                }

                @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
                public void onSuccess(T t) {
                    this.ah$a.onSuccess(t);
                }

                @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
                public void onError(Throwable th) {
                    this.ah$a.onError(th);
                }

                @Override // o.IdlingRegistry
                public void onComplete() {
                    this.ah$a.onComplete();
                }
            });
        }
    }
}
