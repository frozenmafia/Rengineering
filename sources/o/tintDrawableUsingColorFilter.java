package o;

import android.view.View;
import com.app.dream11.chat.groupshare.model.SelectGroupItemVM;
import com.app.dream11.ui.CircularImageView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class tintDrawableUsingColorFilter extends androidx.databinding.ViewDataBinding {
    public final D11TextView ag$a;
    public final D11TextView ah$a;
    public final CircularImageView valueOf;
    @androidx.databinding.Bindable
    protected SelectGroupItemVM values;

    /* JADX INFO: Access modifiers changed from: protected */
    public tintDrawableUsingColorFilter(Object obj, View view, int i, CircularImageView circularImageView, D11TextView d11TextView, D11TextView d11TextView2) {
        super(obj, view, i);
        this.valueOf = circularImageView;
        this.ah$a = d11TextView;
        this.ag$a = d11TextView2;
    }
}
