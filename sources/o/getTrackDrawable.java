package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.ui.CircularImageView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class getTrackDrawable extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$a;
    public final D11TextView HaptikSDK$c;
    public final View ag$a;
    @androidx.databinding.Bindable
    protected setIntents ah$a;
    public final ImageView toString;
    public final CircularImageView valueOf;
    public final ImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public getTrackDrawable(Object obj, View view, int i, View view2, ImageView imageView, CircularImageView circularImageView, ImageView imageView2, D11TextView d11TextView, D11TextView d11TextView2) {
        super(obj, view, i);
        this.ag$a = view2;
        this.values = imageView;
        this.valueOf = circularImageView;
        this.toString = imageView2;
        this.HaptikSDK$a = d11TextView;
        this.HaptikSDK$c = d11TextView2;
    }
}
