package io.reactivex.rxjava3.subscribers;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.SwipeRefreshLayout;
import o.createListVector;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
/* loaded from: classes7.dex */
public class TestSubscriber<T> extends createListVector<T, TestSubscriber<T>> implements SwipeRefreshLayout.AnonymousClass5<T>, getSidecarVersion {
    private final AtomicLong HaptikSDK$a;
    private final AtomicReference<getSidecarVersion> HaptikSDK$b;
    private final registerConfigurationChangeListener<? super T> ah$b;
    private volatile boolean invoke;

    /* loaded from: classes7.dex */
    enum EmptySubscriber implements SwipeRefreshLayout.AnonymousClass5<Object> {
        INSTANCE;

        @Override // o.registerConfigurationChangeListener
        public void onComplete() {
        }

        @Override // o.registerConfigurationChangeListener
        public void onError(Throwable th) {
        }

        @Override // o.registerConfigurationChangeListener
        public void onNext(Object obj) {
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass5, o.registerConfigurationChangeListener
        public void onSubscribe(getSidecarVersion getsidecarversion) {
        }
    }

    protected void ag$a() {
    }

    public TestSubscriber() {
        this(EmptySubscriber.INSTANCE, Long.MAX_VALUE);
    }

    public TestSubscriber(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Negative initial request not allowed");
        }
        this.ah$b = registerconfigurationchangelistener;
        this.HaptikSDK$b = new AtomicReference<>();
        this.HaptikSDK$a = new AtomicLong(j);
    }

    @Override // o.SwipeRefreshLayout.AnonymousClass5, o.registerConfigurationChangeListener
    public void onSubscribe(getSidecarVersion getsidecarversion) {
        this.ag$a = Thread.currentThread();
        if (getsidecarversion == null) {
            this.values.add(new NullPointerException("onSubscribe received a null Subscription"));
        } else if (!this.HaptikSDK$b.compareAndSet(null, getsidecarversion)) {
            getsidecarversion.cancel();
            if (this.HaptikSDK$b.get() != SubscriptionHelper.CANCELLED) {
                List<Throwable> list = this.values;
                list.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + getsidecarversion));
            }
        } else {
            this.ah$b.onSubscribe(getsidecarversion);
            long andSet = this.HaptikSDK$a.getAndSet(0L);
            if (andSet != 0) {
                getsidecarversion.request(andSet);
            }
            ag$a();
        }
    }

    @Override // o.registerConfigurationChangeListener
    public void onNext(T t) {
        if (!this.valueOf) {
            this.valueOf = true;
            if (this.HaptikSDK$b.get() == null) {
                this.values.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.ag$a = Thread.currentThread();
        this.HaptikSDK$c.add(t);
        if (t == null) {
            this.values.add(new NullPointerException("onNext received a null value"));
        }
        this.ah$b.onNext(t);
    }

    @Override // o.registerConfigurationChangeListener
    public void onError(Throwable th) {
        if (!this.valueOf) {
            this.valueOf = true;
            if (this.HaptikSDK$b.get() == null) {
                this.values.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.ag$a = Thread.currentThread();
            if (th == null) {
                this.values.add(new NullPointerException("onError received a null Throwable"));
            } else {
                this.values.add(th);
            }
            this.ah$b.onError(th);
        } finally {
            this.toString.countDown();
        }
    }

    @Override // o.registerConfigurationChangeListener
    public void onComplete() {
        if (!this.valueOf) {
            this.valueOf = true;
            if (this.HaptikSDK$b.get() == null) {
                this.values.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.ag$a = Thread.currentThread();
            this.ah$a++;
            this.ah$b.onComplete();
        } finally {
            this.toString.countDown();
        }
    }

    @Override // o.getSidecarVersion
    public final void request(long j) {
        SubscriptionHelper.deferredRequest(this.HaptikSDK$b, this.HaptikSDK$a, j);
    }

    @Override // o.getSidecarVersion
    public final void cancel() {
        if (this.invoke) {
            return;
        }
        this.invoke = true;
        SubscriptionHelper.cancel(this.HaptikSDK$b);
    }
}
