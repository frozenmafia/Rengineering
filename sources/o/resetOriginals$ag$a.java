package o;

import io.reactivex.internal.disposables.DisposableHelper;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
/* loaded from: classes5.dex */
final class resetOriginals$ag$a<T> implements SupportSQLiteOpenHelper.Factory<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
    FrameworkSQLiteDatabase.AnonymousClass2 ag$a;
    final SupportSQLiteOpenHelper.Factory<? super T> ah$a;
    final initializeComponent<? super T> valueOf;
    boolean values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public resetOriginals$ag$a(SupportSQLiteOpenHelper.Factory<? super T> factory, initializeComponent<? super T> initializecomponent) {
        this.ah$a = factory;
        this.valueOf = initializecomponent;
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        if (DisposableHelper.validate(this.ag$a, anonymousClass2)) {
            this.ag$a = anonymousClass2;
            this.ah$a.onSubscribe(this);
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
        if (this.values) {
            this.ah$a.onNext(t);
            return;
        }
        try {
            if (this.valueOf.test(t)) {
                return;
            }
            this.values = true;
            this.ah$a.onNext(t);
        } catch (Throwable th) {
            FrameworkSQLiteDatabase.values(th);
            this.ag$a.dispose();
            this.ah$a.onError(th);
        }
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onError(Throwable th) {
        this.ah$a.onError(th);
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onComplete() {
        this.ah$a.onComplete();
    }
}
