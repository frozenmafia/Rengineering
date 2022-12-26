package o;

import com.app.dream11.core.service.graphql.api.CricketMiniScoreCardQuery;
/* loaded from: classes3.dex */
public final /* synthetic */ class MotionConstrainedPoint implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ MotionConstrainedPoint ag$a = new MotionConstrainedPoint();

    private /* synthetic */ MotionConstrainedPoint() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Boolean valueOf;
        valueOf = applyParameters.valueOf((CricketMiniScoreCardQuery.Squad) obj);
        return valueOf;
    }
}
