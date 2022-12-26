package o;

import android.view.View;
import android.widget.LinearLayout;
import com.app.dream11.chat.viewmodels.ExitOrBlockUserVM;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes2.dex */
public abstract class isFocused extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected ExitOrBlockUserVM ah$a;
    public final CustomTextView toString;
    public final LinearLayout valueOf;
    public final CustomTextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public isFocused(Object obj, View view, int i, CustomTextView customTextView, CustomTextView customTextView2, LinearLayout linearLayout) {
        super(obj, view, i);
        this.toString = customTextView;
        this.values = customTextView2;
        this.valueOf = linearLayout;
    }
}
