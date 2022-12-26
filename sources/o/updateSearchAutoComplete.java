package o;

import android.view.View;
import com.app.dream11.core.ui.PaginationRecyclerView;
import com.app.dream11.newhome.CustomSwipeToRefresh;
/* loaded from: classes2.dex */
public abstract class updateSearchAutoComplete extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected getKeyFrameInfo ag$a;
    public final CustomSwipeToRefresh ah$a;
    public final PaginationRecyclerView toString;
    @androidx.databinding.Bindable
    protected createView valueOf;
    public final ViewStubCompat values;

    /* JADX INFO: Access modifiers changed from: protected */
    public updateSearchAutoComplete(Object obj, View view, int i, ViewStubCompat viewStubCompat, PaginationRecyclerView paginationRecyclerView, CustomSwipeToRefresh customSwipeToRefresh) {
        super(obj, view, i);
        this.values = viewStubCompat;
        this.toString = paginationRecyclerView;
        this.ah$a = customSwipeToRefresh;
    }
}
