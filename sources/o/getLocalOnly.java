package o;

import com.app.dream11.core.service.graphql.api.privacyscreen.UnblockMutation;
/* loaded from: classes3.dex */
public final /* synthetic */ class getLocalOnly implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ getLocalOnly toString = new getLocalOnly();

    private /* synthetic */ getLocalOnly() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        noBackupDirectory values;
        values = getCategory.values((UnblockMutation.Data) obj);
        return values;
    }
}
