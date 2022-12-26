package o;

import com.app.dream11.ui.FanCodeWatchLiveVm$onFanCodeClick$1;
import o.Styleable;
/* loaded from: classes3.dex */
public final class setDynamicShortcuts extends androidx.databinding.BaseObservable {
    private final Styleable.ArcMotion<setAnimationMatrix> HaptikSDK$c;
    @androidx.databinding.Bindable
    private String ag$a;
    private getShortcutInfoWithLowestRank ah$a;
    @androidx.databinding.Bindable
    private boolean toString;
    @androidx.databinding.Bindable
    private String valueOf;
    @androidx.databinding.Bindable
    private String values;

    public setDynamicShortcuts(getShortcutInfoWithLowestRank getshortcutinfowithlowestrank) {
        runAnimators.ag$a(getshortcutinfowithlowestrank, "clickListener");
        this.ah$a = getshortcutinfowithlowestrank;
        this.HaptikSDK$c = new FanCodeWatchLiveVm$onFanCodeClick$1(this);
    }

    public final getShortcutInfoWithLowestRank ah$a() {
        return this.ah$a;
    }

    public final String valueOf() {
        return this.values;
    }

    public final void toString(String str) {
        this.values = str;
        notifyPropertyChanged(154);
    }

    public final String HaptikSDK$a() {
        return this.ag$a;
    }

    public final void values(String str) {
        this.ag$a = str;
        notifyPropertyChanged(208);
    }

    public final String values() {
        return this.valueOf;
    }

    public final void ag$a(String str) {
        this.valueOf = str;
        notifyPropertyChanged(70);
    }

    public final boolean ag$a() {
        return this.toString;
    }

    public final void ag$a(boolean z) {
        this.toString = z;
        notifyPropertyChanged(107);
    }

    public final Styleable.ArcMotion<setAnimationMatrix> invoke() {
        return this.HaptikSDK$c;
    }

    public final void ag$a(String str, String str2, String str3) {
        toString(str);
        values(str2);
        ag$a(str3);
    }
}
