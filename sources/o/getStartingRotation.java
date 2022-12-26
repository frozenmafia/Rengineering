package o;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
/* loaded from: classes.dex */
public final class getStartingRotation<T> extends setProgressRotation<T, T> {
    final FrameworkSQLiteOpenHelperFactory<? super Throwable, ? extends T> values;

    public getStartingRotation(noBackupDirectory<T> nobackupdirectory, FrameworkSQLiteOpenHelperFactory<? super Throwable, ? extends T> frameworkSQLiteOpenHelperFactory) {
        super(nobackupdirectory);
        this.values = frameworkSQLiteOpenHelperFactory;
    }

    @Override // o.SupportSQLiteQuery
    public void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        this.toString.subscribe(new values(factory, this.values));
    }

    /* loaded from: classes5.dex */
    static final class values<T> implements SupportSQLiteOpenHelper.Factory<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
        FrameworkSQLiteDatabase.AnonymousClass2 ag$a;
        final FrameworkSQLiteOpenHelperFactory<? super Throwable, ? extends T> ah$a;
        final SupportSQLiteOpenHelper.Factory<? super T> valueOf;

        values(SupportSQLiteOpenHelper.Factory<? super T> factory, FrameworkSQLiteOpenHelperFactory<? super Throwable, ? extends T> frameworkSQLiteOpenHelperFactory) {
            this.valueOf = factory;
            this.ah$a = frameworkSQLiteOpenHelperFactory;
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            if (DisposableHelper.validate(this.ag$a, anonymousClass2)) {
                this.ag$a = anonymousClass2;
                this.valueOf.onSubscribe(this);
            }
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public void dispose() {
            this.ag$a.dispose();
        }

        @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
        public boolean isDisposed() {
            return this.ag$a.isDisposed();
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onNext(T t) {
            this.valueOf.onNext(t);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onError(Throwable th) {
            try {
                T apply = this.ah$a.apply(th);
                if (apply == null) {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.valueOf.onError(nullPointerException);
                    return;
                }
                this.valueOf.onNext(apply);
                this.valueOf.onComplete();
            } catch (Throwable th2) {
                FrameworkSQLiteDatabase.values(th2);
                this.valueOf.onError(new CompositeException(th, th2));
            }
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onComplete() {
            this.valueOf.onComplete();
        }
    }
}
