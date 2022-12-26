package o;

import android.view.View;
import android.widget.ImageView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes.dex */
public abstract class releaseRequest extends androidx.databinding.ViewDataBinding {
    public final ImageView ag$a;
    public final D11TextView ah$a;
    public final D11TextView toString;
    public final D11TextView valueOf;
    public final androidx.appcompat.widget.AppCompatImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public releaseRequest(Object obj, View view, int i, D11TextView d11TextView, androidx.appcompat.widget.AppCompatImageView appCompatImageView, ImageView imageView, D11TextView d11TextView2, D11TextView d11TextView3) {
        super(obj, view, i);
        this.ah$a = d11TextView;
        this.values = appCompatImageView;
        this.ag$a = imageView;
        this.valueOf = d11TextView2;
        this.toString = d11TextView3;
    }
}
