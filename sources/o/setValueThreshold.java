package o;

import com.dreampay.graphql.api.GetSavedCardsListQuery;
import java.util.List;
/* loaded from: classes4.dex */
public final /* synthetic */ class setValueThreshold implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ setValueThreshold ah$a = new setValueThreshold();

    private /* synthetic */ setValueThreshold() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        List ag$a;
        ag$a = setMaxValue.ag$a((GetSavedCardsListQuery.Data) obj);
        return ag$a;
    }
}
