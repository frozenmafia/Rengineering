package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
/* loaded from: classes5.dex */
public final class setStrokeCap<T> extends setProgressRotation<T, T> {
    final long ag$a;
    final boolean ah$a;
    final T valueOf;

    public setStrokeCap(noBackupDirectory<T> nobackupdirectory, long j, T t, boolean z) {
        super(nobackupdirectory);
        this.ag$a = j;
        this.valueOf = t;
        this.ah$a = z;
    }

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        this.toString.subscribe(new values(factory, this.ag$a, this.valueOf, this.ah$a));
    }

    /* loaded from: classes5.dex */
    static final class values<T> implements SupportSQLiteOpenHelper.Factory<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
        final long HaptikSDK$b;
        final T ag$a;
        long ah$a;
        FrameworkSQLiteDatabase.AnonymousClass2 invoke;
        final boolean toString;
        final SupportSQLiteOpenHelper.Factory<? super T> valueOf;
        boolean values;

        values(SupportSQLiteOpenHelper.Factory<? super T> factory, long j, T t, boolean z) {
            this.valueOf = factory;
            this.HaptikSDK$b = j;
            this.ag$a = t;
            this.toString = z;
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            if (DisposableHelper.validate(this.invoke, anonymousClass2)) {
                this.invoke = anonymousClass2;
                this.valueOf.onSubscribe(this);
            }
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            this.invoke.dispose();
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return this.invoke.isDisposed();
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onNext(T t) {
            if (this.values) {
                return;
            }
            long j = this.ah$a;
            if (j == this.HaptikSDK$b) {
                this.values = true;
                this.invoke.dispose();
                this.valueOf.onNext(t);
                this.valueOf.onComplete();
                return;
            }
            this.ah$a = j + 1;
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onError(Throwable th) {
            if (this.values) {
                setProgressBackgroundColor.values(th);
                return;
            }
            this.values = true;
            this.valueOf.onError(th);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onComplete() {
            if (this.values) {
                return;
            }
            this.values = true;
            T t = this.ag$a;
            if (t == null && this.toString) {
                this.valueOf.onError(new NoSuchElementException());
                return;
            }
            if (t != null) {
                this.valueOf.onNext(t);
            }
            this.valueOf.onComplete();
        }
    }
}
