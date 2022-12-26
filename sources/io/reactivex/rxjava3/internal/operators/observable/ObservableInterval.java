package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.IdlingResource;
import o.SwipeRefreshLayout;
import o.dataStart;
import o.getLoopers;
import o.startCodepointsVector;
/* loaded from: classes5.dex */
public final class ObservableInterval extends SwipeRefreshLayout.SavedState.AnonymousClass1<Long> {
    final TimeUnit ag$a;
    final long ah$a;
    final getLoopers toString;
    final long values;

    public ObservableInterval(long j, long j2, TimeUnit timeUnit, getLoopers getloopers) {
        this.values = j;
        this.ah$a = j2;
        this.ag$a = timeUnit;
        this.toString = getloopers;
    }

    @Override // o.SwipeRefreshLayout.SavedState.AnonymousClass1
    public void valueOf(IdlingResource<? super Long> idlingResource) {
        IntervalObserver intervalObserver = new IntervalObserver(idlingResource);
        idlingResource.onSubscribe(intervalObserver);
        getLoopers getloopers = this.toString;
        if (getloopers instanceof startCodepointsVector) {
            getLoopers.toString ag$a = getloopers.ag$a();
            intervalObserver.setResource(ag$a);
            ag$a.values(intervalObserver, this.values, this.ah$a, this.ag$a);
            return;
        }
        intervalObserver.setResource(getloopers.ag$a(intervalObserver, this.values, this.ah$a, this.ag$a));
    }

    /* loaded from: classes5.dex */
    static final class IntervalObserver extends AtomicReference<dataStart> implements dataStart, Runnable {
        private static final long serialVersionUID = 346773832286157679L;
        long count;
        final IdlingResource<? super Long> downstream;

        IntervalObserver(IdlingResource<? super Long> idlingResource) {
            this.downstream = idlingResource;
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
            if (get() != DisposableHelper.DISPOSED) {
                IdlingResource<? super Long> idlingResource = this.downstream;
                long j = this.count;
                this.count = 1 + j;
                idlingResource.onNext(Long.valueOf(j));
            }
        }

        public void setResource(dataStart datastart) {
            DisposableHelper.setOnce(this, datastart);
        }
    }
}
