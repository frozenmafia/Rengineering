package o;

import o.FrameworkSQLiteDatabase;
import o.FrameworkSQLiteOpenHelper;
import o.SupportSQLiteOpenHelper;
/* loaded from: classes.dex */
public final class setStrokeWidth<T> extends setProgressRotation<T, T> {
    private final FrameworkSQLiteOpenHelper.OpenHelper valueOf;
    private final FrameworkSQLiteStatement<? super FrameworkSQLiteDatabase.AnonymousClass2> values;

    public setStrokeWidth(SupportSQLiteQuery<T> supportSQLiteQuery, FrameworkSQLiteStatement<? super FrameworkSQLiteDatabase.AnonymousClass2> frameworkSQLiteStatement, FrameworkSQLiteOpenHelper.OpenHelper openHelper) {
        super(supportSQLiteQuery);
        this.values = frameworkSQLiteStatement;
        this.valueOf = openHelper;
    }

    @Override // o.SupportSQLiteQuery
    protected void values(SupportSQLiteOpenHelper.Factory<? super T> factory) {
        this.toString.subscribe(new updateRadialGradient(factory, this.values, this.valueOf));
    }
}
