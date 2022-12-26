package o;

import android.view.View;
import android.widget.ImageView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class AppCompatCheckBox extends androidx.databinding.ViewDataBinding {
    public final View HaptikSDK$a;
    public final D11TextView HaptikSDK$b;
    public final D11TextView HaptikSDK$c;
    @androidx.databinding.Bindable
    protected setShouldShowIcon$ah$a ag$a;
    public final androidx.constraintlayout.widget.ConstraintLayout ah$a;
    public final D11TextView invoke;
    @androidx.databinding.Bindable
    protected setShouldShowIcon$ag$a toString;
    public final ImageView valueOf;
    public final ImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public AppCompatCheckBox(Object obj, View view, int i, ImageView imageView, ImageView imageView2, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, D11TextView d11TextView, D11TextView d11TextView2, D11TextView d11TextView3, View view2) {
        super(obj, view, i);
        this.values = imageView;
        this.valueOf = imageView2;
        this.ah$a = constraintLayout;
        this.HaptikSDK$c = d11TextView;
        this.HaptikSDK$b = d11TextView2;
        this.invoke = d11TextView3;
        this.HaptikSDK$a = view2;
    }
}
