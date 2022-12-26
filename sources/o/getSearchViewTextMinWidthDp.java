package o;

import android.view.View;
import android.widget.ProgressBar;
import com.app.dream11.core.ui.D11ErrorFrameLayout;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.DreamRecyclerView;
import com.google.android.material.appbar.AppBarLayout;
/* loaded from: classes2.dex */
public abstract class getSearchViewTextMinWidthDp extends androidx.databinding.ViewDataBinding {
    public final ProgressBar HaptikSDK$b;
    @androidx.databinding.Bindable
    protected areUnusedAppRestrictionsAvailable HaptikSDK$c;
    public final D11ErrorFrameLayout ag$a;
    public final AppBarLayout ah$a;
    public final DreamRecyclerView invoke;
    public final CustomTextView toString;
    public final CustomTextView valueOf;
    public final androidx.coordinatorlayout.widget.CoordinatorLayout values;

    /* JADX INFO: Access modifiers changed from: protected */
    public getSearchViewTextMinWidthDp(Object obj, View view, int i, AppBarLayout appBarLayout, CustomTextView customTextView, CustomTextView customTextView2, androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, D11ErrorFrameLayout d11ErrorFrameLayout, ProgressBar progressBar, DreamRecyclerView dreamRecyclerView) {
        super(obj, view, i);
        this.ah$a = appBarLayout;
        this.valueOf = customTextView;
        this.toString = customTextView2;
        this.values = coordinatorLayout;
        this.ag$a = d11ErrorFrameLayout;
        this.HaptikSDK$b = progressBar;
        this.invoke = dreamRecyclerView;
    }
}
