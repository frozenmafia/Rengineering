package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.social.model.EmptyStateVm;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes3.dex */
public abstract class setThumbDrawable extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected EmptyStateVm ag$a;
    public final ImageView toString;
    public final D11TextView valueOf;

    public abstract void toString(EmptyStateVm emptyStateVm);

    /* JADX INFO: Access modifiers changed from: protected */
    public setThumbDrawable(Object obj, View view, int i, ImageView imageView, D11TextView d11TextView) {
        super(obj, view, i);
        this.toString = imageView;
        this.valueOf = d11TextView;
    }
}
