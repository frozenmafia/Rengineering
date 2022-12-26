package o;

import com.app.dream11.core.service.graphql.api.CricketMiniScoreCardQuery;
/* loaded from: classes3.dex */
public final /* synthetic */ class getAdjustedPosition implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ getAdjustedPosition ag$a = new getAdjustedPosition();

    private /* synthetic */ getAdjustedPosition() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Boolean ag$a2;
        ag$a2 = applyParameters.ag$a((CricketMiniScoreCardQuery.Squad) obj);
        return ag$a2;
    }
}
