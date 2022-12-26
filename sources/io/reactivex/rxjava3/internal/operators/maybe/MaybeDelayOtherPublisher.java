package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingRegistry;
import o.SwipeRefreshLayout;
import o.getSidecar;
import o.getSidecarVersion;
import o.sizedByteArray;
/* loaded from: classes7.dex */
public final class MaybeDelayOtherPublisher<T, U> extends sizedByteArray<T, T> {
    final getSidecar<U> ah$a;

    @Override // o.SwipeRefreshLayout.AnonymousClass8
    public void valueOf(IdlingRegistry<? super T> idlingRegistry) {
        this.ag$a.ag$a(new MaybeDelayOtherPublisher$ah$a(idlingRegistry, this.ah$a));
    }

    /* loaded from: classes7.dex */
    static final class OtherSubscriber<T> extends AtomicReference<getSidecarVersion> implements SwipeRefreshLayout.AnonymousClass5<Object> {
        private static final long serialVersionUID = -1215060610805418006L;
        final IdlingRegistry<? super T> downstream;
        Throwable error;
        T value;

        /* JADX INFO: Access modifiers changed from: package-private */
        public OtherSubscriber(IdlingRegistry<? super T> idlingRegistry) {
            this.downstream = idlingRegistry;
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass5, o.registerConfigurationChangeListener
        public void onSubscribe(getSidecarVersion getsidecarversion) {
            SubscriptionHelper.setOnce(this, getsidecarversion, Long.MAX_VALUE);
        }

        @Override // o.registerConfigurationChangeListener
        public void onNext(Object obj) {
            getSidecarVersion getsidecarversion = get();
            if (getsidecarversion != SubscriptionHelper.CANCELLED) {
                lazySet(SubscriptionHelper.CANCELLED);
                getsidecarversion.cancel();
                onComplete();
            }
        }

        @Override // o.registerConfigurationChangeListener
        public void onError(Throwable th) {
            Throwable th2 = this.error;
            if (th2 == null) {
                this.downstream.onError(th);
            } else {
                this.downstream.onError(new CompositeException(th2, th));
            }
        }

        @Override // o.registerConfigurationChangeListener
        public void onComplete() {
            Throwable th = this.error;
            if (th != null) {
                this.downstream.onError(th);
                return;
            }
            T t = this.value;
            if (t != null) {
                this.downstream.onSuccess(t);
            } else {
                this.downstream.onComplete();
            }
        }
    }
}
