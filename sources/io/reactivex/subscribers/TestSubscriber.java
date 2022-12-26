package io.reactivex.subscribers;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.observers.BaseTestConsumer;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.SupportSQLiteOpenHelper;
import o.dependencies;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
/* loaded from: classes7.dex */
public class TestSubscriber<T> extends BaseTestConsumer<T, TestSubscriber<T>> implements SupportSQLiteOpenHelper<T>, getSidecarVersion {
    private dependencies<T> HaptikSDK$d;
    private final AtomicReference<getSidecarVersion> HaptikSDK$e;
    private final AtomicLong HaptikWebView;
    private final registerConfigurationChangeListener<? super T> ah$b;
    private volatile boolean invoke;

    /* loaded from: classes7.dex */
    enum EmptySubscriber implements SupportSQLiteOpenHelper<Object> {
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

        @Override // o.SupportSQLiteOpenHelper, o.registerConfigurationChangeListener
        public void onSubscribe(getSidecarVersion getsidecarversion) {
        }
    }

    protected void valueOf() {
    }

    public TestSubscriber() {
        this(EmptySubscriber.INSTANCE, Long.MAX_VALUE);
    }

    public TestSubscriber(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Negative initial request not allowed");
        }
        this.ah$b = registerconfigurationchangelistener;
        this.HaptikSDK$e = new AtomicReference<>();
        this.HaptikWebView = new AtomicLong(j);
    }

    @Override // o.SupportSQLiteOpenHelper, o.registerConfigurationChangeListener
    public void onSubscribe(getSidecarVersion getsidecarversion) {
        this.HaptikSDK$b = Thread.currentThread();
        if (getsidecarversion == null) {
            this.values.add(new NullPointerException("onSubscribe received a null Subscription"));
        } else if (!this.HaptikSDK$e.compareAndSet(null, getsidecarversion)) {
            getsidecarversion.cancel();
            if (this.HaptikSDK$e.get() != SubscriptionHelper.CANCELLED) {
                this.values.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + getsidecarversion));
            }
        } else {
            if (this.HaptikSDK$c != 0 && (getsidecarversion instanceof dependencies)) {
                dependencies<T> dependenciesVar = (dependencies) getsidecarversion;
                this.HaptikSDK$d = dependenciesVar;
                int requestFusion = dependenciesVar.requestFusion(this.HaptikSDK$c);
                this.ag$a = requestFusion;
                if (requestFusion == 1) {
                    this.ah$a = true;
                    this.HaptikSDK$b = Thread.currentThread();
                    while (true) {
                        try {
                            T poll = this.HaptikSDK$d.poll();
                            if (poll != null) {
                                this.HaptikSDK$a.add(poll);
                            } else {
                                this.valueOf++;
                                return;
                            }
                        } catch (Throwable th) {
                            this.values.add(th);
                            return;
                        }
                    }
                }
            }
            this.ah$b.onSubscribe(getsidecarversion);
            long andSet = this.HaptikWebView.getAndSet(0L);
            if (andSet != 0) {
                getsidecarversion.request(andSet);
            }
            valueOf();
        }
    }

    @Override // o.registerConfigurationChangeListener
    public void onNext(T t) {
        if (!this.ah$a) {
            this.ah$a = true;
            if (this.HaptikSDK$e.get() == null) {
                this.values.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.HaptikSDK$b = Thread.currentThread();
        if (this.ag$a != 2) {
            this.HaptikSDK$a.add(t);
            if (t == null) {
                this.values.add(new NullPointerException("onNext received a null value"));
            }
            this.ah$b.onNext(t);
            return;
        }
        while (true) {
            try {
                T poll = this.HaptikSDK$d.poll();
                if (poll == null) {
                    return;
                }
                this.HaptikSDK$a.add(poll);
            } catch (Throwable th) {
                this.values.add(th);
                this.HaptikSDK$d.cancel();
                return;
            }
        }
    }

    @Override // o.registerConfigurationChangeListener
    public void onError(Throwable th) {
        if (!this.ah$a) {
            this.ah$a = true;
            if (this.HaptikSDK$e.get() == null) {
                this.values.add(new NullPointerException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.HaptikSDK$b = Thread.currentThread();
            this.values.add(th);
            if (th == null) {
                this.values.add(new IllegalStateException("onError received a null Throwable"));
            }
            this.ah$b.onError(th);
        } finally {
            this.toString.countDown();
        }
    }

    @Override // o.registerConfigurationChangeListener
    public void onComplete() {
        if (!this.ah$a) {
            this.ah$a = true;
            if (this.HaptikSDK$e.get() == null) {
                this.values.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.HaptikSDK$b = Thread.currentThread();
            this.valueOf++;
            this.ah$b.onComplete();
        } finally {
            this.toString.countDown();
        }
    }

    @Override // o.getSidecarVersion
    public final void request(long j) {
        SubscriptionHelper.deferredRequest(this.HaptikSDK$e, this.HaptikWebView, j);
    }

    @Override // o.getSidecarVersion
    public final void cancel() {
        if (this.invoke) {
            return;
        }
        this.invoke = true;
        SubscriptionHelper.cancel(this.HaptikSDK$e);
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public final void dispose() {
        cancel();
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public final boolean isDisposed() {
        return this.invoke;
    }
}
