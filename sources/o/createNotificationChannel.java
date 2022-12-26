package o;

import com.app.dream11.teampreviewnew.TeamPreviewVMModel;
/* loaded from: classes3.dex */
public final /* synthetic */ class createNotificationChannel implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ createNotificationChannel ah$a = new createNotificationChannel();

    private /* synthetic */ createNotificationChannel() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Boolean interfaceDescriptor;
        interfaceDescriptor = checkPermission.getInterfaceDescriptor((TeamPreviewVMModel) obj);
        return interfaceDescriptor;
    }
}
