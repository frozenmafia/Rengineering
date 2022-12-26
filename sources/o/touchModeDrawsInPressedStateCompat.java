package o;

import android.view.View;
import android.widget.ImageView;
import com.dream11.design.button.D11Button;
import com.dream11.design.button.PrimaryButton;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class touchModeDrawsInPressedStateCompat extends androidx.databinding.ViewDataBinding {
    public final View HaptikSDK$a;
    public final View HaptikSDK$b;
    public final D11TextView HaptikSDK$c;
    public final D11TextView ag$a;
    public final D11Button ah$a;
    public final View toString;
    public final ImageView valueOf;
    public final PrimaryButton values;

    /* JADX INFO: Access modifiers changed from: protected */
    public touchModeDrawsInPressedStateCompat(Object obj, View view, int i, View view2, PrimaryButton primaryButton, D11Button d11Button, ImageView imageView, D11TextView d11TextView, D11TextView d11TextView2, View view3, View view4) {
        super(obj, view, i);
        this.toString = view2;
        this.values = primaryButton;
        this.ah$a = d11Button;
        this.valueOf = imageView;
        this.ag$a = d11TextView;
        this.HaptikSDK$c = d11TextView2;
        this.HaptikSDK$b = view3;
        this.HaptikSDK$a = view4;
    }
}
