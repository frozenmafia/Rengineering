package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.chat.viewmodels.RequestCenterItemVM;
import com.app.dream11.ui.CircularImageView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class setPopupBackgroundDrawable extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$a;
    public final D11TextView HaptikSDK$b;
    public final CircularImageView ag$a;
    @androidx.databinding.Bindable
    protected RequestCenterItemVM ah$a;
    public final D11TextView invoke;
    public final androidx.constraintlayout.widget.Barrier toString;
    public final ImageView valueOf;
    public final ImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setPopupBackgroundDrawable(Object obj, View view, int i, androidx.constraintlayout.widget.Barrier barrier, CircularImageView circularImageView, ImageView imageView, ImageView imageView2, D11TextView d11TextView, D11TextView d11TextView2, D11TextView d11TextView3) {
        super(obj, view, i);
        this.toString = barrier;
        this.ag$a = circularImageView;
        this.valueOf = imageView;
        this.values = imageView2;
        this.HaptikSDK$b = d11TextView;
        this.invoke = d11TextView2;
        this.HaptikSDK$a = d11TextView3;
    }
}
