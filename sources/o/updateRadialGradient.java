package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import o.FrameworkSQLiteDatabase;
import o.FrameworkSQLiteOpenHelper;
import o.SupportSQLiteOpenHelper;
/* loaded from: classes5.dex */
public final class updateRadialGradient<T> implements SupportSQLiteOpenHelper.Factory<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
    final SupportSQLiteOpenHelper.Factory<? super T> ag$a;
    FrameworkSQLiteDatabase.AnonymousClass2 ah$a;
    final FrameworkSQLiteStatement<? super FrameworkSQLiteDatabase.AnonymousClass2> toString;
    final FrameworkSQLiteOpenHelper.OpenHelper values;

    public updateRadialGradient(SupportSQLiteOpenHelper.Factory<? super T> factory, FrameworkSQLiteStatement<? super FrameworkSQLiteDatabase.AnonymousClass2> frameworkSQLiteStatement, FrameworkSQLiteOpenHelper.OpenHelper openHelper) {
        this.ag$a = factory;
        this.toString = frameworkSQLiteStatement;
        this.values = openHelper;
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        try {
            this.toString.accept(anonymousClass2);
            if (DisposableHelper.validate(this.ah$a, anonymousClass2)) {
                this.ah$a = anonymousClass2;
                this.ag$a.onSubscribe(this);
            }
        } catch (Throwable th) {
            FrameworkSQLiteDatabase.values(th);
            anonymousClass2.dispose();
            this.ah$a = DisposableHelper.DISPOSED;
            EmptyDisposable.error(th, this.ag$a);
        }
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onNext(T t) {
        this.ag$a.onNext(t);
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onError(Throwable th) {
        if (this.ah$a != DisposableHelper.DISPOSED) {
            this.ah$a = DisposableHelper.DISPOSED;
            this.ag$a.onError(th);
            return;
        }
        setProgressBackgroundColor.values(th);
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onComplete() {
        if (this.ah$a != DisposableHelper.DISPOSED) {
            this.ah$a = DisposableHelper.DISPOSED;
            this.ag$a.onComplete();
        }
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public void dispose() {
        FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2 = this.ah$a;
        if (anonymousClass2 != DisposableHelper.DISPOSED) {
            this.ah$a = DisposableHelper.DISPOSED;
            try {
                this.values.run();
            } catch (Throwable th) {
                FrameworkSQLiteDatabase.values(th);
                setProgressBackgroundColor.values(th);
            }
            anonymousClass2.dispose();
        }
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public boolean isDisposed() {
        return this.ah$a.isDisposed();
    }
}
