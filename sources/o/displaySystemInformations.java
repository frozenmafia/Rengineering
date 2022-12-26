package o;

import com.app.dream11.core.service.graphql.api.WhatsAppDataQuery;
/* loaded from: classes3.dex */
public final /* synthetic */ class displaySystemInformations implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ displaySystemInformations ag$a = new displaySystemInformations();

    private /* synthetic */ displaySystemInformations() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        return (WhatsAppDataQuery.Data) ((saveState) obj).ah$a();
    }
}
