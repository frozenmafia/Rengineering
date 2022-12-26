package o;

import android.view.View;
import com.app.dream11.ui.CustomTextView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class killMode extends androidx.databinding.ViewDataBinding {
    public final D11TextView toString;
    public final CustomTextView valueOf;
    @androidx.databinding.Bindable
    protected Reference values;

    /* JADX INFO: Access modifiers changed from: protected */
    public killMode(Object obj, View view, int i, CustomTextView customTextView, D11TextView d11TextView) {
        super(obj, view, i);
        this.valueOf = customTextView;
        this.toString = d11TextView;
    }
}
