package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;
import o.FrameworkSQLiteDatabase;
/* loaded from: classes7.dex */
public final class getStrokeCap$ag$a<T, R> implements builder<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
    final FrameworkSQLiteOpenHelperFactory<? super T, ? extends R> ah$a;
    FrameworkSQLiteDatabase.AnonymousClass2 toString;
    final builder<? super R> valueOf;

    public getStrokeCap$ag$a(builder<? super R> builderVar, FrameworkSQLiteOpenHelperFactory<? super T, ? extends R> frameworkSQLiteOpenHelperFactory) {
        this.valueOf = builderVar;
        this.ah$a = frameworkSQLiteOpenHelperFactory;
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public void dispose() {
        FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2 = this.toString;
        this.toString = DisposableHelper.DISPOSED;
        anonymousClass2.dispose();
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public boolean isDisposed() {
        return this.toString.isDisposed();
    }

    @Override // o.builder
    public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        if (DisposableHelper.validate(this.toString, anonymousClass2)) {
            this.toString = anonymousClass2;
            this.valueOf.onSubscribe(this);
        }
    }

    @Override // o.builder
    public void onSuccess(T t) {
        try {
            this.valueOf.onSuccess(Objects.requireNonNull(this.ah$a.apply(t), "The mapper returned a null item"));
        } catch (Throwable th) {
            FrameworkSQLiteDatabase.values(th);
            this.valueOf.onError(th);
        }
    }

    @Override // o.builder
    public void onError(Throwable th) {
        this.valueOf.onError(th);
    }

    @Override // o.builder
    public void onComplete() {
        this.valueOf.onComplete();
    }
}
