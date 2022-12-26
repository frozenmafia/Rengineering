package o;

import com.app.dream11.ui.databinding.RxObservableField;
import o.C0361autoTransition;
/* loaded from: classes3.dex */
public final class createFromXml {
    private final C0361autoTransition.values HaptikSDK$b;
    private final toString ag$a;
    private final String ah$a;
    private final boolean toString;
    private final RxObservableField<Boolean> valueOf;
    private final int values;

    /* loaded from: classes3.dex */
    public interface toString {
        void onPageSelected(int i);
    }

    public createFromXml(int i, toString tostring, String str, boolean z, C0361autoTransition.values valuesVar) {
        runAnimators.ag$a(str, "lottieFileName");
        runAnimators.ag$a(valuesVar, "pagerAnimationData");
        this.values = i;
        this.ag$a = tostring;
        this.ah$a = str;
        this.toString = z;
        this.HaptikSDK$b = valuesVar;
        this.valueOf = new RxObservableField<>(null, 1, null);
    }

    public /* synthetic */ createFromXml(int i, toString tostring, String str, boolean z, C0361autoTransition.values valuesVar, int i2, getTargetTypes gettargettypes) {
        this(i, (i2 & 2) != 0 ? null : tostring, (i2 & 4) != 0 ? "splash_to_mobile_en.json" : str, (i2 & 8) != 0 ? false : z, valuesVar);
    }

    public final int ag$a() {
        return this.values;
    }

    public final toString values() {
        return this.ag$a;
    }

    public final String ah$a() {
        return this.ah$a;
    }

    public final C0361autoTransition.values ah$b() {
        return this.HaptikSDK$b;
    }

    public final RxObservableField<Boolean> valueOf() {
        return this.valueOf;
    }
}
