package o;

import android.view.View;
import android.widget.LinearLayout;
import com.app.dream11.newmycontests.playerstats.ui.CustomHorizontalScrollView;
import com.app.dream11.ui.CustomTextView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class areAllItemsEnabled extends androidx.databinding.ViewDataBinding {
    public final CustomTextView HaptikSDK$a;
    public final CustomTextView HaptikSDK$b;
    public final androidx.constraintlayout.widget.ConstraintLayout HaptikSDK$c;
    public final View ag$a;
    public final LinearLayout ah$a;
    public final androidx.appcompat.widget.AppCompatImageView ah$b;
    public final D11TextView invoke;
    @androidx.databinding.Bindable
    protected setMinWidth toString;
    public final View valueOf;
    public final CustomHorizontalScrollView values;

    public abstract void ag$a(setMinWidth setminwidth);

    /* JADX INFO: Access modifiers changed from: protected */
    public areAllItemsEnabled(Object obj, View view, int i, View view2, View view3, CustomHorizontalScrollView customHorizontalScrollView, LinearLayout linearLayout, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, androidx.appcompat.widget.AppCompatImageView appCompatImageView, CustomTextView customTextView, CustomTextView customTextView2, D11TextView d11TextView) {
        super(obj, view, i);
        this.ag$a = view2;
        this.valueOf = view3;
        this.values = customHorizontalScrollView;
        this.ah$a = linearLayout;
        this.HaptikSDK$c = constraintLayout;
        this.ah$b = appCompatImageView;
        this.HaptikSDK$a = customTextView;
        this.HaptikSDK$b = customTextView2;
        this.invoke = d11TextView;
    }
}
