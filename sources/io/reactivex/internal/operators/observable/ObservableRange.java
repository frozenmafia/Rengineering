package io.reactivex.internal.operators.observable;

import io.reactivex.internal.observers.BasicIntQueueDisposable;
import o.SupportSQLiteOpenHelper;
import o.SupportSQLiteQuery;
/* loaded from: classes7.dex */
public final class ObservableRange extends SupportSQLiteQuery<Integer> {
    private final int ag$a;
    private final long values;

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super Integer> factory) {
        RangeDisposable rangeDisposable = new RangeDisposable(factory, this.ag$a, this.values);
        factory.onSubscribe(rangeDisposable);
        rangeDisposable.run();
    }

    /* loaded from: classes7.dex */
    static final class RangeDisposable extends BasicIntQueueDisposable<Integer> {
        private static final long serialVersionUID = 396518478098735504L;
        final SupportSQLiteOpenHelper.Factory<? super Integer> downstream;
        final long end;
        boolean fused;
        long index;

        RangeDisposable(SupportSQLiteOpenHelper.Factory<? super Integer> factory, long j, long j2) {
            this.downstream = factory;
            this.index = j;
            this.end = j2;
        }

        void run() {
            if (this.fused) {
                return;
            }
            SupportSQLiteOpenHelper.Factory<? super Integer> factory = this.downstream;
            long j = this.end;
            for (long j2 = this.index; j2 != j && get() == 0; j2++) {
                factory.onNext(Integer.valueOf((int) j2));
            }
            if (get() == 0) {
                lazySet(1);
                factory.onComplete();
            }
        }

        @Override // o.elevationSupported
        public Integer poll() throws Exception {
            long j = this.index;
            if (j != this.end) {
                this.index = 1 + j;
                return Integer.valueOf((int) j);
            }
            lazySet(1);
            return null;
        }

        @Override // o.elevationSupported
        public boolean isEmpty() {
            return this.index == this.end;
        }

        @Override // o.elevationSupported
        public void clear() {
            this.index = this.end;
            lazySet(1);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            set(1);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return get() != 0;
        }

        @Override // o.e
        public int requestFusion(int i) {
            if ((i & 1) != 0) {
                this.fused = true;
                return 1;
            }
            return 0;
        }
    }
}
