package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeDelayOtherPublisher;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import o.IdlingRegistry;
import o.dataStart;
import o.getSidecar;
/* loaded from: classes7.dex */
final class MaybeDelayOtherPublisher$ah$a<T, U> implements IdlingRegistry<T>, dataStart {
    final MaybeDelayOtherPublisher.OtherSubscriber<T> ah$a;
    dataStart valueOf;
    final getSidecar<U> values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MaybeDelayOtherPublisher$ah$a(IdlingRegistry<? super T> idlingRegistry, getSidecar<U> getsidecar) {
        this.ah$a = new MaybeDelayOtherPublisher.OtherSubscriber<>(idlingRegistry);
        this.values = getsidecar;
    }

    @Override // o.dataStart
    public void dispose() {
        this.valueOf.dispose();
        this.valueOf = DisposableHelper.DISPOSED;
        SubscriptionHelper.cancel(this.ah$a);
    }

    @Override // o.dataStart
    public boolean isDisposed() {
        return this.ah$a.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
    public void onSubscribe(dataStart datastart) {
        if (DisposableHelper.validate(this.valueOf, datastart)) {
            this.valueOf = datastart;
            this.ah$a.downstream.onSubscribe(this);
        }
    }

    @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
    public void onSuccess(T t) {
        this.valueOf = DisposableHelper.DISPOSED;
        this.ah$a.value = t;
        valueOf();
    }

    @Override // o.IdlingRegistry, o.IdlingResource.ResourceCallback
    public void onError(Throwable th) {
        this.valueOf = DisposableHelper.DISPOSED;
        this.ah$a.error = th;
        valueOf();
    }

    @Override // o.IdlingRegistry
    public void onComplete() {
        this.valueOf = DisposableHelper.DISPOSED;
        valueOf();
    }

    void valueOf() {
        this.values.subscribe(this.ah$a);
    }
}
