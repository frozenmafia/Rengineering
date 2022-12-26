package o;

import android.view.View;
import android.widget.ImageView;
import com.dream11.design.textview.D11TextView;
import o.AlertController;
/* loaded from: classes3.dex */
public abstract class isChildOrHidden extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected AlertController.RecycleListView ag$a;
    public final D11TextView ah$a;
    public final ImageView invoke;
    public final D11TextView toString;
    public final androidx.cardview.widget.CardView valueOf;
    public final androidx.cardview.widget.CardView values;

    public abstract void valueOf(AlertController.RecycleListView recycleListView);

    /* JADX INFO: Access modifiers changed from: protected */
    public isChildOrHidden(Object obj, View view, int i, D11TextView d11TextView, D11TextView d11TextView2, androidx.cardview.widget.CardView cardView, androidx.cardview.widget.CardView cardView2, ImageView imageView) {
        super(obj, view, i);
        this.toString = d11TextView;
        this.ah$a = d11TextView2;
        this.valueOf = cardView;
        this.values = cardView2;
        this.invoke = imageView;
    }
}
