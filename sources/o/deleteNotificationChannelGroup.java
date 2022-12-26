package o;

import com.app.dream11.teampreviewnew.TeamPreviewVMModel;
/* loaded from: classes3.dex */
public final /* synthetic */ class deleteNotificationChannelGroup implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ deleteNotificationChannelGroup values = new deleteNotificationChannelGroup();

    private /* synthetic */ deleteNotificationChannelGroup() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        String defaultImpl;
        defaultImpl = checkPermission.setDefaultImpl((TeamPreviewVMModel) obj);
        return defaultImpl;
    }
}
