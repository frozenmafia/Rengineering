package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.app.dream11.chat.viewmodels.UrlPreviewVM;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes3.dex */
public abstract class hasNext extends androidx.databinding.ViewDataBinding {
    public final CustomTextView ag$a;
    public final CustomTextView ah$a;
    public final LinearLayout invoke;
    @androidx.databinding.Bindable
    protected UrlPreviewVM toString;
    public final ImageView valueOf;
    public final CustomTextView values;

    public abstract void valueOf(UrlPreviewVM urlPreviewVM);

    /* JADX INFO: Access modifiers changed from: protected */
    public hasNext(Object obj, View view, int i, CustomTextView customTextView, ImageView imageView, CustomTextView customTextView2, CustomTextView customTextView3, LinearLayout linearLayout) {
        super(obj, view, i);
        this.ah$a = customTextView;
        this.valueOf = imageView;
        this.ag$a = customTextView2;
        this.values = customTextView3;
        this.invoke = linearLayout;
    }
}
