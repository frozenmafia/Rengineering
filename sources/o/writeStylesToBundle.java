package o;

import android.view.View;
import android.widget.RelativeLayout;
import com.app.dream11.core.ui.D11ErrorFrameLayout;
import com.app.dream11.ui.DreamRecyclerView;
import com.app.dream11.ui.EmptyStateView;
/* loaded from: classes3.dex */
public abstract class writeStylesToBundle extends androidx.databinding.ViewDataBinding {
    public final RelativeLayout HaptikSDK$a;
    public final androidx.swiperefreshlayout.widget.SwipeRefreshLayout HaptikSDK$c;
    @androidx.databinding.Bindable
    protected computeConstantSize ag$a;
    public final D11ErrorFrameLayout ah$a;
    public final RelativeLayout toString;
    public final EmptyStateView valueOf;
    public final DreamRecyclerView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public writeStylesToBundle(Object obj, View view, int i, DreamRecyclerView dreamRecyclerView, EmptyStateView emptyStateView, D11ErrorFrameLayout d11ErrorFrameLayout, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout) {
        super(obj, view, i);
        this.values = dreamRecyclerView;
        this.valueOf = emptyStateView;
        this.ah$a = d11ErrorFrameLayout;
        this.toString = relativeLayout;
        this.HaptikSDK$a = relativeLayout2;
        this.HaptikSDK$c = swipeRefreshLayout;
    }
}
