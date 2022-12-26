package o;

import android.view.View;
import com.app.dream11.core.ui.D11ErrorFrameLayout;
import com.app.dream11.ui.DreamRecyclerView;
import com.app.dream11.ui.EmptyStateView;
import o.applyChainConstraints;
/* loaded from: classes3.dex */
public abstract class setMaxHeight extends androidx.databinding.ViewDataBinding {
    public final DreamRecyclerView HaptikSDK$a;
    public final D11ErrorFrameLayout ag$a;
    @androidx.databinding.Bindable
    protected applyChainConstraints.values ah$a;
    public final androidx.swiperefreshlayout.widget.SwipeRefreshLayout toString;
    @androidx.databinding.Bindable
    protected applyChainConstraints valueOf;
    public final EmptyStateView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setMaxHeight(Object obj, View view, int i, EmptyStateView emptyStateView, D11ErrorFrameLayout d11ErrorFrameLayout, androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout, DreamRecyclerView dreamRecyclerView) {
        super(obj, view, i);
        this.values = emptyStateView;
        this.ag$a = d11ErrorFrameLayout;
        this.toString = swipeRefreshLayout;
        this.HaptikSDK$a = dreamRecyclerView;
    }
}
