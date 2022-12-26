package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes2.dex */
public abstract class onSetButtonDrawable extends androidx.databinding.ViewDataBinding {
    public final CustomTextView ah$a;
    public final CustomTextView toString;
    public final ImageView valueOf;
    @androidx.databinding.Bindable
    protected parsePathStrategy values;

    /* JADX INFO: Access modifiers changed from: protected */
    public onSetButtonDrawable(Object obj, View view, int i, ImageView imageView, CustomTextView customTextView, CustomTextView customTextView2) {
        super(obj, view, i);
        this.valueOf = imageView;
        this.ah$a = customTextView;
        this.toString = customTextView2;
    }
}
