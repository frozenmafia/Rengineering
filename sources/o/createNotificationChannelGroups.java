package o;

import com.app.dream11.teampreviewnew.TeamPreviewVMModel;
/* loaded from: classes3.dex */
public final /* synthetic */ class createNotificationChannelGroups implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ createNotificationChannelGroups ag$a = new createNotificationChannelGroups();

    private /* synthetic */ createNotificationChannelGroups() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        String receiveFile;
        receiveFile = checkPermission.receiveFile((TeamPreviewVMModel) obj);
        return receiveFile;
    }
}
