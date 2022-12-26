package o;

import android.view.View;
import android.widget.RadioButton;
import com.app.dream11.core.service.graphql.api.GetTransactionOptionsQuery;
/* loaded from: classes3.dex */
public abstract class setValue extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected AnimRes ag$a;
    @androidx.databinding.Bindable
    protected GetTransactionOptionsQuery.RecentTxnOption ah$a;
    @androidx.databinding.Bindable
    protected GetTransactionOptionsQuery.RecentTxnOption toString;
    public final RadioButton values;

    /* JADX INFO: Access modifiers changed from: protected */
    public setValue(Object obj, View view, int i, RadioButton radioButton) {
        super(obj, view, i);
        this.values = radioButton;
    }
}
