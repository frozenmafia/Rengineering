package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.endMetadataList;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
import o.startMetadataList;
/* loaded from: classes7.dex */
public final class AsyncProcessor<T> extends startMetadataList<T> {
    static final AsyncSubscription[] toString = new AsyncSubscription[0];
    static final AsyncSubscription[] values = new AsyncSubscription[0];
    Throwable ag$a;
    final AtomicReference<AsyncSubscription<T>[]> ah$a = new AtomicReference<>(toString);
    T ah$b;

    AsyncProcessor() {
    }

    @Override // o.registerConfigurationChangeListener
    public void onSubscribe(getSidecarVersion getsidecarversion) {
        if (this.ah$a.get() == values) {
            getsidecarversion.cancel();
        } else {
            getsidecarversion.request(Long.MAX_VALUE);
        }
    }

    @Override // o.registerConfigurationChangeListener
    public void onNext(T t) {
        ExceptionHelper.valueOf(t, "onNext called with a null value.");
        if (this.ah$a.get() == values) {
            return;
        }
        this.ah$b = t;
    }

    @Override // o.registerConfigurationChangeListener
    public void onError(Throwable th) {
        ExceptionHelper.valueOf(th, "onError called with a null Throwable.");
        AsyncSubscription<T>[] asyncSubscriptionArr = this.ah$a.get();
        AsyncSubscription<T>[] asyncSubscriptionArr2 = values;
        if (asyncSubscriptionArr == asyncSubscriptionArr2) {
            endMetadataList.valueOf(th);
            return;
        }
        this.ah$b = null;
        this.ag$a = th;
        for (AsyncSubscription<T> asyncSubscription : this.ah$a.getAndSet(asyncSubscriptionArr2)) {
            asyncSubscription.onError(th);
        }
    }

    @Override // o.registerConfigurationChangeListener
    public void onComplete() {
        AsyncSubscription<T>[] asyncSubscriptionArr = this.ah$a.get();
        AsyncSubscription<T>[] asyncSubscriptionArr2 = values;
        if (asyncSubscriptionArr == asyncSubscriptionArr2) {
            return;
        }
        T t = this.ah$b;
        AsyncSubscription<T>[] andSet = this.ah$a.getAndSet(asyncSubscriptionArr2);
        int i = 0;
        if (t == null) {
            int length = andSet.length;
            while (i < length) {
                andSet[i].onComplete();
                i++;
            }
            return;
        }
        int length2 = andSet.length;
        while (i < length2) {
            andSet[i].complete(t);
            i++;
        }
    }

    @Override // o.SwipeRefreshLayout.AnonymousClass2
    public void ag$a(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        AsyncSubscription<T> asyncSubscription = new AsyncSubscription<>(registerconfigurationchangelistener, this);
        registerconfigurationchangelistener.onSubscribe(asyncSubscription);
        if (toString(asyncSubscription)) {
            if (asyncSubscription.isCancelled()) {
                values(asyncSubscription);
                return;
            }
            return;
        }
        Throwable th = this.ag$a;
        if (th != null) {
            registerconfigurationchangelistener.onError(th);
            return;
        }
        T t = this.ah$b;
        if (t != null) {
            asyncSubscription.complete(t);
        } else {
            asyncSubscription.onComplete();
        }
    }

    boolean toString(AsyncSubscription<T> asyncSubscription) {
        AsyncSubscription<T>[] asyncSubscriptionArr;
        AsyncSubscription<T>[] asyncSubscriptionArr2;
        do {
            asyncSubscriptionArr = this.ah$a.get();
            if (asyncSubscriptionArr == values) {
                return false;
            }
            int length = asyncSubscriptionArr.length;
            asyncSubscriptionArr2 = new AsyncSubscription[length + 1];
            System.arraycopy(asyncSubscriptionArr, 0, asyncSubscriptionArr2, 0, length);
            asyncSubscriptionArr2[length] = asyncSubscription;
        } while (!this.ah$a.compareAndSet(asyncSubscriptionArr, asyncSubscriptionArr2));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void values(AsyncSubscription<T> asyncSubscription) {
        AsyncSubscription<T>[] asyncSubscriptionArr;
        AsyncSubscription[] asyncSubscriptionArr2;
        do {
            asyncSubscriptionArr = this.ah$a.get();
            int length = asyncSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (asyncSubscriptionArr[i2] == asyncSubscription) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                asyncSubscriptionArr2 = toString;
            } else {
                AsyncSubscription[] asyncSubscriptionArr3 = new AsyncSubscription[length - 1];
                System.arraycopy(asyncSubscriptionArr, 0, asyncSubscriptionArr3, 0, i);
                System.arraycopy(asyncSubscriptionArr, i + 1, asyncSubscriptionArr3, i, (length - i) - 1);
                asyncSubscriptionArr2 = asyncSubscriptionArr3;
            }
        } while (!this.ah$a.compareAndSet(asyncSubscriptionArr, asyncSubscriptionArr2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class AsyncSubscription<T> extends DeferredScalarSubscription<T> {
        private static final long serialVersionUID = 5629876084736248016L;
        final AsyncProcessor<T> parent;

        AsyncSubscription(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener, AsyncProcessor<T> asyncProcessor) {
            super(registerconfigurationchangelistener);
            this.parent = asyncProcessor;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, o.getSidecarVersion
        public void cancel() {
            if (super.tryCancel()) {
                this.parent.values(this);
            }
        }

        void onComplete() {
            if (isCancelled()) {
                return;
            }
            this.downstream.onComplete();
        }

        void onError(Throwable th) {
            if (isCancelled()) {
                endMetadataList.valueOf(th);
            } else {
                this.downstream.onError(th);
            }
        }
    }
}
