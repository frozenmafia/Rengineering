package o;

import android.view.View;
import android.widget.ImageView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes3.dex */
public abstract class setDelegate extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected compatGetBinder ag$a;
    public final D11TextView ah$a;
    public final ImageView toString;
    public final ImageView valueOf;
    public final ImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setDelegate(Object obj, View view, int i, ImageView imageView, ImageView imageView2, ImageView imageView3, D11TextView d11TextView) {
        super(obj, view, i);
        this.toString = imageView;
        this.valueOf = imageView2;
        this.values = imageView3;
        this.ah$a = d11TextView;
    }
}
