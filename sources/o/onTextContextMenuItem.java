package o;

import android.view.View;
import android.widget.ImageView;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes2.dex */
public abstract class onTextContextMenuItem extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$a;
    public final D11TextView HaptikSDK$b;
    public final D11TextView HaptikSDK$c;
    public final ImageView HaptikSDK$e;
    public final View HaptikWebView;
    @androidx.databinding.Bindable
    protected onShortcutUpdated ag$a;
    public final ImageView ah$a;
    public final D11TextView ah$b;
    public final View getInitSettings;
    public final androidx.appcompat.widget.AppCompatImageView invoke;
    public final ImageView toString;
    public final D11TextView valueOf;
    public final D11TextView values;

    /* JADX INFO: Access modifiers changed from: protected */
    public onTextContextMenuItem(Object obj, View view, int i, ImageView imageView, D11TextView d11TextView, D11TextView d11TextView2, ImageView imageView2, androidx.appcompat.widget.AppCompatImageView appCompatImageView, D11TextView d11TextView3, D11TextView d11TextView4, D11TextView d11TextView5, D11TextView d11TextView6, ImageView imageView3, View view2, View view3) {
        super(obj, view, i);
        this.ah$a = imageView;
        this.values = d11TextView;
        this.valueOf = d11TextView2;
        this.toString = imageView2;
        this.invoke = appCompatImageView;
        this.HaptikSDK$b = d11TextView3;
        this.HaptikSDK$a = d11TextView4;
        this.HaptikSDK$c = d11TextView5;
        this.ah$b = d11TextView6;
        this.HaptikSDK$e = imageView3;
        this.getInitSettings = view2;
        this.HaptikWebView = view3;
    }
}
