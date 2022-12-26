package o;

import android.view.View;
import android.widget.LinearLayout;
import com.app.dream11.chat.groups.GroupShareVM;
import com.app.dream11.ui.CircularImageView;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes3.dex */
public abstract class setContentInsetsRelative extends androidx.databinding.ViewDataBinding {
    public final CustomTextView HaptikSDK$a;
    public final CustomTextView HaptikSDK$c;
    public final View ag$a;
    public final CircularImageView ah$a;
    public final CustomTextView ah$b;
    public final CustomTextView invoke;
    public final onCreateDrawableState toString;
    @androidx.databinding.Bindable
    protected GroupShareVM valueOf;
    public final LinearLayout values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setContentInsetsRelative(Object obj, View view, int i, View view2, CircularImageView circularImageView, LinearLayout linearLayout, onCreateDrawableState oncreatedrawablestate, CustomTextView customTextView, CustomTextView customTextView2, CustomTextView customTextView3, CustomTextView customTextView4) {
        super(obj, view, i);
        this.ag$a = view2;
        this.ah$a = circularImageView;
        this.values = linearLayout;
        this.toString = oncreatedrawablestate;
        this.HaptikSDK$c = customTextView;
        this.HaptikSDK$a = customTextView2;
        this.invoke = customTextView3;
        this.ah$b = customTextView4;
    }
}
