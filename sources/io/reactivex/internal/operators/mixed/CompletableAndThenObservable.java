package io.reactivex.internal.operators.mixed;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SlidingPaneLayout;
import o.SupportSQLiteOpenHelper;
import o.SupportSQLiteQuery;
import o.noBackupDirectory;
/* loaded from: classes7.dex */
public final class CompletableAndThenObservable<R> extends SupportSQLiteQuery<R> {
    final SlidingPaneLayout.TouchBlocker ah$a;
    final noBackupDirectory<? extends R> toString;

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super R> factory) {
        AndThenObservableObserver andThenObservableObserver = new AndThenObservableObserver(factory, this.toString);
        factory.onSubscribe(andThenObservableObserver);
        this.ah$a.ag$a(andThenObservableObserver);
    }

    /* loaded from: classes7.dex */
    static final class AndThenObservableObserver<R> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements SupportSQLiteOpenHelper.Factory<R>, SlidingPaneLayout.SavedState, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = -8948264376121066672L;
        final SupportSQLiteOpenHelper.Factory<? super R> downstream;
        noBackupDirectory<? extends R> other;

        AndThenObservableObserver(SupportSQLiteOpenHelper.Factory<? super R> factory, noBackupDirectory<? extends R> nobackupdirectory) {
            this.other = nobackupdirectory;
            this.downstream = factory;
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onNext(R r) {
            this.downstream.onNext(r);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onComplete() {
            noBackupDirectory<? extends R> nobackupdirectory = this.other;
            if (nobackupdirectory == null) {
                this.downstream.onComplete();
                return;
            }
            this.other = null;
            nobackupdirectory.subscribe(this);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            DisposableHelper.replace(this, anonymousClass2);
        }
    }
}
