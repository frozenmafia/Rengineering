package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import o.SwipeRefreshLayout;
import o.getSidecar;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
/* loaded from: classes7.dex */
public final class FlowableConcatArray<T> extends SwipeRefreshLayout.AnonymousClass2<T> {
    final getSidecar<? extends T>[] ah$a;
    final boolean values;

    @Override // o.SwipeRefreshLayout.AnonymousClass2
    public void ag$a(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        ConcatArraySubscriber concatArraySubscriber = new ConcatArraySubscriber(this.ah$a, this.values, registerconfigurationchangelistener);
        registerconfigurationchangelistener.onSubscribe(concatArraySubscriber);
        concatArraySubscriber.onComplete();
    }

    /* loaded from: classes7.dex */
    static final class ConcatArraySubscriber<T> extends SubscriptionArbiter implements SwipeRefreshLayout.AnonymousClass5<T> {
        private static final long serialVersionUID = -8158322871608889516L;
        final boolean delayError;
        final registerConfigurationChangeListener<? super T> downstream;
        List<Throwable> errors;
        int index;
        long produced;
        final getSidecar<? extends T>[] sources;
        final AtomicInteger wip;

        ConcatArraySubscriber(getSidecar<? extends T>[] getsidecarArr, boolean z, registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
            super(false);
            this.downstream = registerconfigurationchangelistener;
            this.sources = getsidecarArr;
            this.delayError = z;
            this.wip = new AtomicInteger();
        }

        @Override // o.SwipeRefreshLayout.AnonymousClass5, o.registerConfigurationChangeListener
        public void onSubscribe(getSidecarVersion getsidecarversion) {
            setSubscription(getsidecarversion);
        }

        @Override // o.registerConfigurationChangeListener
        public void onNext(T t) {
            this.produced++;
            this.downstream.onNext(t);
        }

        @Override // o.registerConfigurationChangeListener
        public void onError(Throwable th) {
            if (this.delayError) {
                List list = this.errors;
                if (list == null) {
                    list = new ArrayList((this.sources.length - this.index) + 1);
                    this.errors = list;
                }
                list.add(th);
                onComplete();
                return;
            }
            this.downstream.onError(th);
        }

        @Override // o.registerConfigurationChangeListener
        public void onComplete() {
            if (this.wip.getAndIncrement() == 0) {
                getSidecar<? extends T>[] getsidecarArr = this.sources;
                int length = getsidecarArr.length;
                int i = this.index;
                while (i != length) {
                    getSidecar<? extends T> getsidecar = getsidecarArr[i];
                    if (getsidecar == null) {
                        NullPointerException nullPointerException = new NullPointerException("A Publisher entry is null");
                        if (this.delayError) {
                            List list = this.errors;
                            if (list == null) {
                                list = new ArrayList((length - i) + 1);
                                this.errors = list;
                            }
                            list.add(nullPointerException);
                            i++;
                        } else {
                            this.downstream.onError(nullPointerException);
                            return;
                        }
                    } else {
                        long j = this.produced;
                        if (j != 0) {
                            this.produced = 0L;
                            produced(j);
                        }
                        getsidecar.subscribe(this);
                        i++;
                        this.index = i;
                        if (this.wip.decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
                List<Throwable> list2 = this.errors;
                if (list2 != null) {
                    if (list2.size() == 1) {
                        this.downstream.onError(list2.get(0));
                        return;
                    } else {
                        this.downstream.onError(new CompositeException(list2));
                        return;
                    }
                }
                this.downstream.onComplete();
            }
        }
    }
}
