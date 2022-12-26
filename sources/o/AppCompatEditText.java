package o;

import android.view.View;
import android.widget.ImageView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class AppCompatEditText extends androidx.databinding.ViewDataBinding {
    public final D11TextView ag$a;
    public final ImageView ah$a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AppCompatEditText(Object obj, View view, int i, ImageView imageView, D11TextView d11TextView) {
        super(obj, view, i);
        this.ah$a = imageView;
        this.ag$a = d11TextView;
    }
}
