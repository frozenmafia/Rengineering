package o;

import android.view.View;
import com.app.dream11.core.performance.D11LinearLayoutTracker;
/* loaded from: classes2.dex */
public abstract class AppCompatTextView extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected setOnDismissListener ag$a;
    public final D11LinearLayoutTracker toString;

    /* JADX INFO: Access modifiers changed from: protected */
    public AppCompatTextView(Object obj, View view, int i, D11LinearLayoutTracker d11LinearLayoutTracker) {
        super(obj, view, i);
        this.toString = d11LinearLayoutTracker;
    }
}
