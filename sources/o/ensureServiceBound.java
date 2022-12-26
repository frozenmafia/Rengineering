package o;

import com.app.dream11.teampreviewnew.TeamPreviewVMModel;
/* loaded from: classes3.dex */
public final /* synthetic */ class ensureServiceBound implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ ensureServiceBound values = new ensureServiceBound();

    private /* synthetic */ ensureServiceBound() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        String onMessageChannelReady;
        onMessageChannelReady = checkPermission.onMessageChannelReady((TeamPreviewVMModel) obj);
        return onMessageChannelReady;
    }
}
