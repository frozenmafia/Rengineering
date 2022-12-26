package o;

import com.app.dream11.core.service.graphql.bayonet.OnLeaderBoardEventSubscription;
/* loaded from: classes2.dex */
public final /* synthetic */ class shouldShowIcon implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ shouldShowIcon values = new shouldShowIcon();

    private /* synthetic */ shouldShowIcon() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        OnLeaderBoardEventSubscription.Data values2;
        values2 = onActionProviderVisibilityChanged.values((saveState) obj);
        return values2;
    }
}
