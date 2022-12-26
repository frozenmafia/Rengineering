package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.ui.CircularImageView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class populateSurroundingTextIfNeeded extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$c;
    public final ImageView ag$a;
    public final D11TextView ah$a;
    @androidx.databinding.Bindable
    protected addHistoricMessage toString;
    public final CircularImageView valueOf;
    public final D11TextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public populateSurroundingTextIfNeeded(Object obj, View view, int i, ImageView imageView, CircularImageView circularImageView, D11TextView d11TextView, D11TextView d11TextView2, D11TextView d11TextView3) {
        super(obj, view, i);
        this.ag$a = imageView;
        this.valueOf = circularImageView;
        this.values = d11TextView;
        this.ah$a = d11TextView2;
        this.HaptikSDK$c = d11TextView3;
    }
}
