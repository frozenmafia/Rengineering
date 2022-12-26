package o;

import com.app.dream11.teampreviewnew.TeamPreviewVMModel;
/* loaded from: classes3.dex */
public final /* synthetic */ class deleteUnlistedNotificationChannels implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ deleteUnlistedNotificationChannels ah$a = new deleteUnlistedNotificationChannels();

    private /* synthetic */ deleteUnlistedNotificationChannels() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        String onNavigationEvent;
        onNavigationEvent = checkPermission.onNavigationEvent((TeamPreviewVMModel) obj);
        return onNavigationEvent;
    }
}
