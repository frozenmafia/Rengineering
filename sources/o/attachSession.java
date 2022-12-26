package o;

import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
/* loaded from: classes3.dex */
public abstract class attachSession extends androidx.databinding.ViewDataBinding {
    public final View HaptikSDK$a;
    public final View HaptikSDK$c;
    public final View ag$a;
    public final View ah$a;
    public final View ah$b;
    public final View invoke;
    public final View toString;
    @androidx.databinding.Bindable
    protected Boolean valueOf;
    public final ShimmerFrameLayout values;

    public abstract void valueOf(Boolean bool);

    /* JADX INFO: Access modifiers changed from: protected */
    public attachSession(Object obj, View view, int i, ShimmerFrameLayout shimmerFrameLayout, View view2, View view3, View view4, View view5, View view6, View view7, View view8) {
        super(obj, view, i);
        this.values = shimmerFrameLayout;
        this.toString = view2;
        this.ah$a = view3;
        this.ag$a = view4;
        this.HaptikSDK$a = view5;
        this.HaptikSDK$c = view6;
        this.ah$b = view7;
        this.invoke = view8;
    }
}
