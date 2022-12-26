package o;
/* loaded from: classes3.dex */
public final class onShortcutUpdated {
    private final String HaptikSDK$a;
    private final String HaptikSDK$b;
    private final String HaptikSDK$c;
    private final boolean HaptikSDK$d;
    private final String HaptikWebView;
    private final double ag$a;
    private final androidx.databinding.ObservableField<Boolean> ah$a;
    private final String ah$b;
    private final String invoke;
    private final androidx.databinding.ObservableField<Integer> toString;
    private final int valueOf;
    private final onShortcutRemoved values;

    public onShortcutUpdated(int i, String str, String str2, String str3, String str4, double d, String str5, String str6, boolean z, onShortcutRemoved onshortcutremoved) {
        runAnimators.ag$a(str, "playerImgUrl");
        runAnimators.ag$a(str2, "playerSquadName");
        runAnimators.ag$a(str3, "playerType");
        runAnimators.ag$a(str4, "playerName");
        runAnimators.ag$a(str5, "ptsValue");
        runAnimators.ag$a(onshortcutremoved, "clickHandler");
        this.valueOf = i;
        this.HaptikSDK$b = str;
        this.ah$b = str2;
        this.HaptikSDK$c = str3;
        this.invoke = str4;
        this.ag$a = d;
        this.HaptikWebView = str5;
        this.HaptikSDK$a = str6;
        this.HaptikSDK$d = z;
        this.values = onshortcutremoved;
        this.ah$a = new androidx.databinding.ObservableField<>(true);
        this.toString = new androidx.databinding.ObservableField<>(Integer.valueOf((int) com.app.dream11Pro.R.drawable.ic_checkbox_checked_square));
    }

    public final int ag$a() {
        return this.valueOf;
    }

    public final String HaptikSDK$c() {
        return this.HaptikSDK$b;
    }

    public final String ah$b() {
        return this.ah$b;
    }

    public final String HaptikSDK$b() {
        return this.HaptikSDK$c;
    }

    public final String HaptikSDK$a() {
        return this.invoke;
    }

    public final double valueOf() {
        return this.ag$a;
    }

    public final String getInitSettings() {
        return this.HaptikWebView;
    }

    public final String invoke() {
        return this.HaptikSDK$a;
    }

    public final boolean getSignupData() {
        return this.HaptikSDK$d;
    }

    public final onShortcutRemoved values() {
        return this.values;
    }

    public final androidx.databinding.ObservableField<Boolean> HaptikSDK$e() {
        return this.ah$a;
    }

    public final androidx.databinding.ObservableField<Integer> ah$a() {
        return this.toString;
    }
}
