package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class getDataModel extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$a;
    public final ImageView HaptikSDK$b;
    @androidx.databinding.Bindable
    protected updatePostMeasure HaptikSDK$c;
    public final D11TextView HaptikSDK$d;
    public final LinearLayout HaptikWebView;
    public final androidx.constraintlayout.widget.Barrier ag$a;
    public final ImageView ah$a;
    public final ImageView ah$b;
    public final D11TextView getInitSettings;
    public final D11TextView invoke;
    public final androidx.constraintlayout.widget.Guideline toString;
    public final ImageView valueOf;
    public final androidx.constraintlayout.widget.ConstraintLayout values;

    /* JADX INFO: Access modifiers changed from: protected */
    public getDataModel(Object obj, View view, int i, androidx.constraintlayout.widget.Barrier barrier, androidx.constraintlayout.widget.Guideline guideline, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, D11TextView d11TextView, D11TextView d11TextView2, D11TextView d11TextView3, D11TextView d11TextView4, LinearLayout linearLayout) {
        super(obj, view, i);
        this.ag$a = barrier;
        this.toString = guideline;
        this.values = constraintLayout;
        this.valueOf = imageView;
        this.ah$a = imageView2;
        this.HaptikSDK$b = imageView3;
        this.ah$b = imageView4;
        this.HaptikSDK$a = d11TextView;
        this.invoke = d11TextView2;
        this.HaptikSDK$d = d11TextView3;
        this.getInitSettings = d11TextView4;
        this.HaptikWebView = linearLayout;
    }
}
