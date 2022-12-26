package o;

import android.view.View;
import com.app.dream11.teamselection.playerinfo.vm.PlayerPointsInMatchVM;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.DreamRecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
/* loaded from: classes3.dex */
public abstract class onHover extends androidx.databinding.ViewDataBinding {
    public final View HaptikSDK$b;
    public final CustomTextView HaptikSDK$c;
    @androidx.databinding.Bindable
    protected m<PlayerPointsInMatchVM> ag$a;
    public final ShimmerFrameLayout ah$a;
    public final CustomTextView invoke;
    public final CustomTextView toString;
    public final DreamRecyclerView valueOf;
    @androidx.databinding.Bindable
    protected SharedPreferencesCompat values;

    public abstract void valueOf(m<PlayerPointsInMatchVM> mVar);

    public abstract void values(SharedPreferencesCompat sharedPreferencesCompat);

    /* JADX INFO: Access modifiers changed from: protected */
    public onHover(Object obj, View view, int i, ShimmerFrameLayout shimmerFrameLayout, DreamRecyclerView dreamRecyclerView, CustomTextView customTextView, View view2, CustomTextView customTextView2, CustomTextView customTextView3) {
        super(obj, view, i);
        this.ah$a = shimmerFrameLayout;
        this.valueOf = dreamRecyclerView;
        this.toString = customTextView;
        this.HaptikSDK$b = view2;
        this.HaptikSDK$c = customTextView2;
        this.invoke = customTextView3;
    }
}
