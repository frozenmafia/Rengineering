package o;

import android.view.View;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes3.dex */
public abstract class displayMenu extends androidx.databinding.ViewDataBinding {
    public final D11TextView ag$a;
    @androidx.databinding.Bindable
    protected applyParameters ah$a;
    public final D11TextView values;

    public abstract void values(applyParameters applyparameters);

    /* JADX INFO: Access modifiers changed from: protected */
    public displayMenu(Object obj, View view, int i, D11TextView d11TextView, D11TextView d11TextView2) {
        super(obj, view, i);
        this.ag$a = d11TextView;
        this.values = d11TextView2;
    }
}
