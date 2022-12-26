package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.ui.CountDownTimerTextView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes3.dex */
public abstract class cancelPendingShow extends androidx.databinding.ViewDataBinding {
    public final ImageView ag$a;
    public final ImageView ah$a;
    public final CountDownTimerTextView ah$b;
    public final D11TextView toString;
    @androidx.databinding.Bindable
    protected setChildrenConstraints valueOf;
    public final D11TextView values;

    public abstract void valueOf(setChildrenConstraints setchildrenconstraints);

    /* JADX INFO: Access modifiers changed from: protected */
    public cancelPendingShow(Object obj, View view, int i, ImageView imageView, ImageView imageView2, D11TextView d11TextView, D11TextView d11TextView2, CountDownTimerTextView countDownTimerTextView) {
        super(obj, view, i);
        this.ag$a = imageView;
        this.ah$a = imageView2;
        this.values = d11TextView;
        this.toString = d11TextView2;
        this.ah$b = countDownTimerTextView;
    }
}
