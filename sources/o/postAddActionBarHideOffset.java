package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.chat.viewmodels.ChatMessageVM;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class postAddActionBarHideOffset extends androidx.databinding.ViewDataBinding {
    public final D11TextView ag$a;
    public final D11TextView ah$a;
    public final D11TextView toString;
    public final ImageView valueOf;
    @androidx.databinding.Bindable
    protected ChatMessageVM values;

    /* JADX INFO: Access modifiers changed from: protected */
    public postAddActionBarHideOffset(Object obj, View view, int i, D11TextView d11TextView, ImageView imageView, D11TextView d11TextView2, D11TextView d11TextView3) {
        super(obj, view, i);
        this.toString = d11TextView;
        this.valueOf = imageView;
        this.ag$a = d11TextView2;
        this.ah$a = d11TextView3;
    }
}
