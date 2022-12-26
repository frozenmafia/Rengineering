package o;

import com.app.dream11.core.service.graphql.api.fragment.BasicContestDetails;
/* loaded from: classes.dex */
public final /* synthetic */ class getThemedContext implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ getThemedContext valueOf = new getThemedContext();

    private /* synthetic */ getThemedContext() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        String initSettings;
        initSettings = getElevation.getInitSettings((BasicContestDetails) obj);
        return initSettings;
    }
}
