package o;

import com.app.dream11.teampreviewnew.TeamPreviewVMModel;
/* loaded from: classes3.dex */
public final /* synthetic */ class getNotificationChannelGroups implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ getNotificationChannelGroups values = new getNotificationChannelGroups();

    private /* synthetic */ getNotificationChannelGroups() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        String asBinder;
        asBinder = checkPermission.asBinder((TeamPreviewVMModel) obj);
        return asBinder;
    }
}
