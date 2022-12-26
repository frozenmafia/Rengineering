package o;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.app.dream11.model.viewmodel.ManageWalletVM;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes3.dex */
public abstract class readStyleByVersion extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected ManageWalletVM ag$a;
    public final Button ah$a;
    public final CustomTextView toString;
    public final FrameLayout valueOf;
    public final ProgressBar values;

    /* JADX INFO: Access modifiers changed from: protected */
    public readStyleByVersion(Object obj, View view, int i, Button button, ProgressBar progressBar, FrameLayout frameLayout, CustomTextView customTextView) {
        super(obj, view, i);
        this.ah$a = button;
        this.values = progressBar;
        this.valueOf = frameLayout;
        this.toString = customTextView;
    }
}
