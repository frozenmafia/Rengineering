package o;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.app.dream11.ui.CircularImageView;
import com.app.dream11.ui.CustomTextView;
import com.dream11.design.textview.D11TextView;
import o.addPages;
/* loaded from: classes2.dex */
public abstract class getCompoundDrawableTintList extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$a;
    public final CustomTextView HaptikSDK$b;
    public final D11TextView HaptikSDK$c;
    public final ImageView ag$a;
    public final CircularImageView ah$a;
    public final FrameLayout toString;
    @androidx.databinding.Bindable
    protected addPages.values valueOf;
    public final ImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public getCompoundDrawableTintList(Object obj, View view, int i, CircularImageView circularImageView, ImageView imageView, ImageView imageView2, FrameLayout frameLayout, D11TextView d11TextView, CustomTextView customTextView, D11TextView d11TextView2) {
        super(obj, view, i);
        this.ah$a = circularImageView;
        this.values = imageView;
        this.ag$a = imageView2;
        this.toString = frameLayout;
        this.HaptikSDK$a = d11TextView;
        this.HaptikSDK$b = customTextView;
        this.HaptikSDK$c = d11TextView2;
    }
}
