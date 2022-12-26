package o;

import com.app.dream11.teampreviewnew.TeamPreviewVMModel;
/* loaded from: classes3.dex */
public final /* synthetic */ class pushSideChannelQueue implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ pushSideChannelQueue toString = new pushSideChannelQueue();

    private /* synthetic */ pushSideChannelQueue() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Boolean requestPostMessageChannel;
        requestPostMessageChannel = checkPermission.requestPostMessageChannel((TeamPreviewVMModel) obj);
        return requestPostMessageChannel;
    }
}
