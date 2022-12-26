package o;
/* loaded from: classes3.dex */
public final class createVerticalChain extends androidx.databinding.BaseObservable {
    private String HaptikSDK$a;
    private String HaptikSDK$b;
    private androidx.databinding.ObservableArrayList<applyToWithoutCustom> ag$a;
    private String ah$a;
    private androidx.databinding.ObservableField<Boolean> toString;
    private String valueOf;
    private constrainedWidth values;

    public createVerticalChain(constrainedWidth constrainedwidth) {
        runAnimators.ag$a(constrainedwidth, "iOffersDetailsHandler");
        this.values = constrainedwidth;
        this.HaptikSDK$b = "";
        this.ah$a = "";
        this.HaptikSDK$a = "";
        this.valueOf = "";
        this.ag$a = new androidx.databinding.ObservableArrayList<>();
        this.toString = new androidx.databinding.ObservableField<>(false);
    }

    public final constrainedWidth valueOf() {
        return this.values;
    }

    public final String invoke() {
        return this.HaptikSDK$b;
    }

    public final void values(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.HaptikSDK$b = str;
    }

    public final String ag$a() {
        return this.ah$a;
    }

    public final void valueOf(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.ah$a = str;
    }

    public final String HaptikSDK$a() {
        return this.HaptikSDK$a;
    }

    public final void ag$a(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.HaptikSDK$a = str;
    }

    public final void toString(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.valueOf = str;
    }

    public final String values() {
        return this.valueOf;
    }

    public final androidx.databinding.ObservableArrayList<applyToWithoutCustom> ah$a() {
        return this.ag$a;
    }

    public final androidx.databinding.ObservableField<Boolean> HaptikSDK$c() {
        return this.toString;
    }
}
