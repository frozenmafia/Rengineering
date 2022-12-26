package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
/* loaded from: classes7.dex */
public final class ObserverResourceWrapper<T> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements SupportSQLiteOpenHelper.Factory<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
    private static final long serialVersionUID = -8612022020200669122L;
    final SupportSQLiteOpenHelper.Factory<? super T> downstream;
    final AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> upstream = new AtomicReference<>();

    public ObserverResourceWrapper(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        this.downstream = factory;
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        if (DisposableHelper.setOnce(this.upstream, anonymousClass2)) {
            this.downstream.onSubscribe(this);
        }
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onError(Throwable th) {
        dispose();
        this.downstream.onError(th);
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onComplete() {
        dispose();
        this.downstream.onComplete();
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public void dispose() {
        DisposableHelper.dispose(this.upstream);
        DisposableHelper.dispose(this);
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public boolean isDisposed() {
        return this.upstream.get() == DisposableHelper.DISPOSED;
    }

    public void setResource(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        DisposableHelper.set(this, anonymousClass2);
    }
}
