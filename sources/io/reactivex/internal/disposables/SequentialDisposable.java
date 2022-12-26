package io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
/* loaded from: classes5.dex */
public final class SequentialDisposable extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements FrameworkSQLiteDatabase.AnonymousClass2 {
    private static final long serialVersionUID = -754898800686245608L;

    public SequentialDisposable() {
    }

    public SequentialDisposable(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        lazySet(anonymousClass2);
    }

    public boolean update(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        return DisposableHelper.set(this, anonymousClass2);
    }

    public boolean replace(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        return DisposableHelper.replace(this, anonymousClass2);
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }
}
