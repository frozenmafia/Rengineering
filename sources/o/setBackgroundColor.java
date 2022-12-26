package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.model.viewmodel.ForgotPasswordVM;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes3.dex */
public abstract class setBackgroundColor extends androidx.databinding.ViewDataBinding {
    public final CustomTextView ag$a;
    public final CustomTextView ah$a;
    public final CustomTextView toString;
    @androidx.databinding.Bindable
    protected ForgotPasswordVM valueOf;
    public final ImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setBackgroundColor(Object obj, View view, int i, ImageView imageView, CustomTextView customTextView, CustomTextView customTextView2, CustomTextView customTextView3) {
        super(obj, view, i);
        this.values = imageView;
        this.ah$a = customTextView;
        this.toString = customTextView2;
        this.ag$a = customTextView3;
    }
}
