package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import o.IdlingResource;
import o.addCodepoints;
import o.dataStart;
import o.getLoopers;
import o.startObject;
/* loaded from: classes7.dex */
public final class ObservableSkipLastTimed<T> extends startObject<T, T> {
    final getLoopers ag$a;
    final int ah$a;
    final TimeUnit ah$b;
    final long toString;
    final boolean values;

    @Override // o.SwipeRefreshLayout.SavedState.AnonymousClass1
    public void valueOf(IdlingResource<? super T> idlingResource) {
        this.valueOf.subscribe(new SkipLastTimedObserver(idlingResource, this.toString, this.ah$b, this.ag$a, this.ah$a, this.values));
    }

    /* loaded from: classes7.dex */
    static final class SkipLastTimedObserver<T> extends AtomicInteger implements IdlingResource<T>, dataStart {
        private static final long serialVersionUID = -5677354903406201275L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        final IdlingResource<? super T> downstream;
        Throwable error;
        final addCodepoints<Object> queue;
        final getLoopers scheduler;
        final long time;
        final TimeUnit unit;
        dataStart upstream;

        SkipLastTimedObserver(IdlingResource<? super T> idlingResource, long j, TimeUnit timeUnit, getLoopers getloopers, int i, boolean z) {
            this.downstream = idlingResource;
            this.time = j;
            this.unit = timeUnit;
            this.scheduler = getloopers;
            this.queue = new addCodepoints<>(i);
            this.delayError = z;
        }

        @Override // o.IdlingResource
        public void onSubscribe(dataStart datastart) {
            if (DisposableHelper.validate(this.upstream, datastart)) {
                this.upstream = datastart;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.IdlingResource
        public void onNext(T t) {
            this.queue.toString(Long.valueOf(this.scheduler.valueOf(this.unit)), (Long) t);
            drain();
        }

        @Override // o.IdlingResource
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // o.IdlingResource
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // o.dataStart
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return this.cancelled;
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            IdlingResource<? super T> idlingResource = this.downstream;
            addCodepoints<Object> addcodepoints = this.queue;
            boolean z = this.delayError;
            TimeUnit timeUnit = this.unit;
            getLoopers getloopers = this.scheduler;
            long j = this.time;
            int i = 1;
            while (!this.cancelled) {
                boolean z2 = this.done;
                Long l = (Long) addcodepoints.values();
                boolean z3 = l == null;
                long valueOf = getloopers.valueOf(timeUnit);
                if (!z3 && l.longValue() > valueOf - j) {
                    z3 = true;
                }
                if (z2) {
                    if (!z) {
                        Throwable th = this.error;
                        if (th != null) {
                            this.queue.clear();
                            idlingResource.onError(th);
                            return;
                        } else if (z3) {
                            idlingResource.onComplete();
                            return;
                        }
                    } else if (z3) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            idlingResource.onError(th2);
                            return;
                        } else {
                            idlingResource.onComplete();
                            return;
                        }
                    }
                }
                if (!z3) {
                    addcodepoints.poll();
                    idlingResource.onNext(addcodepoints.poll());
                } else {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
            this.queue.clear();
        }
    }
}
