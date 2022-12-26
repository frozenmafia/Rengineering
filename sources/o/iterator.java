package o;

import android.view.View;
import android.widget.ImageView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes3.dex */
public abstract class iterator extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected setTintList ag$a;
    public final D11TextView ah$a;
    public final D11TextView ah$b;
    public final ImageView toString;
    public final androidx.constraintlayout.widget.ConstraintLayout valueOf;
    public final D11TextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public iterator(Object obj, View view, int i, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, ImageView imageView, D11TextView d11TextView, D11TextView d11TextView2, D11TextView d11TextView3) {
        super(obj, view, i);
        this.valueOf = constraintLayout;
        this.toString = imageView;
        this.ah$a = d11TextView;
        this.values = d11TextView2;
        this.ah$b = d11TextView3;
    }
}
