package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes3.dex */
public abstract class shouldLayout extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$a;
    @androidx.databinding.Bindable
    protected setAdapter HaptikSDK$c;
    public final LinearLayout ag$a;
    public final D11TextView ah$a;
    public final LinearLayout ah$b;
    public final D11TextView invoke;
    public final LinearLayout toString;
    public final ImageView valueOf;
    public final D11TextView values;

    public abstract void toString(setAdapter setadapter);

    /* JADX INFO: Access modifiers changed from: protected */
    public shouldLayout(Object obj, View view, int i, D11TextView d11TextView, LinearLayout linearLayout, D11TextView d11TextView2, LinearLayout linearLayout2, ImageView imageView, D11TextView d11TextView3, LinearLayout linearLayout3, D11TextView d11TextView4) {
        super(obj, view, i);
        this.ah$a = d11TextView;
        this.ag$a = linearLayout;
        this.values = d11TextView2;
        this.toString = linearLayout2;
        this.valueOf = imageView;
        this.HaptikSDK$a = d11TextView3;
        this.ah$b = linearLayout3;
        this.invoke = d11TextView4;
    }
}
