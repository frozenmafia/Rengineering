package o;

import io.reactivex.internal.disposables.EmptyDisposable;
import o.SupportSQLiteOpenHelper;
/* loaded from: classes.dex */
public final class getColors extends SupportSQLiteQuery<Object> implements i<Object> {
    public static final SupportSQLiteQuery<Object> toString = new getColors();

    @Override // o.i, java.util.concurrent.Callable
    public Object call() {
        return null;
    }

    private getColors() {
    }

    @Override // o.SupportSQLiteQuery
    protected void values(SupportSQLiteOpenHelper.Factory<? super Object> factory) {
        EmptyDisposable.complete(factory);
    }
}
