package o;

import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
/* loaded from: classes2.dex */
public abstract class hasExpandedActionView extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected Boolean toString;
    public final ShimmerFrameLayout valueOf;

    public abstract void valueOf(Boolean bool);

    /* JADX INFO: Access modifiers changed from: protected */
    public hasExpandedActionView(Object obj, View view, int i, ShimmerFrameLayout shimmerFrameLayout) {
        super(obj, view, i);
        this.valueOf = shimmerFrameLayout;
    }
}
