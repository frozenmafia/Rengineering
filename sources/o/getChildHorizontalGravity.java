package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.contest.ContestItemVM;
import com.dream11.design.textview.D11TextView;
/* loaded from: classes3.dex */
public abstract class getChildHorizontalGravity extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$a;
    public final D11TextView HaptikSDK$b;
    public final D11TextView ag$a;
    @androidx.databinding.Bindable
    protected ContestItemVM ah$a;
    public final D11TextView toString;
    public final ImageView valueOf;
    public final D11TextView values;

    public abstract void ag$a(ContestItemVM contestItemVM);

    /* JADX INFO: Access modifiers changed from: protected */
    public getChildHorizontalGravity(Object obj, View view, int i, D11TextView d11TextView, ImageView imageView, D11TextView d11TextView2, D11TextView d11TextView3, D11TextView d11TextView4, D11TextView d11TextView5) {
        super(obj, view, i);
        this.ag$a = d11TextView;
        this.valueOf = imageView;
        this.values = d11TextView2;
        this.toString = d11TextView3;
        this.HaptikSDK$a = d11TextView4;
        this.HaptikSDK$b = d11TextView5;
    }
}
