package o;

import android.view.View;
import android.widget.ImageView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes3.dex */
public abstract class ensureCollapseButtonView extends androidx.databinding.ViewDataBinding {
    public final D11TextView ah$a;
    public final ImageView toString;
    public final ImageView valueOf;
    @androidx.databinding.Bindable
    protected setAdapter values;

    public abstract void values(setAdapter setadapter);

    /* JADX INFO: Access modifiers changed from: protected */
    public ensureCollapseButtonView(Object obj, View view, int i, ImageView imageView, ImageView imageView2, D11TextView d11TextView) {
        super(obj, view, i);
        this.toString = imageView;
        this.valueOf = imageView2;
        this.ah$a = d11TextView;
    }
}
