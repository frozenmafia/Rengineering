package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable;
import o.IdlingResource;
import o.SwipeRefreshLayout;
/* loaded from: classes7.dex */
public final class ObservableRange extends SwipeRefreshLayout.SavedState.AnonymousClass1<Integer> {
    private final int ah$a;
    private final long values;

    @Override // o.SwipeRefreshLayout.SavedState.AnonymousClass1
    public void valueOf(IdlingResource<? super Integer> idlingResource) {
        RangeDisposable rangeDisposable = new RangeDisposable(idlingResource, this.ah$a, this.values);
        idlingResource.onSubscribe(rangeDisposable);
        rangeDisposable.run();
    }

    /* loaded from: classes7.dex */
    static final class RangeDisposable extends BasicIntQueueDisposable<Integer> {
        private static final long serialVersionUID = 396518478098735504L;
        final IdlingResource<? super Integer> downstream;
        final long end;
        boolean fused;
        long index;

        RangeDisposable(IdlingResource<? super Integer> idlingResource, long j, long j2) {
            this.downstream = idlingResource;
            this.index = j;
            this.end = j2;
        }

        void run() {
            if (this.fused) {
                return;
            }
            IdlingResource<? super Integer> idlingResource = this.downstream;
            long j = this.end;
            for (long j2 = this.index; j2 != j && get() == 0; j2++) {
                idlingResource.onNext(Integer.valueOf((int) j2));
            }
            if (get() == 0) {
                lazySet(1);
                idlingResource.onComplete();
            }
        }

        @Override // o.putByte
        public Integer poll() {
            long j = this.index;
            if (j != this.end) {
                this.index = 1 + j;
                return Integer.valueOf((int) j);
            }
            lazySet(1);
            return null;
        }

        @Override // o.putByte
        public boolean isEmpty() {
            return this.index == this.end;
        }

        @Override // o.putByte
        public void clear() {
            this.index = this.end;
            lazySet(1);
        }

        @Override // o.dataStart
        public void dispose() {
            set(1);
        }

        @Override // o.dataStart
        public boolean isDisposed() {
            return get() != 0;
        }

        @Override // o.notNested
        public int requestFusion(int i) {
            if ((i & 1) != 0) {
                this.fused = true;
                return 1;
            }
            return 0;
        }
    }
}
