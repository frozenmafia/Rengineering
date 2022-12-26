package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import o.SimpleSQLiteQuery;
import o.StartupException;
import o.registerConfigurationChangeListener;
import o.startAlphaAnimation;
/* loaded from: classes7.dex */
public final class FlowableRangeLong extends SimpleSQLiteQuery<Long> {
    final long ah$a;
    final long values;

    @Override // o.SimpleSQLiteQuery
    public void values(registerConfigurationChangeListener<? super Long> registerconfigurationchangelistener) {
        if (registerconfigurationchangelistener instanceof StartupException) {
            registerconfigurationchangelistener.onSubscribe(new RangeConditionalSubscription((StartupException) registerconfigurationchangelistener, this.values, this.ah$a));
        } else {
            registerconfigurationchangelistener.onSubscribe(new RangeSubscription(registerconfigurationchangelistener, this.values, this.ah$a));
        }
    }

    /* loaded from: classes7.dex */
    static abstract class BaseRangeSubscription extends BasicQueueSubscription<Long> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        final long end;
        long index;

        abstract void fastPath();

        @Override // o.e
        public final int requestFusion(int i) {
            return i & 1;
        }

        abstract void slowPath(long j);

        BaseRangeSubscription(long j, long j2) {
            this.index = j;
            this.end = j2;
        }

        @Override // o.elevationSupported
        public final Long poll() {
            long j = this.index;
            if (j == this.end) {
                return null;
            }
            this.index = 1 + j;
            return Long.valueOf(j);
        }

        @Override // o.elevationSupported
        public final boolean isEmpty() {
            return this.index == this.end;
        }

        @Override // o.elevationSupported
        public final void clear() {
            this.index = this.end;
        }

        @Override // o.getSidecarVersion
        public final void request(long j) {
            if (SubscriptionHelper.validate(j) && startAlphaAnimation.ag$a(this, j) == 0) {
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

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
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

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
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
        final StartupException<? super Long> downstream;

        RangeConditionalSubscription(StartupException<? super Long> startupException, long j, long j2) {
            super(j, j2);
            this.downstream = startupException;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        void fastPath() {
            long j = this.end;
            StartupException<? super Long> startupException = this.downstream;
            for (long j2 = this.index; j2 != j; j2++) {
                if (this.cancelled) {
                    return;
                }
                startupException.tryOnNext(Long.valueOf(j2));
            }
            if (this.cancelled) {
                return;
            }
            startupException.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        void slowPath(long j) {
            long j2 = this.end;
            long j3 = this.index;
            StartupException<? super Long> startupException = this.downstream;
            do {
                long j4 = 0;
                while (true) {
                    if (j4 == j || j3 == j2) {
                        if (j3 == j2) {
                            if (this.cancelled) {
                                return;
                            }
                            startupException.onComplete();
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
                        if (startupException.tryOnNext(Long.valueOf(j3))) {
                            j4++;
                        }
                        j3++;
                    }
                }
            } while (j != 0);
        }
    }
}
