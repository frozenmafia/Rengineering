package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.core.service.graphql.api.fragment.HallOfFameMatchGFragment;
import com.dream11.design.textview.D11TextView;
import o.MapCollections;
/* loaded from: classes3.dex */
public abstract class setTitleMarginStart extends androidx.databinding.ViewDataBinding {
    public final D11TextView HaptikSDK$a;
    public final androidx.constraintlayout.widget.ConstraintLayout HaptikSDK$b;
    public final androidx.constraintlayout.widget.Guideline HaptikSDK$c;
    public final D11TextView HaptikSDK$d;
    public final D11TextView HaptikSDK$e;
    public final D11TextView HaptikWebView;
    public final D11TextView a;
    public final ImageView ag$a;
    public final androidx.constraintlayout.widget.Guideline ah$a;
    @androidx.databinding.Bindable
    protected MapCollections.KeySet ah$b;
    public final D11TextView getInitSettings;
    public final View getSignupData;
    public final D11TextView invoke;
    public final View onXdkEvent;
    public final View toString;
    public final ImageView valueOf;
    @androidx.databinding.Bindable
    protected HallOfFameMatchGFragment values;

    public abstract void ag$a(HallOfFameMatchGFragment hallOfFameMatchGFragment);

    public abstract void valueOf(MapCollections.KeySet keySet);

    /* JADX INFO: Access modifiers changed from: protected */
    public setTitleMarginStart(Object obj, View view, int i, View view2, ImageView imageView, ImageView imageView2, androidx.constraintlayout.widget.Guideline guideline, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, androidx.constraintlayout.widget.Guideline guideline2, D11TextView d11TextView, D11TextView d11TextView2, D11TextView d11TextView3, D11TextView d11TextView4, D11TextView d11TextView5, D11TextView d11TextView6, View view3, View view4, D11TextView d11TextView7) {
        super(obj, view, i);
        this.toString = view2;
        this.ag$a = imageView;
        this.valueOf = imageView2;
        this.ah$a = guideline;
        this.HaptikSDK$b = constraintLayout;
        this.HaptikSDK$c = guideline2;
        this.invoke = d11TextView;
        this.HaptikSDK$a = d11TextView2;
        this.HaptikSDK$e = d11TextView3;
        this.getInitSettings = d11TextView4;
        this.HaptikSDK$d = d11TextView5;
        this.HaptikWebView = d11TextView6;
        this.getSignupData = view3;
        this.onXdkEvent = view4;
        this.a = d11TextView7;
    }
}
