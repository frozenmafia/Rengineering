package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.chat.groups.GroupBottomSheetItemVM;
import com.app.dream11.ui.CircularImageView;
import com.app.dream11.ui.CustomTextView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class verifyDrawable extends androidx.databinding.ViewDataBinding {
    public final ImageView ag$a;
    @androidx.databinding.Bindable
    protected GroupBottomSheetItemVM ah$a;
    public final D11TextView ah$b;
    public final CustomTextView invoke;
    public final ImageView toString;
    public final CircularImageView valueOf;
    public final CustomTextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public verifyDrawable(Object obj, View view, int i, CircularImageView circularImageView, ImageView imageView, ImageView imageView2, CustomTextView customTextView, D11TextView d11TextView, CustomTextView customTextView2) {
        super(obj, view, i);
        this.valueOf = circularImageView;
        this.toString = imageView;
        this.ag$a = imageView2;
        this.values = customTextView;
        this.ah$b = d11TextView;
        this.invoke = customTextView2;
    }
}
