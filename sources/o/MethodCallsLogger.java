package o;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import o.LiveData;
/* loaded from: classes4.dex */
public abstract class MethodCallsLogger extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected LiveData.valueOf ag$a;
    @androidx.databinding.Bindable
    protected LiveData ah$a;
    public final TextView ah$b;
    @androidx.databinding.Bindable
    protected Integer invoke;
    public final LinearLayout toString;
    public final FrameLayout valueOf;
    public final TextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public MethodCallsLogger(Object obj, View view, int i, LinearLayout linearLayout, FrameLayout frameLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.toString = linearLayout;
        this.valueOf = frameLayout;
        this.values = textView;
        this.ah$b = textView2;
    }
}
