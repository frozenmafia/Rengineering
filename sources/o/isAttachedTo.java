package o;

import android.view.View;
import android.widget.TextView;
/* loaded from: classes4.dex */
public abstract class isAttachedTo extends androidx.databinding.ViewDataBinding {
    public final View HaptikSDK$a;
    public final TextView ag$a;
    public final androidx.appcompat.widget.AppCompatImageView ah$a;
    @androidx.databinding.Bindable
    protected LifecycleRegistryOwner toString;
    public final TextView valueOf;
    public final TextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public isAttachedTo(Object obj, View view, int i, androidx.appcompat.widget.AppCompatImageView appCompatImageView, TextView textView, TextView textView2, TextView textView3, View view2) {
        super(obj, view, i);
        this.ah$a = appCompatImageView;
        this.values = textView;
        this.valueOf = textView2;
        this.ag$a = textView3;
        this.HaptikSDK$a = view2;
    }
}
