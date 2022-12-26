package o;

import android.view.View;
import android.widget.LinearLayout;
import com.app.dream11.ui.DreamRecyclerView;
/* loaded from: classes2.dex */
public abstract class getBaseline extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected onCreatePanelView ah$a;
    public final DreamRecyclerView valueOf;
    public final LinearLayout values;

    /* JADX INFO: Access modifiers changed from: protected */
    public getBaseline(Object obj, View view, int i, LinearLayout linearLayout, DreamRecyclerView dreamRecyclerView) {
        super(obj, view, i);
        this.values = linearLayout;
        this.valueOf = dreamRecyclerView;
    }
}
