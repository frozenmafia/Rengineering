package o;

import android.view.View;
import android.widget.LinearLayout;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes2.dex */
public abstract class addDelegate extends androidx.databinding.ViewDataBinding {
    public final CustomTextView ag$a;
    public final View ah$a;
    public final CustomTextView toString;
    public final LinearLayout valueOf;
    @androidx.databinding.Bindable
    protected setRecycleOnMeasureEnabled values;

    /* JADX INFO: Access modifiers changed from: protected */
    public addDelegate(Object obj, View view, int i, View view2, LinearLayout linearLayout, CustomTextView customTextView, CustomTextView customTextView2) {
        super(obj, view, i);
        this.ah$a = view2;
        this.valueOf = linearLayout;
        this.toString = customTextView;
        this.ag$a = customTextView2;
    }
}
