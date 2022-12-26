package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import o.SimpleSQLiteQuery;
import o.StartupException;
import o.registerConfigurationChangeListener;
import o.startAlphaAnimation;
/* loaded from: classes7.dex */
public final class FlowableRange extends SimpleSQLiteQuery<Integer> {
    final int ah$a;
    final int valueOf;

    @Override // o.SimpleSQLiteQuery
    public void values(registerConfigurationChangeListener<? super Integer> registerconfigurationchangelistener) {
        if (registerconfigurationchangelistener instanceof StartupException) {
            registerconfigurationchangelistener.onSubscribe(new RangeConditionalSubscription((StartupException) registerconfigurationchangelistener, this.valueOf, this.ah$a));
        } else {
            registerconfigurationchangelistener.onSubscribe(new RangeSubscription(registerconfigurationchangelistener, this.valueOf, this.ah$a));
        }
    }

    /* loaded from: classes7.dex */
    static abstract class BaseRangeSubscription extends BasicQueueSubscription<Integer> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        final int end;
        int index;

        abstract void fastPath();

        @Override // o.e
        public final int requestFusion(int i) {
            return i & 1;
        }

        abstract void slowPath(long j);

        BaseRangeSubscription(int i, int i2) {
            this.index = i;
            this.end = i2;
        }

        @Override // o.elevationSupported
        public final Integer poll() {
            int i = this.index;
            if (i == this.end) {
                return null;
            }
            this.index = i + 1;
            return Integer.valueOf(i);
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
        final registerConfigurationChangeListener<? super Integer> downstream;

        RangeSubscription(registerConfigurationChangeListener<? super Integer> registerconfigurationchangelistener, int i, int i2) {
            super(i, i2);
            this.downstream = registerconfigurationchangelistener;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
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

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
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
        final StartupException<? super Integer> downstream;

        RangeConditionalSubscription(StartupException<? super Integer> startupException, int i, int i2) {
            super(i, i2);
            this.downstream = startupException;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        void fastPath() {
            int i = this.end;
            StartupException<? super Integer> startupException = this.downstream;
            for (int i2 = this.index; i2 != i; i2++) {
                if (this.cancelled) {
                    return;
                }
                startupException.tryOnNext(Integer.valueOf(i2));
            }
            if (this.cancelled) {
                return;
            }
            startupException.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        void slowPath(long j) {
            int i = this.end;
            int i2 = this.index;
            StartupException<? super Integer> startupException = this.downstream;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i2 == i) {
                        if (i2 == i) {
                            if (this.cancelled) {
                                return;
                            }
                            startupException.onComplete();
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
                        if (startupException.tryOnNext(Integer.valueOf(i2))) {
                            j2++;
                        }
                        i2++;
                    }
                }
            } while (j != 0);
        }
    }
}
