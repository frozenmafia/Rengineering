package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import o.SwipeRefreshLayout;
import o.codepointsLength;
import o.finished;
import o.registerConfigurationChangeListener;
/* loaded from: classes7.dex */
public final class FlowableRangeLong extends SwipeRefreshLayout.AnonymousClass2<Long> {
    final long ag$a;
    final long values;

    @Override // o.SwipeRefreshLayout.AnonymousClass2
    public void ag$a(registerConfigurationChangeListener<? super Long> registerconfigurationchangelistener) {
        if (registerconfigurationchangelistener instanceof finished) {
            registerconfigurationchangelistener.onSubscribe(new RangeConditionalSubscription((finished) registerconfigurationchangelistener, this.ag$a, this.values));
        } else {
            registerconfigurationchangelistener.onSubscribe(new RangeSubscription(registerconfigurationchangelistener, this.ag$a, this.values));
        }
    }

    /* loaded from: classes7.dex */
    static abstract class BaseRangeSubscription extends BasicQueueSubscription<Long> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        final long end;
        long index;

        abstract void fastPath();

        @Override // o.notNested
        public final int requestFusion(int i) {
            return i & 1;
        }

        abstract void slowPath(long j);

        BaseRangeSubscription(long j, long j2) {
            this.index = j;
            this.end = j2;
        }

        @Override // o.putByte
        public final Long poll() {
            long j = this.index;
            if (j == this.end) {
                return null;
            }
            this.index = 1 + j;
            return Long.valueOf(j);
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
        final registerConfigurationChangeListener<? super Long> downstream;

        RangeSubscription(registerConfigurationChangeListener<? super Long> registerconfigurationchangelistener, long j, long j2) {
            super(j, j2);
            this.downstream = registerconfigurationchangelistener;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        void fastPath() {
            long j = this.end;
            registerConfigurationChangeListener<? super Long> registerconfigurationchangelistener = this.downstream;
            for (long j2 = this.index; j2 != j; j2++) {
                if (this.cancelled) {
                    return;
                }
                registerconfigurationchangelistener.onNext(Long.valueOf(j2));
            }
            if (this.cancelled) {
                return;
            }
            registerconfigurationchangelistener.onComplete();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        void slowPath(long j) {
            long j2 = this.end;
            long j3 = this.index;
            registerConfigurationChangeListener<? super Long> registerconfigurationchangelistener = this.downstream;
            do {
                long j4 = 0;
                while (true) {
                    if (j4 == j || j3 == j2) {
                        if (j3 == j2) {
                            if (this.cancelled) {
                                return;
                            }
                            registerconfigurationchangelistener.onComplete();
                            return;
                        }
                        j = get();
                        if (j4 == j) {
                            this.index = j3;
                            j = addAndGet(-j4);
                        }
                    } else if (this.cancelled) {
                        return;
                    } else {
                        registerconfigurationchangelistener.onNext(Long.valueOf(j3));
                        j4++;
                        j3++;
                    }
                }
            } while (j != 0);
        }
    }

    /* loaded from: classes7.dex */
    static final class RangeConditionalSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final finished<? super Long> downstream;

        RangeConditionalSubscription(finished<? super Long> finishedVar, long j, long j2) {
            super(j, j2);
            this.downstream = finishedVar;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        void fastPath() {
            long j = this.end;
            finished<? super Long> finishedVar = this.downstream;
            for (long j2 = this.index; j2 != j; j2++) {
                if (this.cancelled) {
                    return;
                }
                finishedVar.tryOnNext(Long.valueOf(j2));
            }
            if (this.cancelled) {
                return;
            }
            finishedVar.onComplete();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        void slowPath(long j) {
            long j2 = this.end;
            long j3 = this.index;
            finished<? super Long> finishedVar = this.downstream;
            do {
                long j4 = 0;
                while (true) {
                    if (j4 == j || j3 == j2) {
                        if (j3 == j2) {
                            if (this.cancelled) {
                                return;
                            }
                            finishedVar.onComplete();
                            return;
                        }
                        j = get();
                        if (j4 == j) {
                            this.index = j3;
                            j = addAndGet(-j4);
                        }
                    } else if (this.cancelled) {
                        return;
                    } else {
                        if (finishedVar.tryOnNext(Long.valueOf(j3))) {
                            j4++;
                        }
                        j3++;
                    }
                }
            } while (j != 0);
        }
    }
}
