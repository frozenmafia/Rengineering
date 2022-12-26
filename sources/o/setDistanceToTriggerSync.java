package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
/* loaded from: classes7.dex */
public abstract class setDistanceToTriggerSync<T> implements SupportSQLiteOpenHelper.Factory<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
    final AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> ag$a = new AtomicReference<>();

    protected void valueOf() {
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public final void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        if (canChildScrollUp.ah$a(this.ag$a, anonymousClass2, getClass())) {
            valueOf();
        }
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public final boolean isDisposed() {
        return this.ag$a.get() == DisposableHelper.DISPOSED;
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public final void dispose() {
        DisposableHelper.dispose(this.ag$a);
    }
}
