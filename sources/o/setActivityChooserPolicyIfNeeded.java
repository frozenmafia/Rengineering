package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.ui.DreamRecyclerView;
import com.dream11.design.button.PrimaryButton;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class setActivityChooserPolicyIfNeeded extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$a;
    public final D11TextView HaptikSDK$b;
    public final D11TextView HaptikSDK$c;
    public final androidx.constraintlayout.widget.ConstraintLayout ag$a;
    @androidx.databinding.Bindable
    protected getFinalY ah$a;
    public final D11TextView ah$b;
    public final View getInitSettings;
    public final View getSignupData;
    public final D11TextView invoke;
    public final DreamRecyclerView toString;
    public final ImageView valueOf;
    public final PrimaryButton values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setActivityChooserPolicyIfNeeded(Object obj, View view, int i, PrimaryButton primaryButton, ImageView imageView, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, DreamRecyclerView dreamRecyclerView, D11TextView d11TextView, D11TextView d11TextView2, D11TextView d11TextView3, D11TextView d11TextView4, D11TextView d11TextView5, View view2, View view3) {
        super(obj, view, i);
        this.values = primaryButton;
        this.valueOf = imageView;
        this.ag$a = constraintLayout;
        this.toString = dreamRecyclerView;
        this.HaptikSDK$c = d11TextView;
        this.invoke = d11TextView2;
        this.HaptikSDK$a = d11TextView3;
        this.ah$b = d11TextView4;
        this.HaptikSDK$b = d11TextView5;
        this.getSignupData = view2;
        this.getInitSettings = view3;
    }
}
