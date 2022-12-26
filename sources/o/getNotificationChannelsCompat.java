package o;

import com.app.dream11.teampreviewnew.TeamPreviewVMModel;
/* loaded from: classes3.dex */
public final /* synthetic */ class getNotificationChannelsCompat implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ getNotificationChannelsCompat values = new getNotificationChannelsCompat();

    private /* synthetic */ getNotificationChannelsCompat() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        String ICustomTabsService;
        ICustomTabsService = checkPermission.ICustomTabsService((TeamPreviewVMModel) obj);
        return ICustomTabsService;
    }
}
