package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.chat.viewmodels.ChatMessageVM;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class getNestedScrollAxes extends androidx.databinding.ViewDataBinding {
    public final D11TextView ag$a;
    public final ImageView ah$a;
    @androidx.databinding.Bindable
    protected ChatMessageVM toString;
    public final D11TextView valueOf;
    public final D11TextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public getNestedScrollAxes(Object obj, View view, int i, D11TextView d11TextView, ImageView imageView, D11TextView d11TextView2, D11TextView d11TextView3) {
        super(obj, view, i);
        this.values = d11TextView;
        this.ah$a = imageView;
        this.valueOf = d11TextView2;
        this.ag$a = d11TextView3;
    }
}
