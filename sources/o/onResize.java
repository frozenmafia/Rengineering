package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
/* loaded from: classes7.dex */
public final class onResize<T> implements appendClause<T> {
    final appendClause<? super T> ag$a;
    final AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> ah$a;

    public onResize(AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> atomicReference, appendClause<? super T> appendclause) {
        this.ah$a = atomicReference;
        this.ag$a = appendclause;
    }

    @Override // o.appendClause
    public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        DisposableHelper.replace(this.ah$a, anonymousClass2);
    }

    @Override // o.appendClause
    public void onSuccess(T t) {
        this.ag$a.onSuccess(t);
    }

    @Override // o.appendClause
    public void onError(Throwable th) {
        this.ag$a.onError(th);
    }
}
