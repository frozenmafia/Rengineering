package o;

import android.view.View;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.DreamRecyclerView;
import o.SharedPreferencesCompat;
/* loaded from: classes2.dex */
public abstract class getMeasuredHeightWithMargins extends androidx.databinding.ViewDataBinding {
    public final androidx.constraintlayout.widget.Barrier ag$a;
    public final DreamRecyclerView ah$a;
    @androidx.databinding.Bindable
    protected SharedPreferencesCompat.EditorCompat.Helper toString;
    public final CustomTextView valueOf;
    public final CustomTextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public getMeasuredHeightWithMargins(Object obj, View view, int i, androidx.constraintlayout.widget.Barrier barrier, DreamRecyclerView dreamRecyclerView, CustomTextView customTextView, CustomTextView customTextView2) {
        super(obj, view, i);
        this.ag$a = barrier;
        this.ah$a = dreamRecyclerView;
        this.valueOf = customTextView;
        this.values = customTextView2;
    }
}
