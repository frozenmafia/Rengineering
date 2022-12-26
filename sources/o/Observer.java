package o;

import android.view.View;
import android.widget.TextView;
/* loaded from: classes4.dex */
public abstract class Observer extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected C0382lifecycleEventObserver toString;
    public final TextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public Observer(Object obj, View view, int i, TextView textView) {
        super(obj, view, i);
        this.values = textView;
    }
}
