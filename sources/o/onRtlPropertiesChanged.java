package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.chat.viewmodels.UserGlRankVm;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes3.dex */
public abstract class onRtlPropertiesChanged extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected UserGlRankVm ag$a;
    public final ImageView ah$a;
    public final D11TextView toString;
    public final ImageView valueOf;
    public final D11TextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public onRtlPropertiesChanged(Object obj, View view, int i, ImageView imageView, ImageView imageView2, D11TextView d11TextView, D11TextView d11TextView2) {
        super(obj, view, i);
        this.valueOf = imageView;
        this.ah$a = imageView2;
        this.toString = d11TextView;
        this.values = d11TextView2;
    }
}
