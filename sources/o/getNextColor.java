package o;

import o.SupportSQLiteOpenHelper;
/* loaded from: classes.dex */
public final class getNextColor<T> extends SupportSQLiteQuery<T> {
    final noBackupDirectory<T> ah$a;

    public getNextColor(noBackupDirectory<T> nobackupdirectory) {
        this.ah$a = nobackupdirectory;
    }

    @Override // o.SupportSQLiteQuery
    protected void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        this.ah$a.subscribe(factory);
    }
}
