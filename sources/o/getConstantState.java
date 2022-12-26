package o;

import com.app.dream11.core.service.graphql.api.Social.NetworkInMatchQuery;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public final /* synthetic */ class getConstantState implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ getConstantState values = new getConstantState();

    private /* synthetic */ getConstantState() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        ArrayList valueOf;
        valueOf = updateFrames.valueOf((NetworkInMatchQuery.NetworkInMatch) obj);
        return valueOf;
    }
}
