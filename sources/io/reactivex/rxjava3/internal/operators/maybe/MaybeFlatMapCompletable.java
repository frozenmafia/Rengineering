package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import o.FlatBufferBuilder;
import o.IdlingRegistry;
import o.SwipeRefreshLayout;
import o.addOffset;
import o.dataStart;
import o.setSlingshotDistance;
/* loaded from: classes7.dex */
public final class MaybeFlatMapCompletable<T> extends setSlingshotDistance {
    final addOffset<? super T, ? extends SwipeRefreshLayout.AnonymousClass1> ag$a;
    final SwipeRefreshLayout.SavedState<T> valueOf;

    @Override // o.setSlingshotDistance
    public void ag$a(SwipeRefreshLayout.AnonymousClass3 anonymousClass3) {
        FlatMapCompletableObserver flatMapCompletableObserver = new FlatMapCompletableObserver(anonymousClass3, this.ag$a);
        anonymousClass3.onSubscribe(flatMapCompletableObserver);
        this.valueOf.ag$a(flatMapCompletableObserver);
    }

    /* loaded from: classes7.dex */
    static final class FlatMapCompletableObserver<T> extends AtomicReference<dataStart> implements IdlingRegistry<T>, SwipeRefreshLayout.AnonymousClass3, dataStart {
        private static final long serialVersionUID = -2177128922851101253L;
        final SwipeRefreshLayout.AnonymousClass3 downstream;
        final addOffset<? super T, ? extends SwipeRefreshLayout.AnonymousClass1> mapper;

        FlatMapCompletableObserver(SwipeRefreshLayout.AnonymousClass3 anonymousClass3, addOffset<? super T, ? extends SwipeRefreshLayout.AnonymousClass1> addoffset) {
            this.downstream = anonymousClass3;
            this.mapper = addoffset;
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
            DisposableHelper.replace(this, datastart);
        }

        @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
        public void onSuccess(T t) {
            try {
                SwipeRefreshLayout.AnonymousClass1 apply = this.mapper.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                SwipeRefreshLayout.AnonymousClass1 anonymousClass1 = apply;
                if (isDisposed()) {
                    return;
                }
                anonymousClass1.values(this);
            } catch (Throwable th) {
                FlatBufferBuilder.ah$a(th);
                onError(th);
            }
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
