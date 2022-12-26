package o;

import com.app.dream11.teampreviewnew.TeamPreviewVMModel;
/* loaded from: classes3.dex */
public final /* synthetic */ class writeActionAndGetExtras implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ writeActionAndGetExtras ah$a = new writeActionAndGetExtras();

    private /* synthetic */ writeActionAndGetExtras() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Boolean ICustomTabsCallback$Stub;
        ICustomTabsCallback$Stub = checkPermission.ICustomTabsCallback$Stub((TeamPreviewVMModel) obj);
        return ICustomTabsCallback$Stub;
    }
}
