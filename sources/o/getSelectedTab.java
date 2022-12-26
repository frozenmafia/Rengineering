package o;

import com.app.dream11.core.service.graphql.api.WinningBreakupQuery;
/* loaded from: classes.dex */
public final /* synthetic */ class getSelectedTab implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ getSelectedTab values = new getSelectedTab();

    private /* synthetic */ getSelectedTab() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        WinningBreakupQuery.PrizeAmount ag$a;
        ag$a = getElevation.ag$a((WinningBreakupQuery.Contest) obj);
        return ag$a;
    }
}
