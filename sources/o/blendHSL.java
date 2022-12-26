package o;

import com.app.dream11.ui.databinding.RxObservableField;
/* loaded from: classes3.dex */
public final class blendHSL extends androidx.databinding.BaseObservable {
    private final RxObservableField<String> HaptikSDK$c;
    private final RxObservableField<String> ag$a;
    private final androidx.databinding.ObservableField<Boolean> ah$a;
    private final RGBToHSL toString;
    private final androidx.databinding.ObservableField<Boolean> valueOf;
    private final RxObservableField<String> values;

    public blendHSL(RGBToHSL rGBToHSL) {
        runAnimators.ag$a(rGBToHSL, "iMobileHandler");
        this.toString = rGBToHSL;
        this.values = new RxObservableField<>("");
        this.ag$a = new RxObservableField<>("");
        this.valueOf = new androidx.databinding.ObservableField<>(true);
        this.ah$a = new androidx.databinding.ObservableField<>(false);
        this.HaptikSDK$c = new RxObservableField<>("");
    }

    public final RGBToHSL ag$a() {
        return this.toString;
    }

    public final RxObservableField<String> ah$b() {
        return this.values;
    }

    public final RxObservableField<String> valueOf() {
        return this.ag$a;
    }

    public final androidx.databinding.ObservableField<Boolean> ah$a() {
        return this.valueOf;
    }

    public final androidx.databinding.ObservableField<Boolean> values() {
        return this.ah$a;
    }

    public final RxObservableField<String> invoke() {
        return this.HaptikSDK$c;
    }
}
