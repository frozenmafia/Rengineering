package o;

import com.app.dream11.teamselection.playerinfo.vm.PlayerPointsInMatchVM;
import o.PackageManagerCompat;
/* loaded from: classes3.dex */
public final /* synthetic */ class areUnusedAppRestrictionsEnabled implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ areUnusedAppRestrictionsEnabled valueOf = new areUnusedAppRestrictionsEnabled();

    private /* synthetic */ areUnusedAppRestrictionsEnabled() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        String m1083opponentTeamName$lambda0;
        m1083opponentTeamName$lambda0 = PlayerPointsInMatchVM.m1083opponentTeamName$lambda0((PackageManagerCompat.Api30Impl) obj);
        return m1083opponentTeamName$lambda0;
    }
}
