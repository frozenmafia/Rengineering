package o;

import android.view.View;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class getShowText extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$c;
    public final D11TextView ag$a;
    public final D11TextView ah$a;
    @androidx.databinding.Bindable
    protected Boolean toString;
    public final View valueOf;
    public final androidx.constraintlayout.widget.Guideline values;

    public abstract void values(Boolean bool);

    /* JADX INFO: Access modifiers changed from: protected */
    public getShowText(Object obj, View view, int i, androidx.constraintlayout.widget.Guideline guideline, View view2, D11TextView d11TextView, D11TextView d11TextView2, D11TextView d11TextView3) {
        super(obj, view, i);
        this.values = guideline;
        this.valueOf = view2;
        this.ag$a = d11TextView;
        this.ah$a = d11TextView2;
        this.HaptikSDK$c = d11TextView3;
    }
}
