package o;

import com.app.dream11.model.FbLoginDataResult;
/* loaded from: classes6.dex */
public final /* synthetic */ class restorePresenterStates implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ restorePresenterStates ah$a = new restorePresenterStates();

    private /* synthetic */ restorePresenterStates() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        noBackupDirectory ag$a;
        ag$a = SupportSQLiteQuery.ag$a(((FbLoginDataResult) obj).getToken());
        return ag$a;
    }
}
