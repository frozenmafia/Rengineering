package o;

import com.app.dream11.core.service.graphql.api.MatchCenterFabQuery;
/* loaded from: classes3.dex */
public final /* synthetic */ class getTouchRegionId implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ getTouchRegionId ag$a = new getTouchRegionId();

    private /* synthetic */ getTouchRegionId() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        String ag$a2;
        ag$a2 = getLimitBoundsTo.ag$a((MatchCenterFabQuery.FabIconDetails) obj);
        return ag$a2;
    }
}
