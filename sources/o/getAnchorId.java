package o;

import com.app.dream11.core.service.graphql.api.MatchCenterFabQuery;
/* loaded from: classes3.dex */
public final /* synthetic */ class getAnchorId implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ getAnchorId ah$a = new getAnchorId();

    private /* synthetic */ getAnchorId() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        String ah$b;
        ah$b = getLimitBoundsTo.ah$b((MatchCenterFabQuery.FabIconDetails) obj);
        return ah$b;
    }
}
