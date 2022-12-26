package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o.IdlingResource;
import o.addCodepoints;
import o.dataStart;
import o.getLoopers;
import o.startObject;
/* loaded from: classes7.dex */
public final class ObservableTakeLastTimed<T> extends startObject<T, T> {
    final long HaptikSDK$a;
    final getLoopers ag$a;
    final int ah$a;
    final TimeUnit invoke;
    final long toString;
    final boolean values;

    @Override // o.SwipeRefreshLayout.SavedState.AnonymousClass1
    public void valueOf(IdlingResource<? super T> idlingResource) {
        this.valueOf.subscribe(new TakeLastTimedObserver(idlingResource, this.toString, this.HaptikSDK$a, this.invoke, this.ag$a, this.ah$a, this.values));
    }

    /* loaded from: classes7.dex */
    static final class TakeLastTimedObserver<T> extends AtomicBoolean implements IdlingResource<T>, dataStart {
        private static final long serialVersionUID = -5677354903406201275L;
        volatile boolean cancelled;
        final long count;
        final boolean delayError;
        final IdlingResource<? super T> downstream;
        Throwable error;
        final addCodepoints<Object> queue;
        final getLoopers scheduler;
        final long time;
        final TimeUnit unit;
        dataStart upstream;

        TakeLastTimedObserver(IdlingResource<? super T> idlingResource, long j, long j2, TimeUnit timeUnit, getLoopers getloopers, int i, boolean z) {
            this.downstream = idlingResource;
            this.count = j;
            this.time = j2;
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
            addCodepoints<Object> addcodepoints = this.queue;
            long valueOf = this.scheduler.valueOf(this.unit);
            long j = this.time;
            long j2 = this.count;
            boolean z = j2 == Long.MAX_VALUE;
            addcodepoints.toString(Long.valueOf(valueOf), (Long) t);
            while (!addcodepoints.isEmpty()) {
                if (((Long) addcodepoints.values()).longValue() > valueOf - j && (z || (addcodepoints.valueOf() >> 1) <= j2)) {
                    return;
                }
                addcodepoints.poll();
                addcodepoints.poll();
            }
        }

        @Override // o.IdlingResource
        public void onError(Throwable th) {
            this.error = th;
            drain();
        }

        @Override // o.IdlingResource
        public void onComplete() {
            drain();
        }

        @Override // o.dataStart
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.dispose();
            if (compareAndSet(false, true)) {
                this.queue.clear();
            }
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return this.cancelled;
        }

        void drain() {
            Throwable th;
            if (compareAndSet(false, true)) {
                IdlingResource<? super T> idlingResource = this.downstream;
                addCodepoints<Object> addcodepoints = this.queue;
                boolean z = this.delayError;
                long valueOf = this.scheduler.valueOf(this.unit);
                long j = this.time;
                while (!this.cancelled) {
                    if (!z && (th = this.error) != null) {
                        addcodepoints.clear();
                        idlingResource.onError(th);
                        return;
                    }
                    Object poll = addcodepoints.poll();
                    if (poll == null) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            idlingResource.onError(th2);
                            return;
                        } else {
                            idlingResource.onComplete();
                            return;
                        }
                    }
                    Object poll2 = addcodepoints.poll();
                    if (((Long) poll).longValue() >= valueOf - j) {
                        idlingResource.onNext(poll2);
                    }
                }
                addcodepoints.clear();
            }
        }
    }
}
