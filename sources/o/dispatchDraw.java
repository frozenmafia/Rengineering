package o;

import android.view.View;
import android.widget.ImageView;
import com.dream11.design.textview.D11TextView;
import o.SolverVariable;
import o.UiVersions;
/* loaded from: classes2.dex */
public abstract class dispatchDraw extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected SolverVariable.AnonymousClass1 HaptikSDK$a;
    public final D11TextView HaptikSDK$b;
    public final UiVersions.Style HaptikSDK$c;
    public final D11TextView HaptikWebView;
    public final ImageView ag$a;
    public final ImageView ah$a;
    public final androidx.constraintlayout.widget.Guideline ah$b;
    public final D11TextView invoke;
    public final D11TextView toString;
    public final androidx.constraintlayout.widget.Guideline valueOf;
    public final D11TextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public dispatchDraw(Object obj, View view, int i, ImageView imageView, D11TextView d11TextView, androidx.constraintlayout.widget.Guideline guideline, D11TextView d11TextView2, ImageView imageView2, UiVersions.Style style, D11TextView d11TextView3, D11TextView d11TextView4, androidx.constraintlayout.widget.Guideline guideline2, D11TextView d11TextView5) {
        super(obj, view, i);
        this.ag$a = imageView;
        this.toString = d11TextView;
        this.valueOf = guideline;
        this.values = d11TextView2;
        this.ah$a = imageView2;
        this.HaptikSDK$c = style;
        this.invoke = d11TextView3;
        this.HaptikSDK$b = d11TextView4;
        this.ah$b = guideline2;
        this.HaptikWebView = d11TextView5;
    }
}
