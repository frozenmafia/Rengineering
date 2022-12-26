package o;

import android.view.View;
import android.widget.ImageView;
import com.dream11.design.textview.D11TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
/* loaded from: classes2.dex */
public abstract class getDropdownItemCount extends androidx.databinding.ViewDataBinding {
    public final ShimmerFrameLayout HaptikSDK$a;
    public final androidx.constraintlayout.widget.ConstraintLayout ag$a;
    public final ImageView ah$a;
    public final D11TextView toString;
    @androidx.databinding.Bindable
    protected Boolean valueOf;
    public final D11TextView values;

    public abstract void values(Boolean bool);

    /* JADX INFO: Access modifiers changed from: protected */
    public getDropdownItemCount(Object obj, View view, int i, ImageView imageView, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, D11TextView d11TextView, D11TextView d11TextView2, ShimmerFrameLayout shimmerFrameLayout) {
        super(obj, view, i);
        this.ah$a = imageView;
        this.ag$a = constraintLayout;
        this.toString = d11TextView;
        this.values = d11TextView2;
        this.HaptikSDK$a = shimmerFrameLayout;
    }
}
