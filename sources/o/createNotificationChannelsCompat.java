package o;

import com.app.dream11.teampreviewnew.TeamPreviewVMModel;
/* loaded from: classes3.dex */
public final /* synthetic */ class createNotificationChannelsCompat implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ createNotificationChannelsCompat ah$a = new createNotificationChannelsCompat();

    private /* synthetic */ createNotificationChannelsCompat() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Boolean requestPostMessageChannelWithExtras;
        requestPostMessageChannelWithExtras = checkPermission.requestPostMessageChannelWithExtras((TeamPreviewVMModel) obj);
        return requestPostMessageChannelWithExtras;
    }
}
