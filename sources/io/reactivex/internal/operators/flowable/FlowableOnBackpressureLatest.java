package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.SimpleSQLiteQuery;
import o.SupportSQLiteOpenHelper;
import o.getArrowHeight;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
import o.startAlphaAnimation;
/* loaded from: classes5.dex */
public final class FlowableOnBackpressureLatest<T> extends getArrowHeight<T, T> {
    public FlowableOnBackpressureLatest(SimpleSQLiteQuery<T> simpleSQLiteQuery) {
        super(simpleSQLiteQuery);
    }

    @Override // o.SimpleSQLiteQuery
    public void values(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        this.valueOf.ah$a(new BackpressureLatestSubscriber(registerconfigurationchangelistener));
    }

    /* loaded from: classes5.dex */
    static final class BackpressureLatestSubscriber<T> extends AtomicInteger implements SupportSQLiteOpenHelper<T>, getSidecarVersion {
        private static final long serialVersionUID = 163080509307634843L;
        volatile boolean cancelled;
        volatile boolean done;
        final registerConfigurationChangeListener<? super T> downstream;
        Throwable error;
        getSidecarVersion upstream;
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<T> current = new AtomicReference<>();

        BackpressureLatestSubscriber(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
            this.downstream = registerconfigurationchangelistener;
        }

        @Override // o.SupportSQLiteOpenHelper, o.registerConfigurationChangeListener
        public void onSubscribe(getSidecarVersion getsidecarversion) {
            if (SubscriptionHelper.validate(this.upstream, getsidecarversion)) {
                this.upstream = getsidecarversion;
                this.downstream.onSubscribe(this);
                getsidecarversion.request(Long.MAX_VALUE);
            }
        }

        @Override // o.registerConfigurationChangeListener
        public void onNext(T t) {
            this.current.lazySet(t);
            drain();
        }

        @Override // o.registerConfigurationChangeListener
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // o.registerConfigurationChangeListener
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // o.getSidecarVersion
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                startAlphaAnimation.ag$a(this.requested, j);
                drain();
            }
        }

        @Override // o.getSidecarVersion
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.current.lazySet(null);
            }
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            registerConfigurationChangeListener<? super T> registerconfigurationchangelistener = this.downstream;
            AtomicLong atomicLong = this.requested;
            AtomicReference<T> atomicReference = this.current;
            int i = 1;
            do {
                long j = 0;
                while (true) {
                    if (j == atomicLong.get()) {
                        break;
                    }
                    boolean z = this.done;
                    Object obj = (T) atomicReference.getAndSet(null);
                    boolean z2 = obj == null;
                    if (checkTerminated(z, z2, registerconfigurationchangelistener, atomicReference)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    registerconfigurationchangelistener.onNext(obj);
                    j++;
                }
                if (j == atomicLong.get()) {
                    if (checkTerminated(this.done, atomicReference.get() == null, registerconfigurationchangelistener, atomicReference)) {
                        return;
                    }
                }
                if (j != 0) {
                    startAlphaAnimation.toString(atomicLong, j);
                }
                i = addAndGet(-i);
            } while (i != 0);
        }

        boolean checkTerminated(boolean z, boolean z2, registerConfigurationChangeListener<?> registerconfigurationchangelistener, AtomicReference<T> atomicReference) {
            if (this.cancelled) {
                atomicReference.lazySet(null);
                return true;
            } else if (z) {
                Throwable th = this.error;
                if (th != null) {
                    atomicReference.lazySet(null);
                    registerconfigurationchangelistener.onError(th);
                    return true;
                } else if (z2) {
                    registerconfigurationchangelistener.onComplete();
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}
