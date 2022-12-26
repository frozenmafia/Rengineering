package o;

import com.app.dream11.core.service.graphql.api.ContestStatsQuery;
/* loaded from: classes3.dex */
public final /* synthetic */ class getDX implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ getDX valueOf = new getDX();

    private /* synthetic */ getDX() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        return (ContestStatsQuery.Data) ((saveState) obj).ah$a();
    }
}
