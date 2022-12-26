package o;

import com.app.dream11.core.service.graphql.api.type.LeaderboardFilters;
/* loaded from: classes.dex */
public final /* synthetic */ class selectContentView implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ selectContentView ag$a = new selectContentView();

    private /* synthetic */ selectContentView() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Boolean valueOf;
        LeaderboardFilters leaderboardFilters = (LeaderboardFilters) obj;
        valueOf = Boolean.valueOf(r1 != LeaderboardFilters.UNKNOWN__);
        return valueOf;
    }
}
