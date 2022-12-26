package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes2.dex */
public abstract class setDividerDrawable extends androidx.databinding.ViewDataBinding {
    public final CustomTextView HaptikSDK$b;
    @androidx.databinding.Bindable
    protected addCancellationListener ag$a;
    public final ImageView ah$a;
    public final CustomTextView ah$b;
    @androidx.databinding.Bindable
    protected String toString;
    @androidx.databinding.Bindable
    protected String valueOf;
    public final ImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setDividerDrawable(Object obj, View view, int i, ImageView imageView, ImageView imageView2, CustomTextView customTextView, CustomTextView customTextView2) {
        super(obj, view, i);
        this.ah$a = imageView;
        this.values = imageView2;
        this.HaptikSDK$b = customTextView;
        this.ah$b = customTextView2;
    }
}
