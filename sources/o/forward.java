package o;

import android.view.View;
import android.widget.LinearLayout;
import com.dream11.design.textview.D11TextView;
import o.AnimatedStateListDrawableCompat;
/* loaded from: classes3.dex */
public abstract class forward extends androidx.databinding.ViewDataBinding {
    public final View ag$a;
    public final D11TextView ah$a;
    @androidx.databinding.Bindable
    protected AnimatedStateListDrawableCompat.AnonymousClass1 valueOf;
    public final LinearLayout values;

    /* JADX INFO: Access modifiers changed from: protected */
    public forward(Object obj, View view, int i, LinearLayout linearLayout, D11TextView d11TextView, View view2) {
        super(obj, view, i);
        this.values = linearLayout;
        this.ah$a = d11TextView;
        this.ag$a = view2;
    }
}
