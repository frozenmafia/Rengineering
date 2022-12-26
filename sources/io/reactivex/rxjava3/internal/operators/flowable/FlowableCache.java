package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.SwipeRefreshLayout;
import o.codepointsLength;
import o.endMetadataList;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
import o.required;
/* loaded from: classes7.dex */
public final class FlowableCache<T> extends required<T, T> implements SwipeRefreshLayout.AnonymousClass5<T> {
    Throwable HaptikSDK$a;
    final AtomicBoolean HaptikSDK$b;
    final toString<T> HaptikSDK$c;
    toString<T> HaptikSDK$d;
    int HaptikWebView;
    final int ah$a;
    volatile long ah$b;
    final AtomicReference<CacheSubscription<T>[]> getSignupData;
    volatile boolean invoke;
    static final CacheSubscription[] values = new CacheSubscription[0];
    static final CacheSubscription[] toString = new CacheSubscription[0];

    @Override // o.SwipeRefreshLayout.AnonymousClass2
    public void ag$a(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        CacheSubscription<T> cacheSubscription = new CacheSubscription<>(registerconfigurationchangelistener, this);
        registerconfigurationchangelistener.onSubscribe(cacheSubscription);
        ag$a(cacheSubscription);
        if (!this.HaptikSDK$b.get() && this.HaptikSDK$b.compareAndSet(false, true)) {
            this.ag$a.values(this);
        } else {
            ah$a(cacheSubscription);
        }
    }

    void ag$a(CacheSubscription<T> cacheSubscription) {
        CacheSubscription<T>[] cacheSubscriptionArr;
        CacheSubscription<T>[] cacheSubscriptionArr2;
        do {
            cacheSubscriptionArr = this.getSignupData.get();
            if (cacheSubscriptionArr == toString) {
                return;
            }
            int length = cacheSubscriptionArr.length;
            cacheSubscriptionArr2 = new CacheSubscription[length + 1];
            System.arraycopy(cacheSubscriptionArr, 0, cacheSubscriptionArr2, 0, length);
            cacheSubscriptionArr2[length] = cacheSubscription;
        } while (!this.getSignupData.compareAndSet(cacheSubscriptionArr, cacheSubscriptionArr2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    void toString(CacheSubscription<T> cacheSubscription) {
        CacheSubscription<T>[] cacheSubscriptionArr;
        CacheSubscription[] cacheSubscriptionArr2;
        do {
            cacheSubscriptionArr = this.getSignupData.get();
            int length = cacheSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (cacheSubscriptionArr[i2] == cacheSubscription) {
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
                cacheSubscriptionArr2 = values;
            } else {
                CacheSubscription[] cacheSubscriptionArr3 = new CacheSubscription[length - 1];
                System.arraycopy(cacheSubscriptionArr, 0, cacheSubscriptionArr3, 0, i);
                System.arraycopy(cacheSubscriptionArr, i + 1, cacheSubscriptionArr3, i, (length - i) - 1);
                cacheSubscriptionArr2 = cacheSubscriptionArr3;
            }
        } while (!this.getSignupData.compareAndSet(cacheSubscriptionArr, cacheSubscriptionArr2));
    }

    void ah$a(CacheSubscription<T> cacheSubscription) {
        if (cacheSubscription.getAndIncrement() != 0) {
            return;
        }
        long j = cacheSubscription.index;
        int i = cacheSubscription.offset;
        toString<T> tostring = cacheSubscription.node;
        AtomicLong atomicLong = cacheSubscription.requested;
        registerConfigurationChangeListener<? super T> registerconfigurationchangelistener = cacheSubscription.downstream;
        int i2 = this.ah$a;
        int i3 = 1;
        while (true) {
            boolean z = this.invoke;
            boolean z2 = this.ah$b == j;
            if (z && z2) {
                cacheSubscription.node = null;
                Throwable th = this.HaptikSDK$a;
                if (th != null) {
                    registerconfigurationchangelistener.onError(th);
                    return;
                } else {
                    registerconfigurationchangelistener.onComplete();
                    return;
                }
            }
            if (!z2) {
                long j2 = atomicLong.get();
                if (j2 == Long.MIN_VALUE) {
                    cacheSubscription.node = null;
                    return;
                } else if (j2 != j) {
                    if (i == i2) {
                        tostring = tostring.ag$a;
                        i = 0;
                    }
                    registerconfigurationchangelistener.onNext((Object) tostring.valueOf[i]);
                    i++;
                    j++;
                }
            }
            cacheSubscription.index = j;
            cacheSubscription.offset = i;
            cacheSubscription.node = tostring;
            i3 = cacheSubscription.addAndGet(-i3);
            if (i3 == 0) {
                return;
            }
        }
    }

    @Override // o.SwipeRefreshLayout.AnonymousClass5, o.registerConfigurationChangeListener
    public void onSubscribe(getSidecarVersion getsidecarversion) {
        getsidecarversion.request(Long.MAX_VALUE);
    }

    @Override // o.registerConfigurationChangeListener
    public void onNext(T t) {
        int i = this.HaptikWebView;
        if (i == this.ah$a) {
            toString<T> tostring = new toString<>(i);
            tostring.valueOf[0] = t;
            this.HaptikWebView = 1;
            this.HaptikSDK$d.ag$a = tostring;
            this.HaptikSDK$d = tostring;
        } else {
            this.HaptikSDK$d.valueOf[i] = t;
            this.HaptikWebView = i + 1;
        }
        this.ah$b++;
        for (CacheSubscription<T> cacheSubscription : this.getSignupData.get()) {
            ah$a(cacheSubscription);
        }
    }

    @Override // o.registerConfigurationChangeListener
    public void onError(Throwable th) {
        if (this.invoke) {
            endMetadataList.valueOf(th);
            return;
        }
        this.HaptikSDK$a = th;
        this.invoke = true;
        for (CacheSubscription<T> cacheSubscription : this.getSignupData.getAndSet(toString)) {
            ah$a(cacheSubscription);
        }
    }

    @Override // o.registerConfigurationChangeListener
    public void onComplete() {
        this.invoke = true;
        for (CacheSubscription<T> cacheSubscription : this.getSignupData.getAndSet(toString)) {
            ah$a(cacheSubscription);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class CacheSubscription<T> extends AtomicInteger implements getSidecarVersion {
        private static final long serialVersionUID = 6770240836423125754L;
        final registerConfigurationChangeListener<? super T> downstream;
        long index;
        toString<T> node;
        int offset;
        final FlowableCache<T> parent;
        final AtomicLong requested = new AtomicLong();

        CacheSubscription(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener, FlowableCache<T> flowableCache) {
            this.downstream = registerconfigurationchangelistener;
            this.parent = flowableCache;
            this.node = flowableCache.HaptikSDK$c;
        }

        @Override // o.getSidecarVersion
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                codepointsLength.ah$a(this.requested, j);
                this.parent.ah$a(this);
            }
        }

        @Override // o.getSidecarVersion
        public void cancel() {
            if (this.requested.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.toString(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class toString<T> {
        volatile toString<T> ag$a;
        final T[] valueOf;

        toString(int i) {
            this.valueOf = (T[]) new Object[i];
        }
    }
}
