package o;

import com.app.dream11.chat.models.MessageUnreadCountModel;
import com.app.dream11.core.service.graphql.api.Social.chat.TotalUnreadMessageCountQuery;
/* loaded from: classes3.dex */
public final /* synthetic */ class getBubbleMetadata implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ getBubbleMetadata ah$a = new getBubbleMetadata();

    private /* synthetic */ getBubbleMetadata() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        MessageUnreadCountModel valueOf;
        valueOf = getCategory.valueOf((TotalUnreadMessageCountQuery.Data) obj);
        return valueOf;
    }
}
