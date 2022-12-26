package o;

import com.app.dream11.ui.BlueTooltipVM$onCloseClicked$1;
import o.Styleable;
/* loaded from: classes3.dex */
public final class setIntents extends androidx.databinding.BaseObservable {
    private final Styleable.ArcMotion<setAnimationMatrix> ag$a;
    @androidx.databinding.Bindable
    private boolean ah$a;
    private final String invoke;
    private final int toString;
    private final setIntents$ag$a valueOf;
    private final String values;

    public setIntents(int i, String str, String str2, setIntents$ag$a setintents_ag_a) {
        runAnimators.ag$a(str, "titleString");
        runAnimators.ag$a(str2, "subtitleString");
        runAnimators.ag$a(setintents_ag_a, "clickHandler");
        this.toString = i;
        this.invoke = str;
        this.values = str2;
        this.valueOf = setintents_ag_a;
        this.ag$a = new BlueTooltipVM$onCloseClicked$1(this);
    }

    public final String HaptikSDK$b() {
        return this.invoke;
    }

    public final String HaptikSDK$c() {
        return this.values;
    }

    public final int ah$a() {
        return this.toString;
    }

    public final setIntents$ag$a values() {
        return this.valueOf;
    }

    public final boolean valueOf() {
        return this.ah$a;
    }

    public final void toString(boolean z) {
        this.ah$a = z;
        notifyPropertyChanged(394);
    }

    public final Styleable.ArcMotion<setAnimationMatrix> ag$a() {
        return this.ag$a;
    }
}
