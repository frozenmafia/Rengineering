package o;

import com.app.dream11.teamselection.playerinfo.vm.PlayerPointsInMatchVM;
import o.PackageManagerCompat;
/* loaded from: classes3.dex */
public final /* synthetic */ class checkCallingOrSelfPermission implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ checkCallingOrSelfPermission values = new checkCallingOrSelfPermission();

    private /* synthetic */ checkCallingOrSelfPermission() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        String m1084pointsValue$lambda1;
        m1084pointsValue$lambda1 = PlayerPointsInMatchVM.m1084pointsValue$lambda1((PackageManagerCompat.Api30Impl) obj);
        return m1084pointsValue$lambda1;
    }
}
