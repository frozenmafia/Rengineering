package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes2.dex */
public abstract class obtainTypedArray extends androidx.databinding.ViewDataBinding {
    public final CustomTextView ag$a;
    @androidx.databinding.Bindable
    protected addChildrenToSolverByDependency ah$a;
    public final ImageView toString;
    public final CustomTextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public obtainTypedArray(Object obj, View view, int i, ImageView imageView, CustomTextView customTextView, CustomTextView customTextView2) {
        super(obj, view, i);
        this.toString = imageView;
        this.values = customTextView;
        this.ag$a = customTextView2;
    }
}
