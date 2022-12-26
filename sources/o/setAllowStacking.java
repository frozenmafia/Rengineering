package o;

import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
/* loaded from: classes2.dex */
public abstract class setAllowStacking extends androidx.databinding.ViewDataBinding {
    public final View ag$a;
    public final ShimmerFrameLayout ah$a;
    @androidx.databinding.Bindable
    protected Boolean valueOf;
    public final View values;

    public abstract void ah$a(Boolean bool);

    /* JADX INFO: Access modifiers changed from: protected */
    public setAllowStacking(Object obj, View view, int i, View view2, View view3, ShimmerFrameLayout shimmerFrameLayout) {
        super(obj, view, i);
        this.values = view2;
        this.ag$a = view3;
        this.ah$a = shimmerFrameLayout;
    }
}
