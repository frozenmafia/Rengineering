package o;

import android.view.View;
import android.widget.ImageView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class onDropForTextView extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$b;
    public final D11TextView HaptikSDK$c;
    public final ImageView ag$a;
    public final ImageView ah$a;
    @androidx.databinding.Bindable
    protected getViewWidget ah$b;
    public final ImageView toString;
    public final androidx.constraintlayout.widget.Barrier valueOf;
    public final androidx.constraintlayout.widget.Guideline values;

    /* JADX INFO: Access modifiers changed from: protected */
    public onDropForTextView(Object obj, View view, int i, androidx.constraintlayout.widget.Barrier barrier, androidx.constraintlayout.widget.Guideline guideline, ImageView imageView, ImageView imageView2, ImageView imageView3, D11TextView d11TextView, D11TextView d11TextView2) {
        super(obj, view, i);
        this.valueOf = barrier;
        this.values = guideline;
        this.toString = imageView;
        this.ah$a = imageView2;
        this.ag$a = imageView3;
        this.HaptikSDK$b = d11TextView;
        this.HaptikSDK$c = d11TextView2;
    }
}
