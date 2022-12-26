package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class drawVerticalDivider extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$a;
    public final ToolbarWidgetWrapper HaptikSDK$b;
    public final ImageView ag$a;
    public final androidx.appcompat.widget.LinearLayoutCompat ah$a;
    public final View ah$b;
    public final View invoke;
    public final ScrollView toString;
    @androidx.databinding.Bindable
    protected createVerticalChain valueOf;
    public final D11TextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public drawVerticalDivider(Object obj, View view, int i, ImageView imageView, androidx.appcompat.widget.LinearLayoutCompat linearLayoutCompat, ScrollView scrollView, D11TextView d11TextView, D11TextView d11TextView2, View view2, View view3, ToolbarWidgetWrapper toolbarWidgetWrapper) {
        super(obj, view, i);
        this.ag$a = imageView;
        this.ah$a = linearLayoutCompat;
        this.toString = scrollView;
        this.values = d11TextView;
        this.HaptikSDK$a = d11TextView2;
        this.invoke = view2;
        this.ah$b = view3;
        this.HaptikSDK$b = toolbarWidgetWrapper;
    }
}
