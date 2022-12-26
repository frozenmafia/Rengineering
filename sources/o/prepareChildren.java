package o;

import com.app.dream11.core.service.graphql.api.ContestShareQuery;
import com.app.dream11.core.service.graphql.api.Social.chat.IsUserBannedFromChatQuery;
import com.app.dream11.presenter.share.PrivateContestSharePresenter;
/* loaded from: classes3.dex */
public final /* synthetic */ class prepareChildren implements FrameworkSQLiteOpenHelper {
    public static final /* synthetic */ prepareChildren values = new prepareChildren();

    private /* synthetic */ prepareChildren() {
    }

    @Override // o.FrameworkSQLiteOpenHelper
    public final Object apply(Object obj, Object obj2) {
        return PrivateContestSharePresenter.valueOf((IsUserBannedFromChatQuery.Data) obj, (ContestShareQuery.Data) obj2);
    }
}
