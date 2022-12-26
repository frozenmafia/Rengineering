package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.core.ui.D11ErrorFrameLayout;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.DreamRecyclerView;
/* loaded from: classes2.dex */
public abstract class isSubmitAreaEnabled extends androidx.databinding.ViewDataBinding {
    public final CustomTextView HaptikSDK$b;
    public final DreamRecyclerView HaptikSDK$c;
    public final androidx.constraintlayout.widget.Group ag$a;
    @androidx.databinding.Bindable
    protected completeDeferredDestroyActionMode ah$a;
    public final androidx.swiperefreshlayout.widget.SwipeRefreshLayout toString;
    public final D11ErrorFrameLayout valueOf;
    public final ImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public isSubmitAreaEnabled(Object obj, View view, int i, D11ErrorFrameLayout d11ErrorFrameLayout, androidx.constraintlayout.widget.Group group, ImageView imageView, androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout, DreamRecyclerView dreamRecyclerView, CustomTextView customTextView) {
        super(obj, view, i);
        this.valueOf = d11ErrorFrameLayout;
        this.ag$a = group;
        this.values = imageView;
        this.toString = swipeRefreshLayout;
        this.HaptikSDK$c = dreamRecyclerView;
        this.HaptikSDK$b = customTextView;
    }
}
