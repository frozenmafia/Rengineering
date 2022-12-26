package o;

import com.app.dream11.core.service.graphql.api.profile.MiniProfileQuery;
/* loaded from: classes3.dex */
public final /* synthetic */ class addRatio implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ addRatio ah$a = new addRatio();

    private /* synthetic */ addRatio() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        horizontalGuideline values;
        values = new createConstraintReference().values((MiniProfileQuery.Data) obj);
        return values;
    }
}
