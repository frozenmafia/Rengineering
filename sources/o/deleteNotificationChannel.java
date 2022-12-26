package o;

import com.app.dream11.teampreviewnew.TeamPreviewVMModel;
import java.util.List;
/* loaded from: classes3.dex */
public final /* synthetic */ class deleteNotificationChannel implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ deleteNotificationChannel values = new deleteNotificationChannel();

    private /* synthetic */ deleteNotificationChannel() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        List newSessionWithExtras;
        newSessionWithExtras = checkPermission.newSessionWithExtras((TeamPreviewVMModel) obj);
        return newSessionWithExtras;
    }
}
