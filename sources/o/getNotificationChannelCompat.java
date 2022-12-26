package o;

import com.app.dream11.teampreviewnew.TeamPreviewVMModel;
/* loaded from: classes3.dex */
public final /* synthetic */ class getNotificationChannelCompat implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ getNotificationChannelCompat values = new getNotificationChannelCompat();

    private /* synthetic */ getNotificationChannelCompat() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Boolean onRelationshipValidationResult;
        onRelationshipValidationResult = checkPermission.onRelationshipValidationResult((TeamPreviewVMModel) obj);
        return onRelationshipValidationResult;
    }
}
