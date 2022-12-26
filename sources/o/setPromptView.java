package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.ui.DreamRecyclerView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class setPromptView extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$c;
    public final ImageView ag$a;
    public final androidx.constraintlayout.widget.Guideline ah$a;
    public final D11TextView ah$b;
    @androidx.databinding.Bindable
    protected getHeadsUpContentView toString;
    public final androidx.constraintlayout.widget.Guideline valueOf;
    public final DreamRecyclerView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setPromptView(Object obj, View view, int i, ImageView imageView, androidx.constraintlayout.widget.Guideline guideline, androidx.constraintlayout.widget.Guideline guideline2, DreamRecyclerView dreamRecyclerView, D11TextView d11TextView, D11TextView d11TextView2) {
        super(obj, view, i);
        this.ag$a = imageView;
        this.ah$a = guideline;
        this.valueOf = guideline2;
        this.values = dreamRecyclerView;
        this.ah$b = d11TextView;
        this.HaptikSDK$c = d11TextView2;
    }
}
