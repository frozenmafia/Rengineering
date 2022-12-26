package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.core.performance.D11LinearLayoutTracker;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class addDrawableToCache extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected setPositiveButtonIcon ag$a;
    public final D11TextView ah$a;
    public final D11TextView ah$b;
    @androidx.databinding.Bindable
    protected Integer toString;
    public final ImageView valueOf;
    public final D11LinearLayoutTracker values;

    /* JADX INFO: Access modifiers changed from: protected */
    public addDrawableToCache(Object obj, View view, int i, ImageView imageView, D11LinearLayoutTracker d11LinearLayoutTracker, D11TextView d11TextView, D11TextView d11TextView2) {
        super(obj, view, i);
        this.valueOf = imageView;
        this.values = d11LinearLayoutTracker;
        this.ah$a = d11TextView;
        this.ah$b = d11TextView2;
    }
}
