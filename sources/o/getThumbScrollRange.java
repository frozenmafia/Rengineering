package o;

import android.view.View;
import android.widget.LinearLayout;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class getThumbScrollRange extends androidx.databinding.ViewDataBinding {
    public final D11TextView ag$a;
    @androidx.databinding.Bindable
    protected kotlin.Pair<String, String> ah$a;
    public final LinearLayout toString;
    public final D11TextView valueOf;

    public abstract void valueOf(kotlin.Pair<String, String> pair);

    /* JADX INFO: Access modifiers changed from: protected */
    public getThumbScrollRange(Object obj, View view, int i, LinearLayout linearLayout, D11TextView d11TextView, D11TextView d11TextView2) {
        super(obj, view, i);
        this.toString = linearLayout;
        this.valueOf = d11TextView;
        this.ag$a = d11TextView2;
    }
}
