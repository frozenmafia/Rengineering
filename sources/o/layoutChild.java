package o;

import com.app.dream11.presenter.share.PrivateContestSharePresenter;
import java.util.List;
/* loaded from: classes3.dex */
public final /* synthetic */ class layoutChild implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ layoutChild valueOf = new layoutChild();

    private /* synthetic */ layoutChild() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        return PrivateContestSharePresenter.values((List) obj);
    }
}
