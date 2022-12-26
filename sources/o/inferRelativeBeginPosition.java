package o;
/* loaded from: classes3.dex */
public final class inferRelativeBeginPosition extends androidx.databinding.BaseObservable {
    private String ag$a;
    private final inferRelativeBeginPosition$ag$a ah$a;
    private androidx.databinding.ObservableField<String> toString;
    private androidx.databinding.ObservableField<String> valueOf;
    private androidx.databinding.ObservableField<Boolean> values;

    public inferRelativeBeginPosition(inferRelativeBeginPosition$ag$a inferrelativebeginposition_ag_a) {
        runAnimators.ag$a(inferrelativebeginposition_ag_a, "handler");
        this.ah$a = inferrelativebeginposition_ag_a;
        this.toString = new androidx.databinding.ObservableField<>("");
        this.ag$a = "";
        this.valueOf = new androidx.databinding.ObservableField<>("");
        this.values = new androidx.databinding.ObservableField<>(false);
    }

    public final inferRelativeBeginPosition$ag$a values() {
        return this.ah$a;
    }

    public final androidx.databinding.ObservableField<String> valueOf() {
        return this.toString;
    }

    public final String ah$a() {
        return this.ag$a;
    }

    public final void toString(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.ag$a = str;
    }

    public final androidx.databinding.ObservableField<String> ag$a() {
        return this.valueOf;
    }

    public final androidx.databinding.ObservableField<Boolean> HaptikSDK$a() {
        return this.values;
    }
}
