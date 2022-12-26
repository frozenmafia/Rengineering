package o;

import android.view.View;
import android.widget.ImageView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes3.dex */
public abstract class bindCustomTabsService extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$c;
    public final View ag$a;
    public final ImageView ah$a;
    public final D11TextView ah$b;
    public final D11TextView invoke;
    public final ImageView toString;
    @androidx.databinding.Bindable
    protected blocksInteractionBelow valueOf;
    public final View values;

    public abstract void valueOf(blocksInteractionBelow blocksinteractionbelow);

    /* JADX INFO: Access modifiers changed from: protected */
    public bindCustomTabsService(Object obj, View view, int i, View view2, ImageView imageView, ImageView imageView2, View view3, D11TextView d11TextView, D11TextView d11TextView2, D11TextView d11TextView3) {
        super(obj, view, i);
        this.values = view2;
        this.toString = imageView;
        this.ah$a = imageView2;
        this.ag$a = view3;
        this.ah$b = d11TextView;
        this.invoke = d11TextView2;
        this.HaptikSDK$c = d11TextView3;
    }
}
