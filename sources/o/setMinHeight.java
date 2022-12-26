package o;
/* loaded from: classes3.dex */
public final class setMinHeight {
    private final String HaptikSDK$a;
    private final androidx.databinding.ObservableField<Double> HaptikSDK$b;
    private final androidx.databinding.ObservableField<String> ag$a;
    private final enableHomeButtonByDefault ah$a;
    private final androidx.databinding.ObservableField<Boolean> toString;
    private final androidx.databinding.ObservableField<String> valueOf;
    private final int values;

    public setMinHeight(int i, double d, String str, enableHomeButtonByDefault enablehomebuttonbydefault, String str2) {
        runAnimators.ag$a(enablehomebuttonbydefault, "resourceProvider");
        runAnimators.ag$a(str2, "text");
        this.values = i;
        this.ah$a = enablehomebuttonbydefault;
        this.HaptikSDK$a = str2;
        this.HaptikSDK$b = new androidx.databinding.ObservableField<>(Double.valueOf(d));
        this.ag$a = new androidx.databinding.ObservableField<>(str2);
        this.valueOf = new androidx.databinding.ObservableField<>(str);
        this.toString = new androidx.databinding.ObservableField<>(false);
    }

    public final int ah$a() {
        return this.values;
    }

    public /* synthetic */ setMinHeight(int i, double d, String str, enableHomeButtonByDefault enablehomebuttonbydefault, String str2, int i2, getTargetTypes gettargettypes) {
        this(i, d, str, enablehomebuttonbydefault, (i2 & 16) != 0 ? setOffset.ag$a(d) : str2);
    }

    public final androidx.databinding.ObservableField<Double> ag$a() {
        return this.HaptikSDK$b;
    }

    public final androidx.databinding.ObservableField<String> values() {
        return this.ag$a;
    }

    public final androidx.databinding.ObservableField<String> valueOf() {
        return this.valueOf;
    }

    public final androidx.databinding.ObservableField<Boolean> HaptikSDK$c() {
        return this.toString;
    }

    public boolean equals(Object obj) {
        if (obj instanceof setMinHeight) {
            setMinHeight setminheight = (setMinHeight) obj;
            return runAnimators.valueOf(this.HaptikSDK$b.get(), setminheight.HaptikSDK$b.get()) && this.values == setminheight.values;
        }
        return super.equals(obj);
    }

    public int hashCode() {
        return (this.values * 31) + this.HaptikSDK$b.hashCode();
    }
}
