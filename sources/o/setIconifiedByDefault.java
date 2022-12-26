package o;

import android.view.View;
import com.app.dream11.chat.viewmodels.FriendsListVM;
import com.app.dream11.core.ui.PaginationRecyclerView;
import com.app.dream11.newhome.CustomSwipeToRefresh;
/* loaded from: classes2.dex */
public abstract class setIconifiedByDefault extends androidx.databinding.ViewDataBinding {
    public final PaginationRecyclerView ag$a;
    public final CustomSwipeToRefresh ah$a;
    @androidx.databinding.Bindable
    protected FriendsListVM toString;

    /* JADX INFO: Access modifiers changed from: protected */
    public setIconifiedByDefault(Object obj, View view, int i, PaginationRecyclerView paginationRecyclerView, CustomSwipeToRefresh customSwipeToRefresh) {
        super(obj, view, i);
        this.ag$a = paginationRecyclerView;
        this.ah$a = customSwipeToRefresh;
    }
}
