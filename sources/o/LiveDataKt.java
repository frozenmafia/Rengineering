package o;

import android.view.View;
import android.widget.TextView;
import com.fancode.payment.GetOrdersQuery;
/* loaded from: classes4.dex */
public abstract class LiveDataKt extends androidx.databinding.ViewDataBinding {
    public final TextView HaptikSDK$a;
    public final TextView HaptikSDK$b;
    public final TextView HaptikSDK$c;
    public final TextView ag$a;
    public final androidx.appcompat.widget.AppCompatImageView ah$a;
    public final TextView ah$b;
    public final TextView invoke;
    @androidx.databinding.Bindable
    protected GetOrdersQuery.valueOf toString;
    @androidx.databinding.Bindable
    protected LifecycleRegistryOwner valueOf;
    public final androidx.appcompat.widget.AppCompatImageView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public LiveDataKt(Object obj, View view, int i, androidx.appcompat.widget.AppCompatImageView appCompatImageView, androidx.appcompat.widget.AppCompatImageView appCompatImageView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        super(obj, view, i);
        this.values = appCompatImageView;
        this.ah$a = appCompatImageView2;
        this.ag$a = textView;
        this.HaptikSDK$b = textView2;
        this.ah$b = textView3;
        this.HaptikSDK$c = textView4;
        this.invoke = textView5;
        this.HaptikSDK$a = textView6;
    }
}
