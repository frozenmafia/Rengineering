package o;

import com.app.dream11.contest.teamcompare.selectteam.TeamToCompareItemVM$onClickTeamRow$1;
import o.Styleable;
/* loaded from: classes2.dex */
public final class calculateTwilight {
    private final Integer HaptikSDK$a;
    private final String HaptikSDK$b;
    private final boolean HaptikSDK$c;
    private final int HaptikSDK$d;
    private final String HaptikSDK$e;
    private final double HaptikWebView;
    private final boolean ag$a;
    private final double ah$a;
    private final Styleable.ArcMotion<setAnimationMatrix> ah$b;
    private final enableHomeButtonByDefault invoke;
    private boolean toString;
    private boolean valueOf;
    private valueOf values;

    /* loaded from: classes2.dex */
    public interface valueOf {
        void toString(calculateTwilight calculatetwilight);
    }

    public calculateTwilight(int i, Integer num, double d, enableHomeButtonByDefault enablehomebuttonbydefault, boolean z) {
        runAnimators.ag$a(enablehomebuttonbydefault, "resourceProvider");
        this.HaptikSDK$d = i;
        this.HaptikSDK$a = num;
        this.HaptikWebView = d;
        this.invoke = enablehomebuttonbydefault;
        this.ag$a = z;
        this.HaptikSDK$e = enablehomebuttonbydefault.valueOf(com.app.dream11Pro.R.string.res_0x7f120c89, Integer.valueOf(i));
        this.ah$a = Math.abs(d);
        this.HaptikSDK$b = num == null ? null : enablehomebuttonbydefault.valueOf(com.app.dream11Pro.R.string.res_0x7f1205b6, Integer.valueOf(num.intValue()));
        this.HaptikSDK$c = num != null;
        this.valueOf = true;
        this.ah$b = new TeamToCompareItemVM$onClickTeamRow$1(this);
    }

    public final double HaptikSDK$a() {
        return this.HaptikWebView;
    }

    public final int ah$b() {
        return this.HaptikSDK$d;
    }

    public final boolean getSignupData() {
        return this.ag$a;
    }

    public final Integer valueOf() {
        return this.HaptikSDK$a;
    }

    public final String HaptikSDK$c() {
        return this.HaptikSDK$e;
    }

    public final double ah$a() {
        return this.ah$a;
    }

    public final String HaptikSDK$b() {
        return this.HaptikSDK$b;
    }

    public final boolean invoke() {
        return this.HaptikSDK$c;
    }

    public final void valueOf(boolean z) {
        this.toString = z;
    }

    public final void ag$a(valueOf valueof) {
        this.values = valueof;
    }

    public final valueOf values() {
        return this.values;
    }

    public final boolean HaptikWebView() {
        return this.valueOf;
    }

    public final void ah$a(boolean z) {
        this.valueOf = z;
    }

    public final int HaptikSDK$e() {
        return !this.valueOf ? this.invoke.ag$a(com.app.dream11Pro.R.color.d11_color_text__neutralLighter) : this.toString ? this.invoke.ag$a(com.app.dream11Pro.R.color.d11_color_text__positiveMedium) : this.invoke.ag$a(com.app.dream11Pro.R.color.d11_color_text__neutralDarkest);
    }

    public final Styleable.ArcMotion<setAnimationMatrix> ag$a() {
        return this.ah$b;
    }
}
