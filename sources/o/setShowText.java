package o;

import android.view.View;
import android.widget.ImageView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes3.dex */
public abstract class setShowText extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$c;
    public final ImageView ag$a;
    public final View ah$a;
    public final D11TextView ah$b;
    @androidx.databinding.Bindable
    protected resolvePanel invoke;
    public final ImageView toString;
    public final View valueOf;
    public final View values;

    public abstract void toString(resolvePanel resolvepanel);

    /* JADX INFO: Access modifiers changed from: protected */
    public setShowText(Object obj, View view, int i, ImageView imageView, View view2, View view3, ImageView imageView2, View view4, D11TextView d11TextView, D11TextView d11TextView2) {
        super(obj, view, i);
        this.toString = imageView;
        this.values = view2;
        this.valueOf = view3;
        this.ag$a = imageView2;
        this.ah$a = view4;
        this.ah$b = d11TextView;
        this.HaptikSDK$c = d11TextView2;
    }
}
