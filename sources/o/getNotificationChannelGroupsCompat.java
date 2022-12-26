package o;

import com.app.dream11.teampreviewnew.TeamPreviewVMModel;
/* loaded from: classes3.dex */
public final /* synthetic */ class getNotificationChannelGroupsCompat implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ getNotificationChannelGroupsCompat valueOf = new getNotificationChannelGroupsCompat();

    private /* synthetic */ getNotificationChannelGroupsCompat() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Boolean ICustomTabsCallback$Stub$Proxy;
        ICustomTabsCallback$Stub$Proxy = checkPermission.ICustomTabsCallback$Stub$Proxy((TeamPreviewVMModel) obj);
        return ICustomTabsCallback$Stub$Proxy;
    }
}
