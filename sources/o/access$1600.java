package o;
/* loaded from: classes3.dex */
public final class access$1600 {
    private final androidx.databinding.ObservableField<Integer> HaptikSDK$a;
    private final androidx.databinding.ObservableField<String> HaptikSDK$b;
    private final androidx.databinding.ObservableField<String> ag$a;
    private final access$1600$ah$a ah$a;
    private final androidx.databinding.ObservableField<String> invoke;
    private final androidx.databinding.ObservableField<Boolean> toString;
    private final androidx.databinding.ObservableField<Boolean> valueOf;
    private final androidx.databinding.ObservableField<String> values;

    public access$1600(access$1600$ah$a access_1600_ah_a) {
        runAnimators.ag$a(access_1600_ah_a, "handler");
        this.ah$a = access_1600_ah_a;
        this.valueOf = new androidx.databinding.ObservableField<>(false);
        this.values = new androidx.databinding.ObservableField<>("");
        this.HaptikSDK$a = new androidx.databinding.ObservableField<>(0);
        this.HaptikSDK$b = new androidx.databinding.ObservableField<>("");
        this.invoke = new androidx.databinding.ObservableField<>("");
        this.ag$a = new androidx.databinding.ObservableField<>("#f4f9ff");
        this.toString = new androidx.databinding.ObservableField<>(false);
    }

    public final access$1600$ah$a values() {
        return this.ah$a;
    }

    public final androidx.databinding.ObservableField<Boolean> ah$a() {
        return this.valueOf;
    }

    public final androidx.databinding.ObservableField<String> ag$a() {
        return this.values;
    }

    public final androidx.databinding.ObservableField<Integer> invoke() {
        return this.HaptikSDK$a;
    }

    public final androidx.databinding.ObservableField<String> HaptikSDK$c() {
        return this.HaptikSDK$b;
    }

    public final androidx.databinding.ObservableField<String> HaptikSDK$b() {
        return this.invoke;
    }

    public final androidx.databinding.ObservableField<String> valueOf() {
        return this.ag$a;
    }

    public final androidx.databinding.ObservableField<Boolean> ah$b() {
        return this.toString;
    }
}
