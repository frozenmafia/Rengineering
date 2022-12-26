package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import o.SwipeRefreshLayout;
import o.codepointsLength;
import o.finished;
import o.registerConfigurationChangeListener;
/* loaded from: classes7.dex */
public final class FlowableFromArray<T> extends SwipeRefreshLayout.AnonymousClass2<T> {
    final T[] toString;

    @Override // o.SwipeRefreshLayout.AnonymousClass2
    public void ag$a(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        if (registerconfigurationchangelistener instanceof finished) {
            registerconfigurationchangelistener.onSubscribe(new ArrayConditionalSubscription((finished) registerconfigurationchangelistener, this.toString));
        } else {
            registerconfigurationchangelistener.onSubscribe(new ArraySubscription(registerconfigurationchangelistener, this.toString));
        }
    }

    /* loaded from: classes7.dex */
    static abstract class BaseArraySubscription<T> extends BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        final T[] array;
        volatile boolean cancelled;
        int index;

        abstract void fastPath();

        @Override // o.notNested
        public final int requestFusion(int i) {
            return i & 1;
        }

        abstract void slowPath(long j);

        BaseArraySubscription(T[] tArr) {
            this.array = tArr;
        }

        @Override // o.putByte
        public final T poll() {
            int i = this.index;
            T[] tArr = this.array;
            if (i == tArr.length) {
                return null;
            }
            this.index = i + 1;
            T t = tArr[i];
            Objects.requireNonNull(t, "array element is null");
            return t;
        }

        @Override // o.putByte
        public final boolean isEmpty() {
            return this.index == this.array.length;
        }

        @Override // o.putByte
        public final void clear() {
            this.index = this.array.length;
        }

        @Override // o.getSidecarVersion
        public final void request(long j) {
            if (SubscriptionHelper.validate(j) && codepointsLength.ag$a(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    fastPath();
                } else {
                    slowPath(j);
                }
            }
        }

        @Override // o.getSidecarVersion
        public final void cancel() {
            this.cancelled = true;
        }
    }

    /* loaded from: classes7.dex */
    static final class ArraySubscription<T> extends BaseArraySubscription<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        final registerConfigurationChangeListener<? super T> downstream;

        ArraySubscription(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener, T[] tArr) {
            super(tArr);
            this.downstream = registerconfigurationchangelistener;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        void fastPath() {
            T[] tArr = this.array;
            int length = tArr.length;
            registerConfigurationChangeListener<? super T> registerconfigurationchangelistener = this.downstream;
            for (int i = this.index; i != length; i++) {
                if (this.cancelled) {
                    return;
                }
                T t = tArr[i];
                if (t == null) {
                    registerconfigurationchangelistener.onError(new NullPointerException("The element at index " + i + " is null"));
                    return;
                }
                registerconfigurationchangelistener.onNext(t);
            }
            if (this.cancelled) {
                return;
            }
            registerconfigurationchangelistener.onComplete();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        void slowPath(long j) {
            T[] tArr = this.array;
            int length = tArr.length;
            int i = this.index;
            registerConfigurationChangeListener<? super T> registerconfigurationchangelistener = this.downstream;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i == length) {
                        if (i == length) {
                            if (this.cancelled) {
                                return;
                            }
                            registerconfigurationchangelistener.onComplete();
                            return;
                        }
                        j = get();
                        if (j2 == j) {
                            this.index = i;
                            j = addAndGet(-j2);
                        }
                    } else if (this.cancelled) {
                        return;
                    } else {
                        T t = tArr[i];
                        if (t == null) {
                            registerconfigurationchangelistener.onError(new NullPointerException("The element at index " + i + " is null"));
                            return;
                        }
                        registerconfigurationchangelistener.onNext(t);
                        j2++;
                        i++;
                    }
                }
            } while (j != 0);
        }
    }

    /* loaded from: classes7.dex */
    static final class ArrayConditionalSubscription<T> extends BaseArraySubscription<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        final finished<? super T> downstream;

        ArrayConditionalSubscription(finished<? super T> finishedVar, T[] tArr) {
            super(tArr);
            this.downstream = finishedVar;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        void fastPath() {
            T[] tArr = this.array;
            int length = tArr.length;
            finished<? super T> finishedVar = this.downstream;
            for (int i = this.index; i != length; i++) {
                if (this.cancelled) {
                    return;
                }
                T t = tArr[i];
                if (t == null) {
                    finishedVar.onError(new NullPointerException("The element at index " + i + " is null"));
                    return;
                }
                finishedVar.tryOnNext(t);
            }
            if (this.cancelled) {
                return;
            }
            finishedVar.onComplete();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        void slowPath(long j) {
            T[] tArr = this.array;
            int length = tArr.length;
            int i = this.index;
            finished<? super T> finishedVar = this.downstream;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i == length) {
                        if (i == length) {
                            if (this.cancelled) {
                                return;
                            }
                            finishedVar.onComplete();
                            return;
                        }
                        j = get();
                        if (j2 == j) {
                            this.index = i;
                            j = addAndGet(-j2);
                        }
                    } else if (this.cancelled) {
                        return;
                    } else {
                        T t = tArr[i];
                        if (t == null) {
                            finishedVar.onError(new NullPointerException("The element at index " + i + " is null"));
                            return;
                        }
                        if (finishedVar.tryOnNext(t)) {
                            j2++;
                        }
                        i++;
                    }
                }
            } while (j != 0);
        }
    }
}
