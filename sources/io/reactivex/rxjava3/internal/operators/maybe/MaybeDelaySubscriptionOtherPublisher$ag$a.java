package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeDelaySubscriptionOtherPublisher;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import o.IdlingRegistry;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.endMetadataList;
import o.getSidecarVersion;
/* loaded from: classes7.dex */
final class MaybeDelaySubscriptionOtherPublisher$ag$a<T> implements SwipeRefreshLayout.AnonymousClass5<Object>, dataStart {
    final MaybeDelaySubscriptionOtherPublisher.DelayMaybeObserver<T> ag$a;
    SwipeRefreshLayout.SavedState<T> toString;
    getSidecarVersion values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MaybeDelaySubscriptionOtherPublisher$ag$a(IdlingRegistry<? super T> idlingRegistry, SwipeRefreshLayout.SavedState<T> savedState) {
        this.ag$a = new MaybeDelaySubscriptionOtherPublisher.DelayMaybeObserver<>(idlingRegistry);
        this.toString = savedState;
    }

    @Override // o.SwipeRefreshLayout.AnonymousClass5, o.registerConfigurationChangeListener
    public void onSubscribe(getSidecarVersion getsidecarversion) {
        if (SubscriptionHelper.validate(this.values, getsidecarversion)) {
            this.values = getsidecarversion;
            this.ag$a.downstream.onSubscribe(this);
            getsidecarversion.request(Long.MAX_VALUE);
        }
    }

    @Override // o.registerConfigurationChangeListener
    public void onNext(Object obj) {
        if (this.values != SubscriptionHelper.CANCELLED) {
            this.values.cancel();
            this.values = SubscriptionHelper.CANCELLED;
            valueOf();
        }
    }

    @Override // o.registerConfigurationChangeListener
    public void onError(Throwable th) {
        if (this.values != SubscriptionHelper.CANCELLED) {
            this.values = SubscriptionHelper.CANCELLED;
            this.ag$a.downstream.onError(th);
            return;
        }
        endMetadataList.valueOf(th);
    }

    @Override // o.registerConfigurationChangeListener
    public void onComplete() {
        if (this.values != SubscriptionHelper.CANCELLED) {
            this.values = SubscriptionHelper.CANCELLED;
            valueOf();
        }
    }

    void valueOf() {
        SwipeRefreshLayout.SavedState<T> savedState = this.toString;
        this.toString = null;
        savedState.ag$a(this.ag$a);
    }

    @Override // o.dataStart
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(this.ag$a.get());
    }

    @Override // o.dataStart
    public void dispose() {
        this.values.cancel();
        this.values = SubscriptionHelper.CANCELLED;
        DisposableHelper.dispose(this.ag$a);
    }
}
