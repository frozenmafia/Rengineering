package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingRegistry;
import o.dataStart;
import o.getSidecar;
import o.sizedByteArray;
/* loaded from: classes7.dex */
public final class MaybeDelaySubscriptionOtherPublisher<T, U> extends sizedByteArray<T, T> {
    final getSidecar<U> valueOf;

    @Override // o.SwipeRefreshLayout.AnonymousClass8
    public void valueOf(IdlingRegistry<? super T> idlingRegistry) {
        this.valueOf.subscribe(new MaybeDelaySubscriptionOtherPublisher$ag$a(idlingRegistry, this.ag$a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class DelayMaybeObserver<T> extends AtomicReference<dataStart> implements IdlingRegistry<T> {
        private static final long serialVersionUID = 706635022205076709L;
        final IdlingRegistry<? super T> downstream;

        /* JADX INFO: Access modifiers changed from: package-private */
        public DelayMaybeObserver(IdlingRegistry<? super T> idlingRegistry) {
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
