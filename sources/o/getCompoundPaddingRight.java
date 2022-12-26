package o;

import android.view.View;
import android.widget.LinearLayout;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes2.dex */
public abstract class getCompoundPaddingRight extends androidx.databinding.ViewDataBinding {
    public final CustomTextView HaptikSDK$a;
    public final CustomTextView HaptikSDK$c;
    public final LinearLayout ag$a;
    public final LinearLayout ah$a;
    public final CustomTextView ah$b;
    @androidx.databinding.Bindable
    protected kotlin.Pair<String, String> toString;
    public final CustomTextView valueOf;
    @androidx.databinding.Bindable
    protected kotlin.Pair<String, String> values;

    public abstract void ag$a(kotlin.Pair<String, String> pair);

    public abstract void toString(kotlin.Pair<String, String> pair);

    /* JADX INFO: Access modifiers changed from: protected */
    public getCompoundPaddingRight(Object obj, View view, int i, LinearLayout linearLayout, LinearLayout linearLayout2, CustomTextView customTextView, CustomTextView customTextView2, CustomTextView customTextView3, CustomTextView customTextView4) {
        super(obj, view, i);
        this.ag$a = linearLayout;
        this.ah$a = linearLayout2;
        this.valueOf = customTextView;
        this.HaptikSDK$a = customTextView2;
        this.HaptikSDK$c = customTextView3;
        this.ah$b = customTextView4;
    }

    public kotlin.Pair<String, String> valueOf() {
        return this.toString;
    }
}
