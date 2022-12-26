package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
/* loaded from: classes5.dex */
final class drawTriangle$ag$a<T, R> implements SupportSQLiteOpenHelper.Factory<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
    FrameworkSQLiteDatabase.AnonymousClass2 ag$a;
    final SupportSQLiteOpenHelper.Factory<? super R> ah$a;
    final FrameworkSQLiteOpenHelperFactory<? super T, ? extends Iterable<? extends R>> values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public drawTriangle$ag$a(SupportSQLiteOpenHelper.Factory<? super R> factory, FrameworkSQLiteOpenHelperFactory<? super T, ? extends Iterable<? extends R>> frameworkSQLiteOpenHelperFactory) {
        this.ah$a = factory;
        this.values = frameworkSQLiteOpenHelperFactory;
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        if (DisposableHelper.validate(this.ag$a, anonymousClass2)) {
            this.ag$a = anonymousClass2;
            this.ah$a.onSubscribe(this);
        }
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onNext(T t) {
        if (this.ag$a == DisposableHelper.DISPOSED) {
            return;
        }
        try {
            SupportSQLiteOpenHelper.Factory<? super R> factory = this.ah$a;
            for (R r : this.values.apply(t)) {
                try {
                    try {
                        factory.onNext((Object) Objects.requireNonNull(r, "The iterator returned a null value"));
                    } catch (Throwable th) {
                        FrameworkSQLiteDatabase.values(th);
                        this.ag$a.dispose();
                        onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    FrameworkSQLiteDatabase.values(th2);
                    this.ag$a.dispose();
                    onError(th2);
                    return;
                }
            }
        } catch (Throwable th3) {
            FrameworkSQLiteDatabase.values(th3);
            this.ag$a.dispose();
            onError(th3);
        }
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onError(Throwable th) {
        if (this.ag$a == DisposableHelper.DISPOSED) {
            setProgressBackgroundColor.values(th);
            return;
        }
        this.ag$a = DisposableHelper.DISPOSED;
        this.ah$a.onError(th);
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onComplete() {
        if (this.ag$a == DisposableHelper.DISPOSED) {
            return;
        }
        this.ag$a = DisposableHelper.DISPOSED;
        this.ah$a.onComplete();
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public boolean isDisposed() {
        return this.ag$a.isDisposed();
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public void dispose() {
        this.ag$a.dispose();
        this.ag$a = DisposableHelper.DISPOSED;
    }
}
