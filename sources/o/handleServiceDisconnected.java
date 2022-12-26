package o;

import com.app.dream11.core.service.graphql.api.PlayerInfoQuery;
/* loaded from: classes6.dex */
public final /* synthetic */ class handleServiceDisconnected implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ handleServiceDisconnected ag$a = new handleServiceDisconnected();

    private /* synthetic */ handleServiceDisconnected() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        return (PlayerInfoQuery.Data) ((saveState) obj).ah$a();
    }
}
