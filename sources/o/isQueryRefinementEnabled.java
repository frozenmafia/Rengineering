package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.app.dream11.chat.EditChatImageVM;
import com.app.dream11.ui.CustomEditTextView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class isQueryRefinementEnabled extends androidx.databinding.ViewDataBinding {
    public final LinearLayout HaptikSDK$a;
    @androidx.databinding.Bindable
    protected EditChatImageVM HaptikSDK$b;
    public final D11TextView HaptikSDK$c;
    public final androidx.constraintlayout.widget.ConstraintLayout HaptikWebView;
    public final ImageView ag$a;
    public final CustomEditTextView ah$a;
    public final ScrollView ah$b;
    public final LinearLayout invoke;
    public final ImageView toString;
    public final ImageView valueOf;
    public final ImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public isQueryRefinementEnabled(Object obj, View view, int i, ImageView imageView, CustomEditTextView customEditTextView, ImageView imageView2, ImageView imageView3, ImageView imageView4, LinearLayout linearLayout, LinearLayout linearLayout2, ScrollView scrollView, D11TextView d11TextView, androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.ag$a = imageView;
        this.ah$a = customEditTextView;
        this.toString = imageView2;
        this.valueOf = imageView3;
        this.values = imageView4;
        this.HaptikSDK$a = linearLayout;
        this.invoke = linearLayout2;
        this.ah$b = scrollView;
        this.HaptikSDK$c = d11TextView;
        this.HaptikWebView = constraintLayout;
    }
}
