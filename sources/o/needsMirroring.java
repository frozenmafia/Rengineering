package o;

import com.app.dream11.core.service.graphql.api.Social.NetworkInMatchQuery;
/* loaded from: classes2.dex */
public final /* synthetic */ class needsMirroring implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ needsMirroring values = new needsMirroring();

    private /* synthetic */ needsMirroring() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Boolean values2;
        values2 = updateFrames.values((NetworkInMatchQuery.NetworkInMatch) obj);
        return values2;
    }
}
