package o;

import android.view.View;
import android.widget.TextView;
/* loaded from: classes4.dex */
public abstract class activeStateChanged extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected Boolean ag$a;
    public final TextView ah$a;
    public final TextView toString;

    /* JADX INFO: Access modifiers changed from: protected */
    public activeStateChanged(Object obj, View view, int i, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.toString = textView;
        this.ah$a = textView2;
    }
}
