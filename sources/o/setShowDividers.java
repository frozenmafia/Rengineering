package o;

import android.view.View;
import com.app.dream11.ui.DreamRecyclerView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class setShowDividers extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$c;
    public final DreamRecyclerView ag$a;
    public final setTrackTintMode ah$a;
    public final D11TextView ah$b;
    public final androidx.constraintlayout.widget.Guideline toString;
    public final androidx.constraintlayout.widget.Guideline valueOf;
    @androidx.databinding.Bindable
    protected makeMessageLine values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setShowDividers(Object obj, View view, int i, setTrackTintMode settracktintmode, androidx.constraintlayout.widget.Guideline guideline, androidx.constraintlayout.widget.Guideline guideline2, DreamRecyclerView dreamRecyclerView, D11TextView d11TextView, D11TextView d11TextView2) {
        super(obj, view, i);
        this.ah$a = settracktintmode;
        this.toString = guideline;
        this.valueOf = guideline2;
        this.ag$a = dreamRecyclerView;
        this.HaptikSDK$c = d11TextView;
        this.ah$b = d11TextView2;
    }
}
