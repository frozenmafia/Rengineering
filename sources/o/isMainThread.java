package o;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.app.dream11.contest.ContestItemVM;
import com.app.dream11.ui.CustomStrikeTextView;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.DreamSlantProgressbar;
/* loaded from: classes3.dex */
public abstract class isMainThread extends androidx.databinding.ViewDataBinding {
    public final LinearLayout HaptikSDK$a;
    public final CustomStrikeTextView HaptikSDK$b;
    public final CustomTextView HaptikSDK$c;
    public final CustomTextView HaptikSDK$d;
    public final CustomTextView HaptikSDK$e;
    public final CustomTextView HaptikWebView;
    public final LinearLayout ag$a;
    public final LinearLayout ah$a;
    public final DreamSlantProgressbar ah$b;
    public final CustomTextView getInitSettings;
    public final CustomTextView getSignupData;
    public final LinearLayout invoke;
    public final RelativeLayout toString;
    public final CustomTextView valueOf;
    @androidx.databinding.Bindable
    protected ContestItemVM values;

    public abstract void ah$a(ContestItemVM contestItemVM);

    /* JADX INFO: Access modifiers changed from: protected */
    public isMainThread(Object obj, View view, int i, CustomTextView customTextView, LinearLayout linearLayout, LinearLayout linearLayout2, RelativeLayout relativeLayout, DreamSlantProgressbar dreamSlantProgressbar, LinearLayout linearLayout3, LinearLayout linearLayout4, CustomStrikeTextView customStrikeTextView, CustomTextView customTextView2, CustomTextView customTextView3, CustomTextView customTextView4, CustomTextView customTextView5, CustomTextView customTextView6, CustomTextView customTextView7) {
        super(obj, view, i);
        this.valueOf = customTextView;
        this.ah$a = linearLayout;
        this.ag$a = linearLayout2;
        this.toString = relativeLayout;
        this.ah$b = dreamSlantProgressbar;
        this.invoke = linearLayout3;
        this.HaptikSDK$a = linearLayout4;
        this.HaptikSDK$b = customStrikeTextView;
        this.HaptikSDK$c = customTextView2;
        this.HaptikSDK$e = customTextView3;
        this.HaptikSDK$d = customTextView4;
        this.HaptikWebView = customTextView5;
        this.getSignupData = customTextView6;
        this.getInitSettings = customTextView7;
    }
}
