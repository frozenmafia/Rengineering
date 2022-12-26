package o;

import com.app.dream11.teamselection.playerinfo.vm.PlayerPointsInMatchVM;
import java.util.List;
import o.PackageManagerCompat;
/* loaded from: classes3.dex */
public final /* synthetic */ class PermissionChecker implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ PermissionChecker valueOf = new PermissionChecker();

    /* loaded from: classes3.dex */
    public final /* synthetic */ class PermissionResult implements FrameworkSQLiteOpenHelperFactory {
        public static final /* synthetic */ PermissionResult ag$a = new PermissionResult();

        private /* synthetic */ PermissionResult() {
        }

        @Override // o.FrameworkSQLiteOpenHelperFactory
        public final Object apply(Object obj) {
            Boolean sharedPreferencesCompat;
            sharedPreferencesCompat = SharedPreferencesCompat.toString((List) obj);
            return sharedPreferencesCompat;
        }
    }

    private /* synthetic */ PermissionChecker() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Boolean m1082isInDreamTeam$lambda2;
        m1082isInDreamTeam$lambda2 = PlayerPointsInMatchVM.m1082isInDreamTeam$lambda2((PackageManagerCompat.Api30Impl) obj);
        return m1082isInDreamTeam$lambda2;
    }
}
