package o;

import android.view.View;
import android.widget.LinearLayout;
/* loaded from: classes3.dex */
public abstract class itemType extends androidx.databinding.ViewDataBinding {
    public final LinearLayout valueOf;
    @androidx.databinding.Bindable
    protected Boolean values;

    /* JADX INFO: Access modifiers changed from: protected */
    public itemType(Object obj, View view, int i, LinearLayout linearLayout) {
        super(obj, view, i);
        this.valueOf = linearLayout;
    }
}
