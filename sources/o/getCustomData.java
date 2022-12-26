package o;

import com.app.dream11.core.service.graphql.api.CricketMiniScoreCardQuery;
/* loaded from: classes3.dex */
public final /* synthetic */ class getCustomData implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ getCustomData values = new getCustomData();

    private /* synthetic */ getCustomData() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        String HaptikSDK$a;
        HaptikSDK$a = applyParameters.HaptikSDK$a((CricketMiniScoreCardQuery.Squad) obj);
        return HaptikSDK$a;
    }
}
