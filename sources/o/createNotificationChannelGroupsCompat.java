package o;

import com.app.dream11.teampreviewnew.TeamPreviewVMModel;
/* loaded from: classes3.dex */
public final /* synthetic */ class createNotificationChannelGroupsCompat implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ createNotificationChannelGroupsCompat ah$a = new createNotificationChannelGroupsCompat();

    private /* synthetic */ createNotificationChannelGroupsCompat() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        String mayLaunchUrl;
        mayLaunchUrl = checkPermission.mayLaunchUrl((TeamPreviewVMModel) obj);
        return mayLaunchUrl;
    }
}
