package o;

import android.view.View;
import android.widget.ImageView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes3.dex */
public abstract class setSwitchTextAppearance extends androidx.databinding.ViewDataBinding {
    public final ImageView ah$a;
    public final D11TextView toString;
    public final D11TextView valueOf;
    @androidx.databinding.Bindable
    protected View.OnClickListener values;

    public abstract void ag$a(View.OnClickListener onClickListener);

    /* JADX INFO: Access modifiers changed from: protected */
    public setSwitchTextAppearance(Object obj, View view, int i, ImageView imageView, D11TextView d11TextView, D11TextView d11TextView2) {
        super(obj, view, i);
        this.ah$a = imageView;
        this.valueOf = d11TextView;
        this.toString = d11TextView2;
    }
}
