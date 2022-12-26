package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.dream11.design.button.D11Button;
import com.dream11.design.textview.D11TextView;
import o.ActivityCompat;
/* loaded from: classes2.dex */
public abstract class setViewText extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$b;
    @androidx.databinding.Bindable
    protected ActivityCompat.Api30Impl ag$a;
    public final LinearLayout ah$a;
    public final D11TextView ah$b;
    public final D11TextView invoke;
    public final LinearLayout toString;
    public final D11Button valueOf;
    public final ImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setViewText(Object obj, View view, int i, D11Button d11Button, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, D11TextView d11TextView, D11TextView d11TextView2, D11TextView d11TextView3) {
        super(obj, view, i);
        this.valueOf = d11Button;
        this.values = imageView;
        this.ah$a = linearLayout;
        this.toString = linearLayout2;
        this.HaptikSDK$b = d11TextView;
        this.ah$b = d11TextView2;
        this.invoke = d11TextView3;
    }
}
