package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.app.dream11.model.viewmodel.PaymentOptionVM;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes3.dex */
public abstract class getSlice extends androidx.databinding.ViewDataBinding {
    public final ImageView HaptikSDK$a;
    @androidx.databinding.Bindable
    protected BinderThread HaptikSDK$b;
    public final CustomTextView HaptikSDK$c;
    public final CustomTextView HaptikSDK$e;
    public final ProgressBar ag$a;
    public final CustomTextView ah$a;
    @androidx.databinding.Bindable
    protected PaymentOptionVM ah$b;
    public final LinearLayout invoke;
    public final CustomTextView toString;
    public final RelativeLayout valueOf;
    public final LinearLayout values;

    /* JADX INFO: Access modifiers changed from: protected */
    public getSlice(Object obj, View view, int i, ProgressBar progressBar, CustomTextView customTextView, LinearLayout linearLayout, CustomTextView customTextView2, RelativeLayout relativeLayout, ImageView imageView, LinearLayout linearLayout2, CustomTextView customTextView3, CustomTextView customTextView4) {
        super(obj, view, i);
        this.ag$a = progressBar;
        this.toString = customTextView;
        this.values = linearLayout;
        this.ah$a = customTextView2;
        this.valueOf = relativeLayout;
        this.HaptikSDK$a = imageView;
        this.invoke = linearLayout2;
        this.HaptikSDK$c = customTextView3;
        this.HaptikSDK$e = customTextView4;
    }
}
