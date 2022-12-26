package o;

import android.view.View;
import android.widget.ImageView;
import com.dream11.design.textview.D11TextView;
import o.FileProvider;
/* loaded from: classes2.dex */
public abstract class setPromptText extends androidx.databinding.ViewDataBinding {
    public final ImageView HaptikSDK$a;
    @androidx.databinding.Bindable
    protected FileProvider.PathStrategy HaptikSDK$b;
    public final D11TextView HaptikSDK$c;
    public final D11TextView HaptikSDK$d;
    public final View HaptikSDK$e;
    public final D11TextView HaptikWebView;
    public final androidx.constraintlayout.widget.Guideline ag$a;
    public final androidx.constraintlayout.widget.Guideline ah$a;
    public final androidx.appcompat.widget.AppCompatImageView ah$b;
    public final View getInitSettings;
    public final D11TextView getSignupData;
    public final View invoke;
    public final D11TextView toString;
    public final D11TextView valueOf;
    public final androidx.constraintlayout.widget.Group values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setPromptText(Object obj, View view, int i, D11TextView d11TextView, androidx.constraintlayout.widget.Group group, D11TextView d11TextView2, androidx.constraintlayout.widget.Guideline guideline, androidx.constraintlayout.widget.Guideline guideline2, ImageView imageView, androidx.appcompat.widget.AppCompatImageView appCompatImageView, D11TextView d11TextView3, View view2, D11TextView d11TextView4, D11TextView d11TextView5, D11TextView d11TextView6, View view3, View view4) {
        super(obj, view, i);
        this.toString = d11TextView;
        this.values = group;
        this.valueOf = d11TextView2;
        this.ah$a = guideline;
        this.ag$a = guideline2;
        this.HaptikSDK$a = imageView;
        this.ah$b = appCompatImageView;
        this.HaptikSDK$c = d11TextView3;
        this.invoke = view2;
        this.getSignupData = d11TextView4;
        this.HaptikWebView = d11TextView5;
        this.HaptikSDK$d = d11TextView6;
        this.getInitSettings = view3;
        this.HaptikSDK$e = view4;
    }
}
