package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
/* loaded from: classes4.dex */
public abstract class PausingDispatcherKt$whenStateAtLeast$2 extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected hasActiveObservers ag$a;
    public final TextView ah$a;
    public final ImageView valueOf;
    public final View values;

    /* JADX INFO: Access modifiers changed from: protected */
    public PausingDispatcherKt$whenStateAtLeast$2(Object obj, View view, int i, ImageView imageView, View view2, TextView textView) {
        super(obj, view, i);
        this.valueOf = imageView;
        this.values = view2;
        this.ah$a = textView;
    }
}
