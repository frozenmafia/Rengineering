package io.reactivex.internal.observers;

import io.reactivex.internal.disposables.DisposableHelper;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
/* loaded from: classes7.dex */
public abstract class DeferredScalarObserver<T, R> extends DeferredScalarDisposable<R> implements SupportSQLiteOpenHelper.Factory<T> {
    private static final long serialVersionUID = -266195175408988651L;
    protected FrameworkSQLiteDatabase.AnonymousClass2 upstream;

    public DeferredScalarObserver(SupportSQLiteOpenHelper.Factory<? super R> factory) {
        super(factory);
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        if (DisposableHelper.validate(this.upstream, anonymousClass2)) {
            this.upstream = anonymousClass2;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onError(Throwable th) {
        this.value = null;
        error(th);
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onComplete() {
        T t = this.value;
        if (t != null) {
            this.value = null;
            complete(t);
            return;
        }
        complete();
    }

    @Override // io.reactivex.internal.observers.DeferredScalarDisposable, o.FrameworkSQLiteDatabase.AnonymousClass2
    public void dispose() {
        super.dispose();
        this.upstream.dispose();
    }
}
