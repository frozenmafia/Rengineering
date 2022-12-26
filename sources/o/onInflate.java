package o;

import android.view.View;
import android.widget.ImageView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes3.dex */
public abstract class onInflate extends androidx.databinding.ViewDataBinding {
    public final View HaptikSDK$b;
    public final D11TextView ag$a;
    public final androidx.cardview.widget.CardView ah$a;
    public final D11TextView ah$b;
    public final ImageView toString;
    public final D11TextView valueOf;
    public final ImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public onInflate(Object obj, View view, int i, androidx.cardview.widget.CardView cardView, ImageView imageView, ImageView imageView2, D11TextView d11TextView, D11TextView d11TextView2, View view2, D11TextView d11TextView3) {
        super(obj, view, i);
        this.ah$a = cardView;
        this.values = imageView;
        this.toString = imageView2;
        this.ag$a = d11TextView;
        this.valueOf = d11TextView2;
        this.HaptikSDK$b = view2;
        this.ah$b = d11TextView3;
    }
}
