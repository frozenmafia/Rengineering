package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.DreamRecyclerView;
/* loaded from: classes2.dex */
public abstract class FitWindowsLinearLayout extends androidx.databinding.ViewDataBinding {
    public final View HaptikSDK$a;
    @androidx.databinding.Bindable
    protected onFitSystemWindows ag$a;
    public final CustomTextView ah$a;
    public final CustomTextView invoke;
    public final ImageView toString;
    public final DreamRecyclerView valueOf;
    public final ImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public FitWindowsLinearLayout(Object obj, View view, int i, ImageView imageView, ImageView imageView2, DreamRecyclerView dreamRecyclerView, CustomTextView customTextView, CustomTextView customTextView2, View view2) {
        super(obj, view, i);
        this.values = imageView;
        this.toString = imageView2;
        this.valueOf = dreamRecyclerView;
        this.ah$a = customTextView;
        this.invoke = customTextView2;
        this.HaptikSDK$a = view2;
    }
}
