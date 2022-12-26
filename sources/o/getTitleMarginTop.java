package o;

import android.view.View;
import com.app.dream11.chat.viewmodels.GroupJoinVM;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.DreamRecyclerView;
/* loaded from: classes3.dex */
public abstract class getTitleMarginTop extends androidx.databinding.ViewDataBinding {
    public final DreamRecyclerView ag$a;
    @androidx.databinding.Bindable
    protected GroupJoinVM ah$a;
    public final CustomTextView toString;
    public final CustomTextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public getTitleMarginTop(Object obj, View view, int i, DreamRecyclerView dreamRecyclerView, CustomTextView customTextView, CustomTextView customTextView2) {
        super(obj, view, i);
        this.ag$a = dreamRecyclerView;
        this.toString = customTextView;
        this.values = customTextView2;
    }
}
