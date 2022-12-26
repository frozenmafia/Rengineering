package o;

import android.view.View;
import android.widget.ImageView;
import com.dream11.design.button.D11Button;
/* loaded from: classes3.dex */
public abstract class getRunnableAction extends androidx.databinding.ViewDataBinding {
    public final ImageView ag$a;
    @androidx.databinding.Bindable
    protected hasWindowFeature ah$a;
    public final androidx.cardview.widget.CardView toString;
    public final D11Button values;

    /* JADX INFO: Access modifiers changed from: protected */
    public getRunnableAction(Object obj, View view, int i, D11Button d11Button, androidx.cardview.widget.CardView cardView, ImageView imageView) {
        super(obj, view, i);
        this.values = d11Button;
        this.toString = cardView;
        this.ag$a = imageView;
    }
}
