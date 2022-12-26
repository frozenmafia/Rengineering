package o;

import android.view.View;
import com.app.dream11.ui.DreamRecyclerView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class findLargestTextSizeWhichFits extends androidx.databinding.ViewDataBinding {
    public final D11TextView ag$a;
    public final androidx.constraintlayout.widget.Guideline ah$a;
    public final D11TextView ah$b;
    @androidx.databinding.Bindable
    protected AppCompatDialog toString;
    public final D11TextView valueOf;
    public final DreamRecyclerView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public findLargestTextSizeWhichFits(Object obj, View view, int i, DreamRecyclerView dreamRecyclerView, androidx.constraintlayout.widget.Guideline guideline, D11TextView d11TextView, D11TextView d11TextView2, D11TextView d11TextView3) {
        super(obj, view, i);
        this.values = dreamRecyclerView;
        this.ah$a = guideline;
        this.ag$a = d11TextView;
        this.valueOf = d11TextView2;
        this.ah$b = d11TextView3;
    }
}
