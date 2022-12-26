package o;

import android.view.View;
import android.widget.ImageView;
import com.facebook.shimmer.ShimmerFrameLayout;
/* loaded from: classes2.dex */
public abstract class getFixedWidthMajor extends androidx.databinding.ViewDataBinding {
    public final ShimmerFrameLayout HaptikSDK$a;
    public final View ag$a;
    public final ImageView ah$a;
    public final View toString;
    public final ImageView valueOf;
    @androidx.databinding.Bindable
    protected Boolean values;

    public abstract void values(Boolean bool);

    /* JADX INFO: Access modifiers changed from: protected */
    public getFixedWidthMajor(Object obj, View view, int i, ImageView imageView, ImageView imageView2, View view2, View view3, ShimmerFrameLayout shimmerFrameLayout) {
        super(obj, view, i);
        this.ah$a = imageView;
        this.valueOf = imageView2;
        this.toString = view2;
        this.ag$a = view3;
        this.HaptikSDK$a = shimmerFrameLayout;
    }
}
