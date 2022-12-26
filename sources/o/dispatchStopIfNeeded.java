package o;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
/* loaded from: classes4.dex */
public abstract class dispatchStopIfNeeded extends androidx.databinding.ViewDataBinding {
    @androidx.databinding.Bindable
    protected observe$ag$a HaptikSDK$a;
    @androidx.databinding.Bindable
    protected observe HaptikSDK$b;
    public final Button HaptikSDK$c;
    public final TextView HaptikSDK$d;
    public final TextView HaptikSDK$e;
    public final TextView HaptikWebView;
    public final TextView a;
    public final TextView ag$a;
    public final TextView ah$a;
    public final TextView ah$b;
    public final androidx.constraintlayout.widget.ConstraintLayout aj$a;
    public final androidx.constraintlayout.widget.ConstraintLayout ak;
    public final TextView ak$b;
    public final TextView getInitSettings;
    public final TextView getSignupData;
    public final TextView invoke;
    public final androidx.cardview.widget.CardView isLogoutPending;
    public final ImageView onXdkEvent;
    public final TextView toString;
    public final View valueOf;
    public final TextView values;

    public abstract void ag$a(observe observeVar);

    public abstract void toString(observe$ag$a observe_ag_a);

    /* JADX INFO: Access modifiers changed from: protected */
    public dispatchStopIfNeeded(Object obj, View view, int i, TextView textView, TextView textView2, View view2, TextView textView3, TextView textView4, Button button, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, androidx.constraintlayout.widget.ConstraintLayout constraintLayout2, TextView textView12, androidx.cardview.widget.CardView cardView, ImageView imageView, TextView textView13) {
        super(obj, view, i);
        this.toString = textView;
        this.ag$a = textView2;
        this.valueOf = view2;
        this.ah$a = textView3;
        this.values = textView4;
        this.HaptikSDK$c = button;
        this.invoke = textView5;
        this.ah$b = textView6;
        this.getSignupData = textView7;
        this.HaptikSDK$e = textView8;
        this.HaptikWebView = textView9;
        this.getInitSettings = textView10;
        this.HaptikSDK$d = textView11;
        this.ak = constraintLayout;
        this.aj$a = constraintLayout2;
        this.a = textView12;
        this.isLogoutPending = cardView;
        this.onXdkEvent = imageView;
        this.ak$b = textView13;
    }
}
