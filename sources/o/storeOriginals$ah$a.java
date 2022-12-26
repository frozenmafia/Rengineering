package o;

import java.util.Objects;
import o.FrameworkSQLiteDatabase;
/* loaded from: classes7.dex */
public final class storeOriginals$ah$a<T, R> implements appendClause<T> {
    final appendClause<? super R> ah$a;
    final FrameworkSQLiteOpenHelperFactory<? super T, ? extends R> valueOf;

    public storeOriginals$ah$a(appendClause<? super R> appendclause, FrameworkSQLiteOpenHelperFactory<? super T, ? extends R> frameworkSQLiteOpenHelperFactory) {
        this.ah$a = appendclause;
        this.valueOf = frameworkSQLiteOpenHelperFactory;
    }

    @Override // o.appendClause
    public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        this.ah$a.onSubscribe(anonymousClass2);
    }

    @Override // o.appendClause
    public void onSuccess(T t) {
        try {
            this.ah$a.onSuccess(Objects.requireNonNull(this.valueOf.apply(t), "The mapper function returned a null value."));
        } catch (Throwable th) {
            FrameworkSQLiteDatabase.values(th);
            onError(th);
        }
    }

    @Override // o.appendClause
    public void onError(Throwable th) {
        this.ah$a.onError(th);
    }
}
