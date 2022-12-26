package o;

import com.app.dream11.core.service.graphql.api.RoundMessageQuery;
/* loaded from: classes3.dex */
public final /* synthetic */ class getDY implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ getDY valueOf = new getDY();

    private /* synthetic */ getDY() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        String userMessage;
        userMessage = ((RoundMessageQuery.Data) ((saveState) obj).ah$a()).getMatch().getUserMessage();
        return userMessage;
    }
}
