package o;

import android.view.View;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.DreamRecyclerView;
/* loaded from: classes3.dex */
public abstract class layoutChildRight extends androidx.databinding.ViewDataBinding {
    public final DreamRecyclerView ag$a;
    @androidx.databinding.Bindable
    protected WidgetRun ah$a;
    public final CustomTextView valueOf;

    public abstract void ag$a(WidgetRun widgetRun);

    /* JADX INFO: Access modifiers changed from: protected */
    public layoutChildRight(Object obj, View view, int i, DreamRecyclerView dreamRecyclerView, CustomTextView customTextView) {
        super(obj, view, i);
        this.ag$a = dreamRecyclerView;
        this.valueOf = customTextView;
    }
}
