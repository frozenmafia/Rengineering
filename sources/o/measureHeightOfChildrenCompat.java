package o;

import android.view.View;
import android.widget.LinearLayout;
import com.app.dream11.core.ui.D11ErrorFrameLayout;
import com.app.dream11.ui.DreamRecyclerView;
import com.dream11.design.textview.D11TextView;
import o.KeyCycleOscillator;
/* loaded from: classes2.dex */
public abstract class measureHeightOfChildrenCompat extends androidx.databinding.ViewDataBinding {
    public final LinearLayout HaptikSDK$b;
    public final DreamRecyclerView HaptikSDK$c;
    public final D11ErrorFrameLayout ag$a;
    public final D11TextView ah$a;
    public final D11TextView invoke;
    public final androidx.cardview.widget.CardView toString;
    public final androidx.coordinatorlayout.widget.CoordinatorLayout valueOf;
    @androidx.databinding.Bindable
    protected KeyCycleOscillator.CycleOscillator values;

    /* JADX INFO: Access modifiers changed from: protected */
    public measureHeightOfChildrenCompat(Object obj, View view, int i, D11ErrorFrameLayout d11ErrorFrameLayout, androidx.cardview.widget.CardView cardView, D11TextView d11TextView, androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, DreamRecyclerView dreamRecyclerView, LinearLayout linearLayout, D11TextView d11TextView2) {
        super(obj, view, i);
        this.ag$a = d11ErrorFrameLayout;
        this.toString = cardView;
        this.ah$a = d11TextView;
        this.valueOf = coordinatorLayout;
        this.HaptikSDK$c = dreamRecyclerView;
        this.HaptikSDK$b = linearLayout;
        this.invoke = d11TextView2;
    }
}
