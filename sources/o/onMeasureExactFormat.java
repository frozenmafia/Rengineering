package o;

import android.view.View;
import com.app.dream11.chat.viewmodels.RequestCenterItemVM;
import com.app.dream11.ui.CircularImageView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class onMeasureExactFormat extends androidx.databinding.ViewDataBinding {
    public final CircularImageView ag$a;
    public final D11TextView ah$a;
    public final D11TextView toString;
    public final D11TextView valueOf;
    @androidx.databinding.Bindable
    protected RequestCenterItemVM values;

    /* JADX INFO: Access modifiers changed from: protected */
    public onMeasureExactFormat(Object obj, View view, int i, CircularImageView circularImageView, D11TextView d11TextView, D11TextView d11TextView2, D11TextView d11TextView3) {
        super(obj, view, i);
        this.ag$a = circularImageView;
        this.valueOf = d11TextView;
        this.toString = d11TextView2;
        this.ah$a = d11TextView3;
    }
}
