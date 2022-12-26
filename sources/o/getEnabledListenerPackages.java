package o;

import com.app.dream11.teampreviewnew.TeamPreviewVMModel;
/* loaded from: classes3.dex */
public final /* synthetic */ class getEnabledListenerPackages implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ getEnabledListenerPackages valueOf = new getEnabledListenerPackages();

    private /* synthetic */ getEnabledListenerPackages() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        String validateRelationship;
        validateRelationship = checkPermission.validateRelationship((TeamPreviewVMModel) obj);
        return validateRelationship;
    }
}
