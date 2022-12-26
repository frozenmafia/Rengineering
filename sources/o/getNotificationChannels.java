package o;

import com.app.dream11.teampreviewnew.TeamPreviewVMModel;
/* loaded from: classes3.dex */
public final /* synthetic */ class getNotificationChannels implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ getNotificationChannels ah$a = new getNotificationChannels();

    private /* synthetic */ getNotificationChannels() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Boolean postMessage;
        postMessage = checkPermission.postMessage((TeamPreviewVMModel) obj);
        return postMessage;
    }
}
