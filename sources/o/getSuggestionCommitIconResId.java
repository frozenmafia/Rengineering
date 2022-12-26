package o;

import android.view.View;
import com.app.dream11.chat.viewmodels.Dream11ContactsListVM;
import com.app.dream11.ui.DreamRecyclerView;
import com.dream11.design.button.D11Button;
/* loaded from: classes2.dex */
public abstract class getSuggestionCommitIconResId extends androidx.databinding.ViewDataBinding {
    public final DreamRecyclerView ag$a;
    @androidx.databinding.Bindable
    protected Dream11ContactsListVM ah$a;
    public final androidx.constraintlayout.widget.ConstraintLayout toString;
    public final D11Button valueOf;

    /* JADX INFO: Access modifiers changed from: protected */
    public getSuggestionCommitIconResId(Object obj, View view, int i, D11Button d11Button, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, DreamRecyclerView dreamRecyclerView) {
        super(obj, view, i);
        this.valueOf = d11Button;
        this.toString = constraintLayout;
        this.ag$a = dreamRecyclerView;
    }
}
