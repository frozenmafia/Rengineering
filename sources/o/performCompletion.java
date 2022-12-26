package o;

import android.view.View;
import android.widget.ProgressBar;
import com.app.dream11.core.ui.D11ErrorFrameLayout;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.DreamRecyclerView;
/* loaded from: classes2.dex */
public abstract class performCompletion extends androidx.databinding.ViewDataBinding {
    public final ProgressBar ag$a;
    public final CustomTextView ah$a;
    public final DreamRecyclerView toString;
    public final D11ErrorFrameLayout valueOf;
    @androidx.databinding.Bindable
    protected onActivityStarted values;

    /* JADX INFO: Access modifiers changed from: protected */
    public performCompletion(Object obj, View view, int i, D11ErrorFrameLayout d11ErrorFrameLayout, ProgressBar progressBar, CustomTextView customTextView, DreamRecyclerView dreamRecyclerView) {
        super(obj, view, i);
        this.valueOf = d11ErrorFrameLayout;
        this.ag$a = progressBar;
        this.ah$a = customTextView;
        this.toString = dreamRecyclerView;
    }
}
