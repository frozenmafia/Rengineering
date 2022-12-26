package o;

import android.view.View;
import android.widget.ImageView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class AppCompatHintHelper extends androidx.databinding.ViewDataBinding {
    public final ImageView ag$a;
    @androidx.databinding.Bindable
    protected transformPivotX ah$a;
    public final D11TextView toString;
    public final androidx.constraintlayout.widget.ConstraintLayout valueOf;
    public final ImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public AppCompatHintHelper(Object obj, View view, int i, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, D11TextView d11TextView) {
        super(obj, view, i);
        this.valueOf = constraintLayout;
        this.ag$a = imageView;
        this.values = imageView2;
        this.toString = d11TextView;
    }
}
