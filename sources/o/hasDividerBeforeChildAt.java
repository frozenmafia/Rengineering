package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.app.dream11.core.performance.D11ConstraintLayoutTracker;
import com.app.dream11.core.ui.D11ErrorFrameLayout;
import com.app.dream11.ui.DreamRecyclerView;
import com.dream11.design.textview.D11TextView;
import o.DrawerArrowDrawable;
/* loaded from: classes2.dex */
public abstract class hasDividerBeforeChildAt extends androidx.databinding.ViewDataBinding {
    public final ProgressBar HaptikSDK$a;
    public final D11TextView HaptikSDK$b;
    public final D11ConstraintLayoutTracker HaptikSDK$c;
    public final D11TextView HaptikSDK$d;
    @androidx.databinding.Bindable
    protected DrawerArrowDrawable.ArrowDirection ag$a;
    public final ImageView ah$a;
    public final D11TextView ah$b;
    public final D11TextView getInitSettings;
    public final DreamRecyclerView invoke;
    public final D11ErrorFrameLayout toString;
    public final androidx.cardview.widget.CardView valueOf;
    public final View values;

    /* JADX INFO: Access modifiers changed from: protected */
    public hasDividerBeforeChildAt(Object obj, View view, int i, androidx.cardview.widget.CardView cardView, View view2, D11ErrorFrameLayout d11ErrorFrameLayout, ImageView imageView, ProgressBar progressBar, DreamRecyclerView dreamRecyclerView, D11ConstraintLayoutTracker d11ConstraintLayoutTracker, D11TextView d11TextView, D11TextView d11TextView2, D11TextView d11TextView3, D11TextView d11TextView4) {
        super(obj, view, i);
        this.valueOf = cardView;
        this.values = view2;
        this.toString = d11ErrorFrameLayout;
        this.ah$a = imageView;
        this.HaptikSDK$a = progressBar;
        this.invoke = dreamRecyclerView;
        this.HaptikSDK$c = d11ConstraintLayoutTracker;
        this.ah$b = d11TextView;
        this.HaptikSDK$b = d11TextView2;
        this.getInitSettings = d11TextView3;
        this.HaptikSDK$d = d11TextView4;
    }
}
