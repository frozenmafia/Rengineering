package o;

import android.view.View;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes3.dex */
public abstract class TintInfo extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected View.OnClickListener ah$a;
    public final CustomTextView values;

    public abstract void values(View.OnClickListener onClickListener);

    /* JADX INFO: Access modifiers changed from: protected */
    public TintInfo(Object obj, View view, int i, CustomTextView customTextView) {
        super(obj, view, i);
        this.values = customTextView;
    }
}
