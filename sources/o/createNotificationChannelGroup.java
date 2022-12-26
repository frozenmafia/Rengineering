package o;

import com.app.dream11.teampreviewnew.TeamPreviewVMModel;
/* loaded from: classes3.dex */
public final /* synthetic */ class createNotificationChannelGroup implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ createNotificationChannelGroup ag$a = new createNotificationChannelGroup();

    private /* synthetic */ createNotificationChannelGroup() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        String defaultImpl;
        defaultImpl = checkPermission.getDefaultImpl((TeamPreviewVMModel) obj);
        return defaultImpl;
    }
}
