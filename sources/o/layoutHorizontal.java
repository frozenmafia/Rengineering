package o;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
/* loaded from: classes.dex */
public abstract class layoutHorizontal extends androidx.databinding.ViewDataBinding {
    public final androidx.constraintlayout.widget.Barrier HaptikSDK$a;
    public final Button HaptikSDK$b;
    public final ImageView HaptikSDK$c;
    public final ImageView HaptikSDK$d;
    public final DefaultTimeBar HaptikSDK$e;
    public final Button HaptikWebView;
    public final Button ag$a;
    public final Button ah$a;
    public final Button ah$b;
    public final FrameLayout aj$a;
    public final androidx.constraintlayout.widget.Group getInitSettings;
    public final TextView getSignupData;
    public final androidx.constraintlayout.widget.Guideline invoke;
    public final Button toString;
    public final Button valueOf;
    public final Button values;

    /* JADX INFO: Access modifiers changed from: protected */
    public layoutHorizontal(Object obj, View view, int i, Button button, Button button2, Button button3, Button button4, Button button5, Button button6, androidx.constraintlayout.widget.Guideline guideline, ImageView imageView, Button button7, androidx.constraintlayout.widget.Barrier barrier, ImageView imageView2, Button button8, androidx.constraintlayout.widget.Group group, DefaultTimeBar defaultTimeBar, TextView textView, FrameLayout frameLayout) {
        super(obj, view, i);
        this.values = button;
        this.ah$a = button2;
        this.ag$a = button3;
        this.valueOf = button4;
        this.toString = button5;
        this.HaptikSDK$b = button6;
        this.invoke = guideline;
        this.HaptikSDK$c = imageView;
        this.ah$b = button7;
        this.HaptikSDK$a = barrier;
        this.HaptikSDK$d = imageView2;
        this.HaptikWebView = button8;
        this.getInitSettings = group;
        this.HaptikSDK$e = defaultTimeBar;
        this.getSignupData = textView;
        this.aj$a = frameLayout;
    }
}
