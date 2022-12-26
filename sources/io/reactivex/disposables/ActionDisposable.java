package io.reactivex.disposables;

import io.reactivex.internal.util.ExceptionHelper;
import o.FrameworkSQLiteOpenHelper;
/* loaded from: classes7.dex */
public final class ActionDisposable extends ReferenceDisposable<FrameworkSQLiteOpenHelper.OpenHelper> {
    private static final long serialVersionUID = -8219729196779211169L;

    public ActionDisposable(FrameworkSQLiteOpenHelper.OpenHelper openHelper) {
        super(openHelper);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.reactivex.disposables.ReferenceDisposable
    public void onDisposed(FrameworkSQLiteOpenHelper.OpenHelper openHelper) {
        try {
            openHelper.run();
        } catch (Throwable th) {
            throw ExceptionHelper.valueOf(th);
        }
    }
}
