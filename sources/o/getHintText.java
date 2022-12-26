package o;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.app.dream11.teamselection.newcreateteam.LineupStatusComponent;
import com.app.dream11.teamselection.playerinfo.PlayerStatisticsTableView;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes2.dex */
public abstract class getHintText extends androidx.databinding.ViewDataBinding {
    public final PlayerStatisticsTableView HaptikSDK$a;
    public final LineupStatusComponent HaptikSDK$b;
    public final LinearLayout HaptikSDK$c;
    public final CustomTextView HaptikSDK$d;
    public final CustomTextView HaptikSDK$e;
    public final CustomTextView HaptikWebView;
    public final androidx.constraintlayout.widget.ConstraintLayout ag$a;
    public final LinearLayout ah$a;
    @androidx.databinding.Bindable
    protected modeToMode ah$b;
    public final CustomTextView getInitSettings;
    public final CustomTextView getSignupData;
    public final androidx.appcompat.widget.AppCompatImageView invoke;
    public final androidx.appcompat.widget.AppCompatImageView toString;
    public final FrameLayout valueOf;
    public final LinearLayout values;

    /* JADX INFO: Access modifiers changed from: protected */
    public getHintText(Object obj, View view, int i, FrameLayout frameLayout, androidx.appcompat.widget.AppCompatImageView appCompatImageView, LinearLayout linearLayout, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, androidx.appcompat.widget.AppCompatImageView appCompatImageView2, PlayerStatisticsTableView playerStatisticsTableView, LineupStatusComponent lineupStatusComponent, CustomTextView customTextView, CustomTextView customTextView2, CustomTextView customTextView3, CustomTextView customTextView4, CustomTextView customTextView5) {
        super(obj, view, i);
        this.valueOf = frameLayout;
        this.toString = appCompatImageView;
        this.values = linearLayout;
        this.ag$a = constraintLayout;
        this.ah$a = linearLayout2;
        this.HaptikSDK$c = linearLayout3;
        this.invoke = appCompatImageView2;
        this.HaptikSDK$a = playerStatisticsTableView;
        this.HaptikSDK$b = lineupStatusComponent;
        this.HaptikSDK$e = customTextView;
        this.getInitSettings = customTextView2;
        this.getSignupData = customTextView3;
        this.HaptikWebView = customTextView4;
        this.HaptikSDK$d = customTextView5;
    }
}
