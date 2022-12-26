package o;

import com.app.dream11.teampreviewnew.TeamPreviewVMModel;
/* loaded from: classes3.dex */
public final /* synthetic */ class getNotificationChannelGroupCompat implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ getNotificationChannelGroupCompat valueOf = new getNotificationChannelGroupCompat();

    private /* synthetic */ getNotificationChannelGroupCompat() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        String onTransact;
        onTransact = checkPermission.onTransact((TeamPreviewVMModel) obj);
        return onTransact;
    }
}
