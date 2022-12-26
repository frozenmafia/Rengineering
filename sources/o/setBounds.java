package o;

import android.view.View;
import android.widget.ProgressBar;
import com.app.dream11.core.ui.D11ErrorFrameLayout;
import com.app.dream11.ui.DreamRecyclerView;
/* loaded from: classes2.dex */
public abstract class setBounds extends androidx.databinding.ViewDataBinding {
    public final D11ErrorFrameLayout ag$a;
    public final androidx.swiperefreshlayout.widget.SwipeRefreshLayout ah$a;
    public final DreamRecyclerView toString;
    public final ProgressBar valueOf;
    @androidx.databinding.Bindable
    protected checkOnClickListener values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setBounds(Object obj, View view, int i, D11ErrorFrameLayout d11ErrorFrameLayout, ProgressBar progressBar, androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout, DreamRecyclerView dreamRecyclerView) {
        super(obj, view, i);
        this.ag$a = d11ErrorFrameLayout;
        this.valueOf = progressBar;
        this.ah$a = swipeRefreshLayout;
        this.toString = dreamRecyclerView;
    }
}
