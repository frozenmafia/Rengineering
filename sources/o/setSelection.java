package o;

import android.view.View;
import com.app.dream11.ui.DreamRecyclerView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class setSelection extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected makeMessageLine ag$a;
    public final D11TextView ah$a;
    public final D11TextView ah$b;
    public final DreamRecyclerView toString;
    public final androidx.constraintlayout.widget.Guideline valueOf;
    public final androidx.constraintlayout.widget.Guideline values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setSelection(Object obj, View view, int i, androidx.constraintlayout.widget.Guideline guideline, androidx.constraintlayout.widget.Guideline guideline2, DreamRecyclerView dreamRecyclerView, D11TextView d11TextView, D11TextView d11TextView2) {
        super(obj, view, i);
        this.values = guideline;
        this.valueOf = guideline2;
        this.toString = dreamRecyclerView;
        this.ah$a = d11TextView;
        this.ah$b = d11TextView2;
    }
}
