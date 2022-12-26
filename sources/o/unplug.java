package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
/* loaded from: classes4.dex */
public abstract class unplug extends androidx.databinding.ViewDataBinding {
    public final TextView ag$a;
    public final TextView ah$a;
    public final androidx.constraintlayout.widget.ConstraintLayout toString;
    public final androidx.constraintlayout.widget.ConstraintLayout valueOf;
    public final ImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public unplug(Object obj, View view, int i, TextView textView, TextView textView2, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, ImageView imageView, androidx.constraintlayout.widget.ConstraintLayout constraintLayout2) {
        super(obj, view, i);
        this.ag$a = textView;
        this.ah$a = textView2;
        this.toString = constraintLayout;
        this.values = imageView;
        this.valueOf = constraintLayout2;
    }
}
