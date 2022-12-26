package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.chat.viewmodels.MessageRequestVM;
import com.app.dream11.ui.CircularImageView;
import com.app.dream11.ui.CustomEditTextView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class onTouch extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected MessageRequestVM HaptikSDK$a;
    public final D11TextView HaptikSDK$b;
    public final androidx.constraintlayout.widget.ConstraintLayout HaptikSDK$c;
    public final D11TextView HaptikSDK$e;
    public final D11TextView HaptikWebView;
    public final ImageView ag$a;
    public final CircularImageView ah$a;
    public final ImageView ah$b;
    public final D11TextView getSignupData;
    public final androidx.constraintlayout.widget.ConstraintLayout invoke;
    public final View toString;
    public final CustomEditTextView valueOf;
    public final androidx.coordinatorlayout.widget.CoordinatorLayout values;

    /* JADX INFO: Access modifiers changed from: protected */
    public onTouch(Object obj, View view, int i, View view2, androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, CustomEditTextView customEditTextView, ImageView imageView, CircularImageView circularImageView, ImageView imageView2, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, androidx.constraintlayout.widget.ConstraintLayout constraintLayout2, D11TextView d11TextView, D11TextView d11TextView2, D11TextView d11TextView3, D11TextView d11TextView4) {
        super(obj, view, i);
        this.toString = view2;
        this.values = coordinatorLayout;
        this.valueOf = customEditTextView;
        this.ag$a = imageView;
        this.ah$a = circularImageView;
        this.ah$b = imageView2;
        this.invoke = constraintLayout;
        this.HaptikSDK$c = constraintLayout2;
        this.HaptikSDK$b = d11TextView;
        this.HaptikSDK$e = d11TextView2;
        this.getSignupData = d11TextView3;
        this.HaptikWebView = d11TextView4;
    }
}
