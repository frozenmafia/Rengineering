package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingResource;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.getLoopers;
import o.startCodepointsVector;
/* loaded from: classes7.dex */
public final class ObservableIntervalRange extends SwipeRefreshLayout.SavedState.AnonymousClass1<Long> {
    final long ag$a;
    final long ah$a;
    final TimeUnit invoke;
    final getLoopers toString;
    final long valueOf;
    final long values;

    @Override // o.SwipeRefreshLayout.SavedState.AnonymousClass1
    public void valueOf(IdlingResource<? super Long> idlingResource) {
        IntervalRangeObserver intervalRangeObserver = new IntervalRangeObserver(idlingResource, this.ah$a, this.valueOf);
        idlingResource.onSubscribe(intervalRangeObserver);
        getLoopers getloopers = this.toString;
        if (getloopers instanceof startCodepointsVector) {
            getLoopers.toString ag$a = getloopers.ag$a();
            intervalRangeObserver.setResource(ag$a);
            ag$a.values(intervalRangeObserver, this.values, this.ag$a, this.invoke);
            return;
        }
        intervalRangeObserver.setResource(getloopers.ag$a(intervalRangeObserver, this.values, this.ag$a, this.invoke));
    }

    /* loaded from: classes7.dex */
    static final class IntervalRangeObserver extends AtomicReference<dataStart> implements dataStart, Runnable {
        private static final long serialVersionUID = 1891866368734007884L;
        long count;
        final IdlingResource<? super Long> downstream;
        final long end;

        IntervalRangeObserver(IdlingResource<? super Long> idlingResource, long j, long j2) {
            this.downstream = idlingResource;
            this.count = j;
            this.end = j2;
        }

        @Override // o.dataStart
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (isDisposed()) {
                return;
            }
            long j = this.count;
            this.downstream.onNext(Long.valueOf(j));
            if (j == this.end) {
                if (!isDisposed()) {
                    this.downstream.onComplete();
                }
                DisposableHelper.dispose(this);
                return;
            }
            this.count = j + 1;
        }

        public void setResource(dataStart datastart) {
            DisposableHelper.setOnce(this, datastart);
        }
    }
}
