package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes2.dex */
public abstract class setPopupClipToScreenEnabled extends androidx.databinding.ViewDataBinding {
    public final ImageView ag$a;
    public final androidx.constraintlayout.widget.ConstraintLayout ah$a;
    @androidx.databinding.Bindable
    protected setDynamicShortcuts toString;
    public final CustomTextView valueOf;
    public final ImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setPopupClipToScreenEnabled(Object obj, View view, int i, ImageView imageView, ImageView imageView2, CustomTextView customTextView, androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.values = imageView;
        this.ag$a = imageView2;
        this.valueOf = customTextView;
        this.ah$a = constraintLayout;
    }
}
