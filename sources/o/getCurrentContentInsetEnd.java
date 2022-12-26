package o;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Spinner;
import com.dream11.design.button.D11Button;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes3.dex */
public abstract class getCurrentContentInsetEnd extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$a;
    @androidx.databinding.Bindable
    protected removeFromEnd HaptikSDK$b;
    public final Spinner HaptikSDK$c;
    public final View HaptikSDK$e;
    public final D11TextView HaptikWebView;
    public final D11Button ag$a;
    public final ImageView ah$a;
    public final D11TextView ah$b;
    public final FrameLayout invoke;
    public final androidx.constraintlayout.widget.ConstraintLayout toString;
    public final D11Button valueOf;
    public final androidx.appcompat.widget.AppCompatImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public getCurrentContentInsetEnd(Object obj, View view, int i, D11Button d11Button, D11Button d11Button2, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, ImageView imageView, androidx.appcompat.widget.AppCompatImageView appCompatImageView, FrameLayout frameLayout, Spinner spinner, D11TextView d11TextView, D11TextView d11TextView2, D11TextView d11TextView3, View view2) {
        super(obj, view, i);
        this.ag$a = d11Button;
        this.valueOf = d11Button2;
        this.toString = constraintLayout;
        this.ah$a = imageView;
        this.values = appCompatImageView;
        this.invoke = frameLayout;
        this.HaptikSDK$c = spinner;
        this.ah$b = d11TextView;
        this.HaptikSDK$a = d11TextView2;
        this.HaptikWebView = d11TextView3;
        this.HaptikSDK$e = view2;
    }
}
