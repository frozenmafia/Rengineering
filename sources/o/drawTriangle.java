package o;

import o.SupportSQLiteOpenHelper;
/* loaded from: classes.dex */
public final class drawTriangle<T, R> extends setProgressRotation<T, R> {
    final FrameworkSQLiteOpenHelperFactory<? super T, ? extends Iterable<? extends R>> valueOf;

    public drawTriangle(noBackupDirectory<T> nobackupdirectory, FrameworkSQLiteOpenHelperFactory<? super T, ? extends Iterable<? extends R>> frameworkSQLiteOpenHelperFactory) {
        super(nobackupdirectory);
        this.valueOf = frameworkSQLiteOpenHelperFactory;
    }

    @Override // o.SupportSQLiteQuery
    protected void values(SupportSQLiteOpenHelper.Factory<? super R> factory) {
        this.toString.subscribe(new drawTriangle$ag$a(factory, this.valueOf));
    }
}
