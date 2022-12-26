package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
/* loaded from: classes5.dex */
final class setEndTrim$ah$a<T> implements SupportSQLiteOpenHelper.Factory<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
    FrameworkSQLiteDatabase.AnonymousClass2 ag$a;
    final SupportSQLiteOpenHelper.Factory<? super T> ah$a;
    long toString;
    boolean values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setEndTrim$ah$a(SupportSQLiteOpenHelper.Factory<? super T> factory, long j) {
        this.ah$a = factory;
        this.toString = j;
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        if (DisposableHelper.validate(this.ag$a, anonymousClass2)) {
            this.ag$a = anonymousClass2;
            if (this.toString == 0) {
                this.values = true;
                anonymousClass2.dispose();
                EmptyDisposable.complete(this.ah$a);
                return;
            }
            this.ah$a.onSubscribe(this);
        }
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onNext(T t) {
        if (this.values) {
            return;
        }
        long j = this.toString;
        long j2 = j - 1;
        this.toString = j2;
        if (j > 0) {
            boolean z = j2 == 0;
            this.ah$a.onNext(t);
            if (z) {
                onComplete();
            }
        }
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onError(Throwable th) {
        if (this.values) {
            setProgressBackgroundColor.values(th);
            return;
        }
        this.values = true;
        this.ag$a.dispose();
        this.ah$a.onError(th);
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onComplete() {
        if (this.values) {
            return;
        }
        this.values = true;
        this.ag$a.dispose();
        this.ah$a.onComplete();
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public void dispose() {
        this.ag$a.dispose();
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public boolean isDisposed() {
        return this.ag$a.isDisposed();
    }
}
