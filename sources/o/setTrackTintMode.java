package o;

import android.view.View;
import android.widget.ImageView;
/* loaded from: classes3.dex */
public abstract class setTrackTintMode extends androidx.databinding.ViewDataBinding {
    public final ImageView ag$a;
    @androidx.databinding.Bindable
    protected View.OnClickListener toString;
    public final ImageView valueOf;
    @androidx.databinding.Bindable
    protected Boolean values;

    public abstract void toString(View.OnClickListener onClickListener);

    public abstract void values(Boolean bool);

    /* JADX INFO: Access modifiers changed from: protected */
    public setTrackTintMode(Object obj, View view, int i, ImageView imageView, ImageView imageView2) {
        super(obj, view, i);
        this.ag$a = imageView;
        this.valueOf = imageView2;
    }
}
