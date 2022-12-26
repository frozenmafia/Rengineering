package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class AppCompatProgressBarHelper extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$b;
    @androidx.databinding.Bindable
    protected horizontalBias ag$a;
    public final D11TextView ah$a;
    public final ProgressBar ah$b;
    public final D11TextView invoke;
    public final D11TextView toString;
    public final ImageView valueOf;
    public final View values;

    /* JADX INFO: Access modifiers changed from: protected */
    public AppCompatProgressBarHelper(Object obj, View view, int i, D11TextView d11TextView, D11TextView d11TextView2, ImageView imageView, View view2, D11TextView d11TextView3, ProgressBar progressBar, D11TextView d11TextView4) {
        super(obj, view, i);
        this.toString = d11TextView;
        this.ah$a = d11TextView2;
        this.valueOf = imageView;
        this.values = view2;
        this.HaptikSDK$b = d11TextView3;
        this.ah$b = progressBar;
        this.invoke = d11TextView4;
    }
}
