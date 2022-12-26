package o;

import android.view.View;
import android.widget.ImageView;
import com.app.dream11.teamselection.newcreateteam.LineupStatusComponent;
import com.app.dream11.ui.CustomTextView;
import com.facebook.shimmer.ShimmerFrameLayout;
/* loaded from: classes2.dex */
public abstract class setPrompt extends androidx.databinding.ViewDataBinding {
    public final ShimmerFrameLayout HaptikSDK$a;
    public final View HaptikSDK$b;
    @androidx.databinding.Bindable
    protected toLocusIdCompat HaptikSDK$c;
    public final CustomTextView HaptikSDK$d;
    public final CustomTextView HaptikSDK$e;
    public final CustomTextView HaptikWebView;
    public final androidx.constraintlayout.widget.Barrier ag$a;
    public final androidx.constraintlayout.widget.Group ah$a;
    @androidx.databinding.Bindable
    protected Boolean ah$b;
    public final CustomTextView aj$a;
    public final CustomTextView getInitSettings;
    public final CustomTextView getSignupData;
    public final LineupStatusComponent invoke;
    public final CustomTextView onXdkEvent;
    public final View toString;
    public final ImageView valueOf;
    public final androidx.constraintlayout.widget.Barrier values;

    public abstract void ag$a(Boolean bool);

    public abstract void toString(toLocusIdCompat tolocusidcompat);

    /* JADX INFO: Access modifiers changed from: protected */
    public setPrompt(Object obj, View view, int i, androidx.constraintlayout.widget.Barrier barrier, androidx.constraintlayout.widget.Barrier barrier2, ImageView imageView, View view2, androidx.constraintlayout.widget.Group group, ShimmerFrameLayout shimmerFrameLayout, View view3, LineupStatusComponent lineupStatusComponent, CustomTextView customTextView, CustomTextView customTextView2, CustomTextView customTextView3, CustomTextView customTextView4, CustomTextView customTextView5, CustomTextView customTextView6, CustomTextView customTextView7) {
        super(obj, view, i);
        this.ag$a = barrier;
        this.values = barrier2;
        this.valueOf = imageView;
        this.toString = view2;
        this.ah$a = group;
        this.HaptikSDK$a = shimmerFrameLayout;
        this.HaptikSDK$b = view3;
        this.invoke = lineupStatusComponent;
        this.HaptikSDK$d = customTextView;
        this.getInitSettings = customTextView2;
        this.HaptikWebView = customTextView3;
        this.HaptikSDK$e = customTextView4;
        this.getSignupData = customTextView5;
        this.aj$a = customTextView6;
        this.onXdkEvent = customTextView7;
    }
}
