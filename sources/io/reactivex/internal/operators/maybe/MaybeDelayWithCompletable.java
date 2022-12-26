package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SlidingPaneLayout;
import o.SupportSQLiteOpenHelper;
import o.builder;
import o.deleteDatabaseFile;
/* loaded from: classes7.dex */
public final class MaybeDelayWithCompletable<T> extends deleteDatabaseFile<T> {
    final SlidingPaneLayout.TouchBlocker ag$a;
    final SupportSQLiteOpenHelper.Configuration.Builder<T> valueOf;

    @Override // o.deleteDatabaseFile
    public void values(builder<? super T> builderVar) {
        this.ag$a.ag$a(new OtherObserver(builderVar, this.valueOf));
    }

    /* loaded from: classes7.dex */
    static final class OtherObserver<T> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements SlidingPaneLayout.SavedState, FrameworkSQLiteDatabase.AnonymousClass2 {
        private static final long serialVersionUID = 703409937383992161L;
        final builder<? super T> downstream;
        final SupportSQLiteOpenHelper.Configuration.Builder<T> source;

        OtherObserver(builder<? super T> builderVar, SupportSQLiteOpenHelper.Configuration.Builder<T> builder) {
            this.downstream = builderVar;
            this.source = builder;
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            if (DisposableHelper.setOnce(this, anonymousClass2)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // o.SlidingPaneLayout.SavedState
        public void onComplete() {
            final builder<? super T> builderVar = this.downstream;
            this.source.valueOf(new builder<T>(this, builderVar) { // from class: io.reactivex.internal.operators.maybe.MaybeDelayWithCompletable$ag$a
                final builder<? super T> toString;
                final AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> valueOf;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.valueOf = this;
                    this.toString = builderVar;
                }

                @Override // o.builder
                public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
                    DisposableHelper.replace(this.valueOf, anonymousClass2);
                }

                @Override // o.builder
                public void onSuccess(T t) {
                    this.toString.onSuccess(t);
                }

                @Override // o.builder
                public void onError(Throwable th) {
                    this.toString.onError(th);
                }

                @Override // o.builder
                public void onComplete() {
                    this.toString.onComplete();
                }
            });
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }
    }
}
