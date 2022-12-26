package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.model.EmptyStateVm;
import com.app.dream11.ui.CustomButton;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes2.dex */
public abstract class getResourceEntryName extends androidx.databinding.ViewDataBinding {
    public final ImageView ag$a;
    @androidx.databinding.Bindable
    protected EmptyStateVm ah$a;
    public final CustomTextView toString;
    public final CustomTextView valueOf;
    public final CustomButton values;

    /* JADX INFO: Access modifiers changed from: protected */
    public getResourceEntryName(Object obj, View view, int i, CustomButton customButton, CustomTextView customTextView, CustomTextView customTextView2, ImageView imageView) {
        super(obj, view, i);
        this.values = customButton;
        this.valueOf = customTextView;
        this.toString = customTextView2;
        this.ag$a = imageView;
    }
}
