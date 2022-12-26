package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
/* loaded from: classes4.dex */
public abstract class activityStopped extends androidx.databinding.ViewDataBinding {
    public final TextView HaptikSDK$a;
    public final TextView HaptikSDK$b;
    public final ImageView HaptikSDK$c;
    public final TextView ag$a;
    @androidx.databinding.Bindable
    protected considerNotify$ah$a ah$a;
    public final TextView ah$b;
    public final TextView getInitSettings;
    public final TextView getSignupData;
    public final TextView invoke;
    @androidx.databinding.Bindable
    protected String toString;
    @androidx.databinding.Bindable
    protected considerNotify valueOf;
    @androidx.databinding.Bindable
    protected Integer values;

    public abstract void ah$a(Integer num);

    public abstract void ah$a(considerNotify$ah$a considernotify_ah_a);

    public abstract void toString(String str);

    public abstract void toString(considerNotify considernotify);

    /* JADX INFO: Access modifiers changed from: protected */
    public activityStopped(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, ImageView imageView, TextView textView6, TextView textView7) {
        super(obj, view, i);
        this.ag$a = textView;
        this.HaptikSDK$a = textView2;
        this.HaptikSDK$b = textView3;
        this.invoke = textView4;
        this.ah$b = textView5;
        this.HaptikSDK$c = imageView;
        this.getInitSettings = textView6;
        this.getSignupData = textView7;
    }
}
