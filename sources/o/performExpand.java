package o;

import android.view.View;
import com.app.dream11.chat.chatlist.contestinvitebottomsheet.AllContestInviteForChannelVM;
import com.app.dream11.core.ui.PaginationRecyclerView;
import com.app.dream11.newhome.CustomSwipeToRefresh;
/* loaded from: classes2.dex */
public abstract class performExpand extends androidx.databinding.ViewDataBinding {
    public final pullChildren ag$a;
    public final PaginationRecyclerView ah$a;
    public final CustomSwipeToRefresh toString;
    @androidx.databinding.Bindable
    protected AllContestInviteForChannelVM values;

    /* JADX INFO: Access modifiers changed from: protected */
    public performExpand(Object obj, View view, int i, pullChildren pullchildren, PaginationRecyclerView paginationRecyclerView, CustomSwipeToRefresh customSwipeToRefresh) {
        super(obj, view, i);
        this.ag$a = pullchildren;
        this.ah$a = paginationRecyclerView;
        this.toString = customSwipeToRefresh;
    }
}
