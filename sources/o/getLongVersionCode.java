package o;

import com.app.dream11.core.service.graphql.api.FantasyScoreCardQuery;
/* loaded from: classes3.dex */
public final /* synthetic */ class getLongVersionCode implements FrameworkSQLiteOpenHelper {
    public static final /* synthetic */ getLongVersionCode ag$a = new getLongVersionCode();

    private /* synthetic */ getLongVersionCode() {
    }

    @Override // o.FrameworkSQLiteOpenHelper
    public final Object apply(Object obj, Object obj2) {
        Boolean values;
        values = computeSHA256Digest.values((Boolean) obj, (FantasyScoreCardQuery.Data) obj2);
        return values;
    }
}
