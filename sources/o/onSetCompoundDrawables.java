package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.ui.CircularImageView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class onSetCompoundDrawables extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$a;
    public final D11TextView HaptikSDK$b;
    @androidx.databinding.Bindable
    protected addHistoricMessage ag$a;
    public final ImageView ah$a;
    public final androidx.constraintlayout.widget.Guideline toString;
    public final CircularImageView valueOf;
    public final androidx.constraintlayout.widget.Guideline values;

    /* JADX INFO: Access modifiers changed from: protected */
    public onSetCompoundDrawables(Object obj, View view, int i, ImageView imageView, CircularImageView circularImageView, androidx.constraintlayout.widget.Guideline guideline, androidx.constraintlayout.widget.Guideline guideline2, D11TextView d11TextView, D11TextView d11TextView2) {
        super(obj, view, i);
        this.ah$a = imageView;
        this.valueOf = circularImageView;
        this.toString = guideline;
        this.values = guideline2;
        this.HaptikSDK$b = d11TextView;
        this.HaptikSDK$a = d11TextView2;
    }
}
