package o;

import android.view.View;
import com.app.dream11.ui.CircularImageView;
import com.dream11.design.button.D11Button;
import com.dream11.design.textview.D11TextView;
import o.CoordinatorLayout;
/* loaded from: classes2.dex */
public abstract class onLayout extends androidx.databinding.ViewDataBinding {
    public final D11Button ag$a;
    public final CircularImageView ah$a;
    @androidx.databinding.Bindable
    protected CoordinatorLayout.OnPreDrawListener toString;
    public final D11TextView valueOf;
    @androidx.databinding.Bindable
    protected Integer values;

    /* JADX INFO: Access modifiers changed from: protected */
    public onLayout(Object obj, View view, int i, D11Button d11Button, CircularImageView circularImageView, D11TextView d11TextView) {
        super(obj, view, i);
        this.ag$a = d11Button;
        this.ah$a = circularImageView;
        this.valueOf = d11TextView;
    }
}
