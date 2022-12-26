package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.app.dream11.chat.viewmodels.UrlPreviewVM;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes3.dex */
public abstract class setDropDownViewTheme extends androidx.databinding.ViewDataBinding {
    public final ImageView ah$a;
    @androidx.databinding.Bindable
    protected UrlPreviewVM toString;
    public final LinearLayout valueOf;
    public final CustomTextView values;

    public abstract void ah$a(UrlPreviewVM urlPreviewVM);

    /* JADX INFO: Access modifiers changed from: protected */
    public setDropDownViewTheme(Object obj, View view, int i, ImageView imageView, LinearLayout linearLayout, CustomTextView customTextView) {
        super(obj, view, i);
        this.ah$a = imageView;
        this.valueOf = linearLayout;
        this.values = customTextView;
    }
}
