package o;

import com.app.dream11.chat.models.MessageUnreadCountModel;
import com.app.dream11.core.service.graphql.api.TotalChatUnreadCountQuery;
/* loaded from: classes3.dex */
public final /* synthetic */ class getGroupAlertBehavior implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ getGroupAlertBehavior valueOf = new getGroupAlertBehavior();

    private /* synthetic */ getGroupAlertBehavior() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        MessageUnreadCountModel valueOf2;
        valueOf2 = getCategory.valueOf((TotalChatUnreadCountQuery.Data) obj);
        return valueOf2;
    }
}
