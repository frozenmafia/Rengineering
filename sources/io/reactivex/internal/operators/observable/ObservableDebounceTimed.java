package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.appendColumns;
import o.isRefreshing;
import o.noBackupDirectory;
import o.setProgressRotation;
/* loaded from: classes.dex */
public final class ObservableDebounceTimed<T> extends setProgressRotation<T, T> {
    final appendColumns ag$a;
    final TimeUnit ah$a;
    final long valueOf;

    public ObservableDebounceTimed(noBackupDirectory<T> nobackupdirectory, long j, TimeUnit timeUnit, appendColumns appendcolumns) {
        super(nobackupdirectory);
        this.valueOf = j;
        this.ah$a = timeUnit;
        this.ag$a = appendcolumns;
    }

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        this.toString.subscribe(new ObservableDebounceTimed$ah$a(new isRefreshing(factory), this.valueOf, this.ah$a, this.ag$a.ah$a()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class DebounceEmitter<T> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements Runnable, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = 6812032969491025141L;
        final long idx;
        final AtomicBoolean once = new AtomicBoolean();
        final ObservableDebounceTimed$ah$a<T> parent;
        final T value;

        /* JADX INFO: Access modifiers changed from: package-private */
        public DebounceEmitter(T t, long j, ObservableDebounceTimed$ah$a<T> observableDebounceTimed$ah$a) {
            this.value = t;
            this.idx = j;
            this.parent = observableDebounceTimed$ah$a;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.once.compareAndSet(false, true)) {
                this.parent.ah$a(this.idx, this.value, this);
            }
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        public void setResource(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            DisposableHelper.replace(this, anonymousClass2);
        }
    }
}
