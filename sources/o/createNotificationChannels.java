package o;

import com.app.dream11.teampreviewnew.TeamPreviewVMModel;
/* loaded from: classes3.dex */
public final /* synthetic */ class createNotificationChannels implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ createNotificationChannels toString = new createNotificationChannels();

    private /* synthetic */ createNotificationChannels() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Double updateVisuals;
        updateVisuals = checkPermission.updateVisuals((TeamPreviewVMModel) obj);
        return updateVisuals;
    }
}
