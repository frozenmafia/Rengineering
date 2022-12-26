package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import o.SwipeRefreshLayout;
import o.codepointsLength;
import o.finished;
import o.registerConfigurationChangeListener;
/* loaded from: classes7.dex */
public final class FlowableRange extends SwipeRefreshLayout.AnonymousClass2<Integer> {
    final int ah$a;
    final int values;

    @Override // o.SwipeRefreshLayout.AnonymousClass2
    public void ag$a(registerConfigurationChangeListener<? super Integer> registerconfigurationchangelistener) {
        if (registerconfigurationchangelistener instanceof finished) {
            registerconfigurationchangelistener.onSubscribe(new RangeConditionalSubscription((finished) registerconfigurationchangelistener, this.ah$a, this.values));
        } else {
            registerconfigurationchangelistener.onSubscribe(new RangeSubscription(registerconfigurationchangelistener, this.ah$a, this.values));
        }
    }

    /* loaded from: classes7.dex */
    static abstract class BaseRangeSubscription extends BasicQueueSubscription<Integer> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        final int end;
        int index;

        abstract void fastPath();

        @Override // o.notNested
        public final int requestFusion(int i) {
            return i & 1;
        }

        abstract void slowPath(long j);

        BaseRangeSubscription(int i, int i2) {
            this.index = i;
            this.end = i2;
        }

        @Override // o.putByte
        public final Integer poll() {
            int i = this.index;
            if (i == this.end) {
                return null;
            }
            this.index = i + 1;
            return Integer.valueOf(i);
        }

        @Override // o.putByte
        public final boolean isEmpty() {
            return this.index == this.end;
        }

        @Override // o.putByte
        public final void clear() {
            this.index = this.end;
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
    static final class RangeSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final registerConfigurationChangeListener<? super Integer> downstream;

        RangeSubscription(registerConfigurationChangeListener<? super Integer> registerconfigurationchangelistener, int i, int i2) {
            super(i, i2);
            this.downstream = registerconfigurationchangelistener;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        void fastPath() {
            int i = this.end;
            registerConfigurationChangeListener<? super Integer> registerconfigurationchangelistener = this.downstream;
            for (int i2 = this.index; i2 != i; i2++) {
                if (this.cancelled) {
                    return;
                }
                registerconfigurationchangelistener.onNext(Integer.valueOf(i2));
            }
            if (this.cancelled) {
                return;
            }
            registerconfigurationchangelistener.onComplete();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        void slowPath(long j) {
            int i = this.end;
            int i2 = this.index;
            registerConfigurationChangeListener<? super Integer> registerconfigurationchangelistener = this.downstream;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i2 == i) {
                        if (i2 == i) {
                            if (this.cancelled) {
                                return;
                            }
                            registerconfigurationchangelistener.onComplete();
                            return;
                        }
                        j = get();
                        if (j2 == j) {
                            this.index = i2;
                            j = addAndGet(-j2);
                        }
                    } else if (this.cancelled) {
                        return;
                    } else {
                        registerconfigurationchangelistener.onNext(Integer.valueOf(i2));
                        j2++;
                        i2++;
                    }
                }
            } while (j != 0);
        }
    }

    /* loaded from: classes7.dex */
    static final class RangeConditionalSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final finished<? super Integer> downstream;

        RangeConditionalSubscription(finished<? super Integer> finishedVar, int i, int i2) {
            super(i, i2);
            this.downstream = finishedVar;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        void fastPath() {
            int i = this.end;
            finished<? super Integer> finishedVar = this.downstream;
            for (int i2 = this.index; i2 != i; i2++) {
                if (this.cancelled) {
                    return;
                }
                finishedVar.tryOnNext(Integer.valueOf(i2));
            }
            if (this.cancelled) {
                return;
            }
            finishedVar.onComplete();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        void slowPath(long j) {
            int i = this.end;
            int i2 = this.index;
            finished<? super Integer> finishedVar = this.downstream;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i2 == i) {
                        if (i2 == i) {
                            if (this.cancelled) {
                                return;
                            }
                            finishedVar.onComplete();
                            return;
                        }
                        j = get();
                        if (j2 == j) {
                            this.index = i2;
                            j = addAndGet(-j2);
                        }
                    } else if (this.cancelled) {
                        return;
                    } else {
                        if (finishedVar.tryOnNext(Integer.valueOf(i2))) {
                            j2++;
                        }
                        i2++;
                    }
                }
            } while (j != 0);
        }
    }
}
