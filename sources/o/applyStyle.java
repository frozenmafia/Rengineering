package o;

import android.view.View;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes3.dex */
public abstract class applyStyle extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected setMeasureRequested ag$a;
    public final CustomTextView valueOf;

    public abstract void values(setMeasureRequested setmeasurerequested);

    /* JADX INFO: Access modifiers changed from: protected */
    public applyStyle(Object obj, View view, int i, CustomTextView customTextView) {
        super(obj, view, i);
        this.valueOf = customTextView;
    }
}
