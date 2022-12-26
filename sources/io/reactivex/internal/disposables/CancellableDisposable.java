package io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReference;
import o.AppInitializer;
import o.FrameworkSQLiteDatabase;
import o.setProgressBackgroundColor;
/* loaded from: classes7.dex */
public final class CancellableDisposable extends AtomicReference<AppInitializer> implements FrameworkSQLiteDatabase.AnonymousClass2 {
    private static final long serialVersionUID = 5718521705281392066L;

    public CancellableDisposable(AppInitializer appInitializer) {
        super(appInitializer);
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public boolean isDisposed() {
        return get() == null;
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public void dispose() {
        AppInitializer andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.valueOf();
        } catch (Exception e) {
            FrameworkSQLiteDatabase.values(e);
            setProgressBackgroundColor.values(e);
        }
    }
}
