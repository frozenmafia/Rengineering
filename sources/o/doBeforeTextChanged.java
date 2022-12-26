package o;

import android.view.View;
import com.app.dream11.ui.DreamRecyclerView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class doBeforeTextChanged extends androidx.databinding.ViewDataBinding {
    public final D11TextView ag$a;
    @androidx.databinding.Bindable
    protected constrainCircle ah$a;
    public final DreamRecyclerView valueOf;

    /* JADX INFO: Access modifiers changed from: protected */
    public doBeforeTextChanged(Object obj, View view, int i, D11TextView d11TextView, DreamRecyclerView dreamRecyclerView) {
        super(obj, view, i);
        this.ag$a = d11TextView;
        this.valueOf = dreamRecyclerView;
    }
}
