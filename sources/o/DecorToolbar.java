package o;

import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
/* loaded from: classes2.dex */
public abstract class DecorToolbar extends androidx.databinding.ViewDataBinding {
    public final ShimmerFrameLayout toString;
    @androidx.databinding.Bindable
    protected Boolean valueOf;

    public abstract void valueOf(Boolean bool);

    /* JADX INFO: Access modifiers changed from: protected */
    public DecorToolbar(Object obj, View view, int i, ShimmerFrameLayout shimmerFrameLayout) {
        super(obj, view, i);
        this.toString = shimmerFrameLayout;
    }
}
