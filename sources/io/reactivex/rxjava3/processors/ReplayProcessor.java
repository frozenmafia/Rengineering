package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.codepointsLength;
import o.endMetadataList;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
import o.startMetadataList;
/* loaded from: classes7.dex */
public final class ReplayProcessor<T> extends startMetadataList<T> {
    private static final Object[] HaptikSDK$a = new Object[0];
    static final ReplaySubscription[] toString = new ReplaySubscription[0];
    static final ReplaySubscription[] values = new ReplaySubscription[0];
    final AtomicReference<ReplaySubscription<T>[]> HaptikSDK$c;
    final values<T> ag$a;
    boolean ah$a;

    /* loaded from: classes7.dex */
    interface values<T> {
        void valueOf(Throwable th);

        void values();

        void values(ReplaySubscription<T> replaySubscription);

        void values(T t);
    }

    @Override // o.SwipeRefreshLayout.AnonymousClass2
    public void ag$a(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        ReplaySubscription<T> replaySubscription = new ReplaySubscription<>(registerconfigurationchangelistener, this);
        registerconfigurationchangelistener.onSubscribe(replaySubscription);
        if (ah$a(replaySubscription) && replaySubscription.cancelled) {
            toString(replaySubscription);
        } else {
            this.ag$a.values((ReplaySubscription) replaySubscription);
        }
    }

    @Override // o.registerConfigurationChangeListener
    public void onSubscribe(getSidecarVersion getsidecarversion) {
        if (this.ah$a) {
            getsidecarversion.cancel();
        } else {
            getsidecarversion.request(Long.MAX_VALUE);
        }
    }

    @Override // o.registerConfigurationChangeListener
    public void onNext(T t) {
        ExceptionHelper.valueOf(t, "onNext called with a null value.");
        if (this.ah$a) {
            return;
        }
        values<T> valuesVar = this.ag$a;
        valuesVar.values((values<T>) t);
        for (ReplaySubscription<T> replaySubscription : this.HaptikSDK$c.get()) {
            valuesVar.values((ReplaySubscription) replaySubscription);
        }
    }

    @Override // o.registerConfigurationChangeListener
    public void onError(Throwable th) {
        ExceptionHelper.valueOf(th, "onError called with a null Throwable.");
        if (this.ah$a) {
            endMetadataList.valueOf(th);
            return;
        }
        this.ah$a = true;
        values<T> valuesVar = this.ag$a;
        valuesVar.valueOf(th);
        for (ReplaySubscription<T> replaySubscription : this.HaptikSDK$c.getAndSet(values)) {
            valuesVar.values((ReplaySubscription) replaySubscription);
        }
    }

    @Override // o.registerConfigurationChangeListener
    public void onComplete() {
        if (this.ah$a) {
            return;
        }
        this.ah$a = true;
        values<T> valuesVar = this.ag$a;
        valuesVar.values();
        for (ReplaySubscription<T> replaySubscription : this.HaptikSDK$c.getAndSet(values)) {
            valuesVar.values((ReplaySubscription) replaySubscription);
        }
    }

    boolean ah$a(ReplaySubscription<T> replaySubscription) {
        ReplaySubscription<T>[] replaySubscriptionArr;
        ReplaySubscription<T>[] replaySubscriptionArr2;
        do {
            replaySubscriptionArr = this.HaptikSDK$c.get();
            if (replaySubscriptionArr == values) {
                return false;
            }
            int length = replaySubscriptionArr.length;
            replaySubscriptionArr2 = new ReplaySubscription[length + 1];
            System.arraycopy(replaySubscriptionArr, 0, replaySubscriptionArr2, 0, length);
            replaySubscriptionArr2[length] = replaySubscription;
        } while (!this.HaptikSDK$c.compareAndSet(replaySubscriptionArr, replaySubscriptionArr2));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void toString(ReplaySubscription<T> replaySubscription) {
        ReplaySubscription<T>[] replaySubscriptionArr;
        ReplaySubscription[] replaySubscriptionArr2;
        do {
            replaySubscriptionArr = this.HaptikSDK$c.get();
            if (replaySubscriptionArr == values || replaySubscriptionArr == toString) {
                return;
            }
            int length = replaySubscriptionArr.length;
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (replaySubscriptionArr[i2] == replaySubscription) {
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
                replaySubscriptionArr2 = toString;
            } else {
                ReplaySubscription[] replaySubscriptionArr3 = new ReplaySubscription[length - 1];
                System.arraycopy(replaySubscriptionArr, 0, replaySubscriptionArr3, 0, i);
                System.arraycopy(replaySubscriptionArr, i + 1, replaySubscriptionArr3, i, (length - i) - 1);
                replaySubscriptionArr2 = replaySubscriptionArr3;
            }
        } while (!this.HaptikSDK$c.compareAndSet(replaySubscriptionArr, replaySubscriptionArr2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class ReplaySubscription<T> extends AtomicInteger implements getSidecarVersion {
        private static final long serialVersionUID = 466549804534799122L;
        volatile boolean cancelled;
        final registerConfigurationChangeListener<? super T> downstream;
        long emitted;
        Object index;
        final AtomicLong requested = new AtomicLong();
        final ReplayProcessor<T> state;

        ReplaySubscription(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener, ReplayProcessor<T> replayProcessor) {
            this.downstream = registerconfigurationchangelistener;
            this.state = replayProcessor;
        }

        @Override // o.getSidecarVersion
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                codepointsLength.ag$a(this.requested, j);
                this.state.ag$a.values((ReplaySubscription) this);
            }
        }

        @Override // o.getSidecarVersion
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.state.toString(this);
        }
    }

    /* loaded from: classes7.dex */
    static final class Node<T> extends AtomicReference<Node<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final T value;

        Node(T t) {
            this.value = t;
        }
    }

    /* loaded from: classes7.dex */
    static final class TimedNode<T> extends AtomicReference<TimedNode<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final long time;
        final T value;

        TimedNode(T t, long j) {
            this.value = t;
            this.time = j;
        }
    }
}
